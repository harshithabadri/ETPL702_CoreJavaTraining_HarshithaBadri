package com.evergent.library.service;
import com.evergent.library.bean.*;
import com.evergent.library.DAO.*;
public class LibraryService {
	    LibraryDAO libraryDAO = new LibraryDAO();

	    public int addBook(int bookId, String title, String author, boolean isAvailable) {
	        Book book = new Book();
	        book.setBookId(bookId);
	        book.setTitle(title);
	        book.setAuthor(author);
	        book.setAvailable(isAvailable);
	        return libraryDAO.addBook(book);
	    }

	    public Book getBook(int bookId) {
	        return libraryDAO.getBook(bookId);
	    }

	    public int updateBookAvailability(int bookId, boolean isAvailable) {
	        return libraryDAO.updateBookAvailability(bookId, isAvailable);
	    }
	}
