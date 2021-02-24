import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        StringPrinter sp = new StringPrinter();
//        sp.setS("Bye world");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        System.out.println("asdfg");
        Thread.sleep(1);
        StringPrinter sp = (StringPrinter) context.getBean("strPrinter");
        sp.print();
    }
}
