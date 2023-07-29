import com.itheima.config.SpringConfig;
import com.itheima.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(SpringConfig.class);
        UserController userController = ctx.getBean(UserController.class);
        System.out.println(userController);
    }
}
