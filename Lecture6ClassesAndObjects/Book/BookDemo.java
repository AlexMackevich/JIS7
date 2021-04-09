package by.jrr.HomeWork.Lecture6ObjectsAndClasses.Book;

import java.util.Scanner;

public class BookDemo {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Book book1 = new Book("А. Сапковский","Башня ласточки",430);
        Book book2 = new Book("А. Сапковский","Сезон гроз",365);
        Book book3 = new Book("А. Сапковский","Последнее желание",489);

        System.out.println(book1 == book1);
        System.out.println(book1 == book2);
        System.out.println(book1 == book3);

        System.out.println(book1.equals(book1));
        System.out.println(book1.equals(book2));
        System.out.println(book3.equals(book3));

    }
}
