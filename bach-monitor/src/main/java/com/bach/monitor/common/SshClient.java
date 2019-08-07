package com.bach.monitor.common;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;
import com.bach.monitor.alarm.baseinfo.entity.*;
import com.bach.monitor.alarm.baseinfo.handler.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SshClient {
    private static Logger log = LoggerFactory.getLogger(SshClient.class);

    String hostname = "10.4.16.189";
    String username = "ogg";
    String password = "ogg@123";

    //    String hostname = "10.7.91.104";
//    String username = "root";
//    String password = "abcd@1234";
//
    public SshClient(String hostname, String username, String password) {
        this.hostname = hostname;
        this.username = username;
        this.password = password;
    }

    public <T extends AlarmEntity, H extends AlarmEntityHandler<T>> T executeSshCmd(T entity, H handler) {
        try {
            /* Create a connection instance */
            Connection conn = new Connection(hostname);

            /* Now connect */
            conn.connect();

            /* Authenticate.
             * If you get an IOException saying something like
             * "Authentication method password not supported by the server at this stage."
             * then please check the FAQ.
             */

            boolean isAuthenticated = conn.authenticateWithPassword(username, password);

            if (isAuthenticated == false)
                throw new IOException("Authentication failed.");

            /* Create a session */

            Session sess = conn.openSession();

            //sess.execCommand("cat /proc/meminfo");
            String cmd = entity.getCmd();
            log.info("cmd:[{}]", cmd);
            sess.execCommand(cmd);

            InputStream stdout = new StreamGobbler(sess.getStdout());
            InputStream stderr = new StreamGobbler(sess.getStderr());

            BufferedReader br = new BufferedReader(new InputStreamReader(stdout));
            entity = handler.baseHandler(br, entity);
//            while (true) {
//                String line = br.readLine();
//                if (line == null)
//                    break;
//                System.out.println(line);
//                Pattern pattern = Pattern.compile("MemTotal:\\s+(\\d+) kB");
//                Matcher matcher = pattern.matcher(line);
//                if (matcher.matches()) {
//                    System.out.println(matcher.group(1));
//                }
//            }

            BufferedReader errbr = new BufferedReader(new InputStreamReader(stderr));
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                log.error("exe failed. {}", line);
            }
            br.close();
            errbr.close();
            log.debug("ExitCode:{}", sess.getExitStatus());

            /* Close this session */

            sess.close();

            /* Close the connection */

            conn.close();

            return entity;
        } catch (IOException e) {
            e.printStackTrace(System.err);
            System.exit(2);
        }
        return null;
    }

    public static void test() {

        try {
            /* Create a connection instance */
            Connection conn = new Connection("10.4.16.189");

            /* Now connect */
            conn.connect();

            /* Authenticate.
             * If you get an IOException saying something like
             * "Authentication method password not supported by the server at this stage."
             * then please check the FAQ.
             */

            boolean isAuthenticated = conn.authenticateWithPassword("ogg", "ogg@123");

            if (isAuthenticated == false)
                throw new IOException("Authentication failed.");

            /* Create a session */

            Session sess = conn.openSession();

            //sess.execCommand("cat /proc/meminfo");

            String cmd = ". ~/.bash_profile;cd " + "/opt/ogg/ogg" + ";./ggsci<<EOF\n"
                    + "info all\n"
                    + "exit\n"
                    + "EOF";
            log.info("cmd:[{}]", cmd);
            sess.execCommand(cmd);

            InputStream stdout = new StreamGobbler(sess.getStdout());
            InputStream stderr = new StreamGobbler(sess.getStderr());

            BufferedReader br = new BufferedReader(new InputStreamReader(stdout));
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                log.info(line);
            }

            BufferedReader errbr = new BufferedReader(new InputStreamReader(stderr));
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                log.error("exe failed. {}", line);
            }
            br.close();
            errbr.close();
            log.debug("ExitCode:{}", sess.getExitStatus());

            /* Close this session */

            sess.close();

            /* Close the connection */

            conn.close();


        } catch (IOException e) {
            e.printStackTrace(System.err);
            System.exit(2);
        }
    }

    public static void main(String[] args) {
        test();
//        Memory memory = new Memory();
//        MemoryHandler handler = new MemoryHandler();
//        memory = handler.getAlarm(memory);
//        System.out.println(memory);
//
//        CpuInfoHandler cpuInfoHandler = new CpuInfoHandler();
//        CpuInfo cpuInfo = new CpuInfo();
//        cpuInfo = cpuInfoHandler.getAlarm(cpuInfo);
//        System.out.println(cpuInfo);

//        UNameInfo uNameInfo = new UNameInfo();
//        UNameInfoHandler uNameInfoHandler = new UNameInfoHandler();
//        uNameInfoHandler.getAlarm(uNameInfo);
//        System.out.println(uNameInfo);

//        SpaceInfo spaceInfo = new SpaceInfo();
//        SpaceInfoHandler spaceInfoHandler = new SpaceInfoHandler();
//        spaceInfoHandler.getAlarm(spaceInfo);
//        System.out.println(spaceInfo);

//        OggStatus oggStatus = new OggStatus();
//        OggStatusHandler oggStatusHandler = new OggStatusHandler();
//        oggStatusHandler.getAlarm(oggStatus);
//        System.out.println(oggStatus);

//        OggDelay oggDelay = new OggDelay();
//        OggDelayHandler oggDelayHandler = new OggDelayHandler();
//        oggDelayHandler.getAlarm(oggDelay);
//        System.out.println(oggDelay);
    }
}
