package com.how2java.util;

///RowMapper可以将数据中的每一行封装成用户定义的类，
//在数据库查询中，如果返回的类型是用户自定义的类型则需要包装，则可以包装成你想要的类
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.how2java.beans.Book;

/**
 * @author lihoo
 * @Title: MyRowMapper
 * @ProjectName spring
 * @Description: TODO
 * @date 2018/7/16-9:43
 */


public class MyRowMapper implements RowMapper<Book> {
    /**
     * 封装成Book类并返回
     * rs:代表单行数据
     * rowNum:行号
     */
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
        book.setBookId(rs.getInt("bookId"));
        book.setBookName(rs.getString("bookName"));
        book.setBookPrice(rs.getInt("bookPrice"));
        return book;
    }
}
