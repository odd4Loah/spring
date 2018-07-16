package com.how2java.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.how2java.beans.Book;
import com.how2java.dao.BookDao;
import com.how2java.util.MyRowMapper;

/**
 * @author lihoo
 * @Title: BookDaoImpl
 * @ProjectName spring
 * @Description: //dao接口实现类
 *              //继承了JdbcDaoSupport类--使用getJdbcTemplate()方法
 * @date 2018/7/16-9:39
 */

//继承了JdbcDaoSupport类--使用getJdbcTemplate()方法
public class BookDaoImpl extends JdbcDaoSupport implements BookDao {

    public int addBook(Book book) {
        // 增删改用update
        String sql = "insert into book(bookId, bookName, bookPrice) values (?,?,?)";
        int count = this.getJdbcTemplate().update(sql, book.getBookId(), book.getBookName(), book.getBookPrice());
        return count;
    }

    public List<Book> booklist() {
        String sql = "select * from book";
        List<Book> list = this.getJdbcTemplate().query(sql, new MyRowMapper());//在util里面
        return list;
    }

    public int updateBook(Book book) {
        // 增删改用update
        String sql = "update book set bookName=?, bookPrice=? where bookId=?";
        int count = this.getJdbcTemplate().update(sql, book.getBookName(), book.getBookPrice(), book.getBookId());
        return count;
    }

    public int deleteBook(Book book) {
        String sql = "delete from book where bookId=?";
        int count = this.getJdbcTemplate().update(sql,book.getBookId());
        return count;
    }

    public String bookNameOfId(Book book) {
        String sql = "select * from book where bookId=?";
        List<Book> list = this.getJdbcTemplate().query(sql, new MyRowMapper(), book.getBookId());
        return list.get(0).getBookName();
    }

    public Book bookOfId(Book book) {
        String sql = "select * from book where bookId=?";
        Book mybook = this.getJdbcTemplate().queryForObject(sql,
                new BeanPropertyRowMapper<Book>(Book.class), book.getBookId());
        return mybook;
    }

}
