package com.how2java.service.Impl;

import com.how2java.beans.Book;
import com.how2java.dao.BookDao;
import com.how2java.service.BookService;

import java.util.List;

/**
 * @author lihoo
 * @Title: BookServiceImpl
 * @ProjectName spring
 * @Description: TODO
 * @date 2018/7/16-9:42
 */


public class BookServiceImpl implements BookService {

    //植入dao接口
    private BookDao dao;

    //调用dao中的方法
    public int addBook(Book book) {
        return dao.addBook(book);
    }

    public List<Book> booklist() {
        return dao.booklist();
    }

    public int updateBook(Book book) {
        return dao.updateBook(book);
    }

    public int deleteBook(Book book) {
        return dao.deleteBook(book);
    }

    public String bookNameOfId(Book book) {
        return dao.bookNameOfId(book);
    }

    public Book bookOfId(Book book) {
        return dao.bookOfId(book);
    }

    public BookDao getDao() {
        return dao;
    }

    public void setDao(BookDao dao) {
        this.dao = dao;
    }
}
