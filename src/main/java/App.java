import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHello1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHello1.getMessage());
        HelloWorld beanHello2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHello2.getMessage());
        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat1.getMessage());
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat2.getMessage());
        boolean compareHello = beanHello1 == beanHello2;
        System.out.println("compare hello's beans "+compareHello);
        boolean compareCat = beanCat1 == beanCat2;
        System.out.println("compare cat's beans "+compareCat);
    }
}