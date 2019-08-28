package MainModule;

import DaoCaller.daoCaller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context=new FileSystemXmlApplicationContext("ApplicationContext.xml");
        daoCaller daoCaller=(daoCaller)context.getBean("caller");
        daoCaller.callDao("oushile","123");

    }
}
