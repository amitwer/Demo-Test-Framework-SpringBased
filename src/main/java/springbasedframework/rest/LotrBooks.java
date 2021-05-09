package springbasedframework.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@SuppressWarnings("unused")//supressed since this is a demonstration framework. Also, auto-generated code.
public class LotrBooks {
    @JsonProperty("docs")
    private List<Book> books;
    @JsonProperty("total")
    private int numOfBooks;
    @JsonProperty("limit")
    private int limit;
    @JsonProperty("offset")
    private int offset;
    @JsonProperty("page")
    private int page;
    @JsonProperty("pages")
    private int pages;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getNumOfBooks() {
        return numOfBooks;
    }

    public void setNumOfBooks(int numOfBooks) {
        this.numOfBooks = numOfBooks;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}