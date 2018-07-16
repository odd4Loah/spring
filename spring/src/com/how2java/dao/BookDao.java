package com.how2java.dao;


import com.how2java.beans.Book;

import java.util.List;

/**
 * @author lihoo
 * @Title: BookDao
 * @ProjectName spring
 * @Description: //dao接口
 * @date 2018/7/16-9:39
 */


public interface BookDao {
    /**
     * 新增图书
     * @param book 图书对象编号
     * @return 受影响行数
     */
    public int addBook(Book book);

    /**
     * 删除图书信息
     * @param book 要删除的图书对象编号
     * @return 受影响行数
     */
    public int deleteBook(Book book);

    /**
     * 更改图书信息
     * @param book 要更改的图书对象编号
     * @return 受影响行数
     */
    public int updateBook(Book book);

    /**
     * 查询所有图书集合
     * @return 图书集合
     */
    public List<Book> booklist();

    /**
     * 根据编号查询图书名
     * @param book 图书对象编号
     * @return 图书名
     */
    public String bookNameOfId(Book book);

    /**
     * 据编号查询图书对象
     * @param book 图书对象编号
     * @return 图书对象
     */
    public Book bookOfId(Book book);
}
