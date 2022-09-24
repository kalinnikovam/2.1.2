import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanHelloWorld2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBean1 = (Cat) applicationContext.getBean("cat");

        Cat catBean2 = (Cat) applicationContext.getBean("cat");

        boolean equalsHelloWorld = beanHelloWorld2 == bean;
        boolean equalsCat = catBean1 == catBean2;

        System.out.println("Сравниваем scope Singleton = " + equalsHelloWorld);
        System.out.println("Сравниваем scope Prototype = " + equalsCat);
    }
}