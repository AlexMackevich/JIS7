package by.jrr.HomeWork.Lecture6ObjectsAndClasses.Book;

import java.util.Objects;

public class Book {

    String author;
    String name;
    int numberOfSheets;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public void setNumberOfSheets(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfSheets == book.numberOfSheets && author.equals(book.author) && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, numberOfSheets);
    }

    public Book(String author, String name, int numberOfSheets) {
        this.author = author;
        this.name = name;
        this.numberOfSheets = numberOfSheets;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", numberOfSheets=" + numberOfSheets +
                '}';
    }
}
