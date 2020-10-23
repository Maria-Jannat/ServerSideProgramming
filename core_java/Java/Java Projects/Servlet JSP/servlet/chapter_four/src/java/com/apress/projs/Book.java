package com.apress.projs;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private double price;
    private String url;
    TimeZone zone;

    public Book() {
    }

    public Book(String title) {
        setTitle(title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public String getUrl() {
        Calendar cal = new GregorianCalendar();
        cal.get(Calendar.HOUR_OF_DAY);
        return this.url;

    }

}
