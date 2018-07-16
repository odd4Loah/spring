package com.how2java.test;

        import com.how2java.pojo.Category;
        import com.how2java.service.ProductService;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;
        import org.springframework.test.context.ContextConfiguration;
        import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lihoo
 * @Title: TestSpring
 * @ProjectName spring
 * @Description: test_pojo
 * @date 2018/7/15-9:51
 */


@RunWith(SpringJUnit4ClassRunner.class)      //表示这是一个Spring的测试类
@ContextConfiguration("classpath:applicationContext.xml")       //定位Spring的配置文件
public class TestSpring {
    @Autowired     //给这个测试类装配Category对象
    Category c;
    @Test     //测试逻辑，打印c对象的名称
    public void test() {
        System.out.println(c.getName());
    }

//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext(
//                new String[] { "applicationContext.xml" });
//
////        Category c = (Category) context.getBean("c");
////
////        System.out.println(c.getName());
////        System.out.println(c.getId());
////        Product p = (Product) context.getBean("p");
////
////        System.out.println(p.getName());
////        System.out.println(p.getCategory().getName());
//
//        ProductService s = (ProductService) context.getBean("s");
//        s.doSomeService();

}
