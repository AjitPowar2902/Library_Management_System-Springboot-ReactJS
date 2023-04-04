package com.example.library.service;

import java.util.List;

import com.example.library.model.Book;
import com.example.library.model.BookStatus;

public interface BookService {

	BookStatus addBook(Book book);

	List<Book> getAllBooks();

	BookStatus getBookById(int bookid);

	List<Book> getBooksByCategory(String category);

	List<Book> getBooksByAuthor(String author);

	BookStatus updateBook(Book book);

	BookStatus deleteBook(int bookid);

}
