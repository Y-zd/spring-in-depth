import beans.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 *
 * @author : yanzhidong
 * @date : 2020/5/25 
 * @version : V1.0
 *
 */
public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansConfig.xml");
        TestBean bean = context.getBean(TestBean.class);
        bean.say();
        context.close();
    }
}
