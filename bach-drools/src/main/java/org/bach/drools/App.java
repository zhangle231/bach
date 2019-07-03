package org.bach.drools;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionConfiguration;
import org.kie.api.runtime.conf.TimedRuleExecutionOption;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	KieSessionConfiguration ksconf = KieServices.Factory.get().newKieSessionConfiguration();
    	ksconf.setOption( TimedRuleExecutionOption.YES );
    	
    	
//    	KieServices kieServices = KieServices.Factory.get();
    	KieServices kieServices = KieServices.get();
    	KieContainer kContainer = kieServices.getKieClasspathContainer();
    	KieSession ksession = kContainer.newKieSession("HelloWorldKS", ksconf); 
    	
    	ksession.setGlobal( "list", new ArrayList<Object>() );
    	
        final Message message = new Message();
        message.setMessage( "Hello World" );
        message.setStatus( Message.HELLO );
        ksession.insert( message );

//         and fire the rules
        ksession.fireAllRules();
    	
    	System.out.println("ok");
    }
    
    
    public static class Message {
        public static final int HELLO   = 0;
        public static final int GOODBYE = 1;

        private String          message;

        private int             status;

        public Message() {

        }

        public String getMessage() {
            return this.message;
        }

        public void setMessage(final String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(final int status) {
            this.status = status;
        }

        public static Message doSomething(Message message) {
            return message;
        }

        public boolean isSomething(String msg,
                                   List<Object> list) {
            list.add( this );
            return this.message.equals( msg );
        }
    }

}
