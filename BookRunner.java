package com.xworkz.september.driver;

import com.xworkz.september.things.Book;

public class BookRunner {
public static void main(String args[]) {
	Book book=new Book();
	Book title=new Book("Sample book");
	Book author=new Book("Sample book","John Doe");
	Book ISBN=new Book("Sample book","John Doe",123654790l);
	Book publicationYear=new Book("Sample book","John Doe",123654790l,2022);
	Book generations=new Book("Sample book","John Doe",123654790l,2022,"13th generation");
}
}
