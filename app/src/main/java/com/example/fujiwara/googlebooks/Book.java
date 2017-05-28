package com.example.fujiwara.googlebooks;

public class Book {

    private String mPublisher;
    private String mIsbn13;
    private String mIsbn10;
    private int mPages;
    private String mAuthor;
    private String mDescription;

    public Book(String publisher, String isbn13, String isbn10, int pages, String author,
                String description) {
        mPublisher = publisher;
        mIsbn13 = isbn13;
        mIsbn10 = isbn10;
        mPages = pages;
        mAuthor = author;
        mDescription = description;
    }

    public String getPublisher() {
        return mPublisher;
    }

    public String getIsbn13() {
        return mIsbn13;
    }

    public String getIsbn10() {
        return mIsbn10;
    }

    public long getPages() {
        return mPages;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getAuthor() {
        return mAuthor;
    }
}

