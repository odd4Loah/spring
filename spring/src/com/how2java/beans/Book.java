package com.how2java.beans;

/**
 * @author lihoo
 * @Title: Book
 * @ProjectName spring
 * @Description: //Book实体类（Bean）
 * @date 2018/7/16-9:37
 */

//Book实体类（Bean）

public class Book {

    private Integer bookId;

    private String bookName;

    private Integer bookPrice;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Integer bookPrice) {
        this.bookPrice = bookPrice;
    }
}
