package com.driver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

        @Autowired
        BookRepository bookRepository;

        public Book createBook(Book book){

            return bookRepository.createBook(book);
        }

        public Book getBookById(String id){

            return bookRepository.getBookById(Integer.parseInt(id));
        }

        public void deleteBookById(String id){

            bookRepository.deleteBookById(Integer.parseInt(id));
        }

        public List<Book> getAllBooks(){

            return bookRepository.findAll();
        }

        public void deleteAllBooks(){

            bookRepository.deleteAll();
        }

        public List<Book> getBooksByAuthor(String author){

            return bookRepository.findBooksByAuthor(author);
        }

        public List<Book> getBooksByGenre(String genre){

            return bookRepository.findBooksByGenre(genre);
        }
    }

