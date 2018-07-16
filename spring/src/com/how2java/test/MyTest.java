package com.how2java.test;

import com.how2java.beans.Book;
import com.how2java.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author lihoo
 * @Title: MyTest
 * @ProjectName spring
 * @Description: juint测试
 * @date 2018/7/16-9:42
 */


public class MyTest {
    /*
     * 新增
     */

    @Test
    public void TestAddBook() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = (BookService) ctx.getBean("service");
        Book book = new Book();
        book.setBookId(3);

        book.setBookName("论语");
        book.setBookPrice(5550);
        int addBook = service.addBook(book);
        if (addBook > 0) {
            System.out.println("新增成功！");
        }
    }

    /*
     * 删除
     */

    @Test
    public void TestDeleteBook() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = (BookService) ctx.getBean("service");
        Book book = new Book();
        book.setBookId(3);
        int count = service.deleteBook(book);
        if (count > 0) {
            System.out.println("删除成功！");
        }
    }

    /*
     * 修改
     */

    @Test
    public void TestUptateBook() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = (BookService) ctx.getBean("service");
        Book book = new Book();
        book.setBookId(3);
        book.setBookName("中庸");
        book.setBookPrice(40000);
        int count = service.updateBook(book);
        if (count > 0) {
            System.out.println("更改成功");
        }
    }

    /*
     * 查询所有图书信息
     */
    @Test
    public void TestgetAllBook() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = (BookService) ctx.getBean("service");
        List<Book> list = service.booklist();

        //for循环
//        for (int i = 0; i <list.size(); i++) {
//            System.out.println(list.get(i).getBookName());
//        }
        //for each循环
        for (Book aList : list) {
            System.out.println(aList.getBookName());
        }

    }

    /*
     * 根据编号查询图书名
     */
    @Test
    public void bookNameOfId() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = (BookService) ctx.getBean("service");
        Book book = new Book();
        book.setBookId(6);
        String nameOfId = service.bookNameOfId(book);
        System.out.println(nameOfId);
    }

    /*
     * 根据编号查询图书名
     */
    @Test
    public void bookOfId() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = (BookService) ctx.getBean("service");
        Book book = new Book();
        book.setBookId(1);
        Book book2 = service.bookOfId(book);
        System.out.println(book2.getClass());
    }
}
