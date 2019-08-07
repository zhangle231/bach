package com.bach.monitor.common;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

//import org.dom4j.Document;
//import org.dom4j.DocumentHelper;
//import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WeixinSender {

    private static final Logger log = LoggerFactory.getLogger(WeixinSender.class);

    private static String agentId = "31";
    private static String deptId = "wxca5720116876cee0";

    public static String callWeixinProcedure(String str, String user) {
        try {
            if (user == null || user.length() == 0 || str == null) {
                log.info("user:" + user + ",str:" + str);
                return null;
            }

            log.info("total user list : " + user);
            if (sendWeixinToMultiPerson(user, str) == 0)
                return "Success";
            else
                return "Failure";
        } catch (Exception e) {
            log.info("{}", e);
            return "Failure";
        }
    }

    public static int sendWeixinToMultiPerson(String userIds, String content) {
        String[] userlist = userIds.split(" ");
        for (int i = 0; i < userlist.length; i++) {
            if (sendWeixinToOnePerson(userlist[i], content) != 0)
                return -1;
        }
        return 0;
    }

    public static int sendWeixinToOnePerson(String userIds, String content) {
        try {

            URL url = new URL(
                    "http://10.2.10.43/ar-weixinq/inner/innerInterfaceAction!doStream.do");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setReadTimeout(10000);
            con.setDoOutput(true);
//            con.setRequestProperty("Pragma:", "no-cache");
            con.setRequestProperty("Cache-Control", "no-cache");
            con.setRequestProperty("Content-Type", "text/xml");
            con.setRequestProperty("Accept-Charset", "UTF-8");
            OutputStreamWriter out = new OutputStreamWriter(
                    con.getOutputStream(), "UTF-8");//
            String xmlInfo = getXmlInfo(userIds);
            xmlInfo = xmlInfo.replace("{0}", content);
            log.info("xml:{}",xmlInfo);
            out.write(xmlInfo);
            out.flush();
            out.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    con.getInputStream(), "UTF-8"));//
            StringBuffer result = new StringBuffer();
            String line = "";
            for (line = br.readLine(); line != null; line = br.readLine()) {
                result.append(line);
            }
//            Document document = DocumentHelper.parseText(result.toString());
//            Element root = document.getRootElement();
//            String ret = root.element("errcode").getText();
			log.info("{}",result);
			String ret = "0";
            log.info("send to user : " + userIds + " and return code is : "
                    + ret);
            if (ret.equals("0"))
                return 0;
            else
                return -1;
        } catch (Exception e) {
            log.info("{}", e);
            return -1;
        }
    }

    public static void writeDataFile(String file, List<String> dataList) {
        FileOutputStream outSTr = null;
        BufferedOutputStream buff = null;
        if (dataList != null && dataList.size() > 1) {
            try {
                outSTr = new FileOutputStream(new File(file), true);
                buff = new BufferedOutputStream(outSTr);

                String wholedata = "";
                for (int i = 0; i < dataList.size(); i++)
                    wholedata = wholedata + dataList.get(i) + "\n";
                if (wholedata != null) {
                    buff.write(wholedata.getBytes());
                    buff.flush();
                }
                wholedata = null;
                buff.close();
                outSTr.close();
                buff = null;
                outSTr = null;
            } catch (Exception e) {
                log.info(getExceptionInfo(e));
            }
        }
    }

    static String getExceptionInfo(Exception e) {
        try {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            return sw.toString();
        } catch (Exception e2) {
            return "bad getExceptionInfo";
        }
    }

    private static String getXmlInfo(String userIds) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        sb.append("<xml>");
        sb.append("	<Interface_Name>sendMessage</Interface_Name>");
        sb.append("	<msgId>").append("208F22B17D8DD14AE0530A042803D14A")
                .append("</msgId>");
        sb.append("	<nodeFlag>").append(deptId).append(agentId)
                .append("</nodeFlag >");
        sb.append("	<touser>").append(userIds).append("</touser>");
        sb.append("	<toparty></toparty>");
        sb.append("	<totag></totag>");
        sb.append("	<msgtype>text</msgtype>");
        sb.append("	<agentid>").append(agentId).append("</agentid>");
        sb.append("	<content><![CDATA[{0}]]></content>");
//		sb.append("	<content><{0}></content>");
        sb.append("	<safe>0</safe>");
        sb.append("	<asyncgroup></asyncgroup>");
        sb.append("	<recipientid></recipientid>");
        sb.append("</xml>");
        return sb.toString();
    }

    public static void main(String[] args) {
		WeixinSender.sendWeixinToOnePerson("AB055692", "test <a href=\"http://work.weixin.qq.com\">邮件中心视频实况</a>");
//        if (args.length != 2) {
//            System.exit(1);
//        } else {
//            if (WeixinSender.sendWeixinToOnePerson(args[0], args[1]) == 0)
//                System.exit(0);
//            else
//                System.exit(1);
//            // WeixinSender.sendWeixinToOnePerson("AB042658", "test");
//        }
    }
}