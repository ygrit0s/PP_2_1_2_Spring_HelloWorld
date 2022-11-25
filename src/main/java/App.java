import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld sameBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat anotherCatBean = (Cat) applicationContext.getBean("cat");
        System.out.println("Equality of HelloWorld beans: " + (bean == sameBean));
        System.out.println("Equality of Cat beans: " + (catBean == anotherCatBean));
//        System.out.println(bean.getMessage());
    }
}