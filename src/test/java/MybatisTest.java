import com.ccdc.hrms.security.MyRealm;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: hrms
 * @Package: PACKAGE_NAME
 * @ClassName: MybatisTest
 * @Author: zichuangshi
 * @Description:
 * @Date: 2020/9/14 13:02
 * @Version: 1.0
 */
public class MybatisTest {
    /**
     * ClassPathXmlApplicationContext：是ApplicationContext的一个实现类
     */
    private ApplicationContext ac = null;
//    ClassPathXmlApplicationContext ac = null;

    /**
     * 在所有测试方法之前执行这个标签
     */
    @Before
    public void init() {
        ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    /**
     * shiro异常调试
     */
    @Test
    public void testShiro(){
        DefaultWebSecurityManager securityManager = ac.getBean("securityManager", DefaultWebSecurityManager.class);
        System.out.println(securityManager);
        LifecycleBeanPostProcessor lifecycleBeanPostProcessor = ac.getBean("lifecycleBeanPostProcessor", LifecycleBeanPostProcessor.class);
        System.out.println("lifecycleBeanPostProcessor = " + lifecycleBeanPostProcessor);
        MyRealm myRealm = ac.getBean("myRealm", MyRealm.class);
        System.out.println("myRealm = " + myRealm);
        ShiroFilterFactoryBean shiroFilter = ac.getBean("shiroFilter", ShiroFilterFactoryBean.class);
        System.out.println("shiroFilter = " + shiroFilter);
        System.out.println("ac = " + ac);
    }
}
