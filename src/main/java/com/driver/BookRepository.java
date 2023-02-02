package com.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Repository;

    @Repository
    public class BookRepository {

        public BookRepository(){

        }

        Map<Integer,Book> dB=new HashMap<>();
        private int id=1;
        public Book createBook(Book book){
            book.setId(id);
            dB.put(id,book);
            id++;
            return book;
        }

        public Book getBookById(int id){
            if(dB.containsKey(id)){
                return dB.get(id);
            }
            return null;
        }

        public List<Book> findAll(){
            List<Book>list=new ArrayList<>();
            for(int id: dB.keySet()){
                list.add(dB.get(id));
            }
            return list;
        }

        public void deleteBookById(int id){
            if(dB.containsKey(id)){
                dB.remove(id);
                return;
            }
            return;
        }

        public void deleteAll(){
            dB.clear();
            return;
        }

        public List<Book> findBooksByAuthor(String author){
            List<Book>list=new ArrayList<>();
            for(int i:dB.keySet()){
                if(dB.get(i).getAuthor().equals(author)){
                    list.add(dB.get(i));
                }
            }
            return list;
        }

        public List<Book> findBooksByGenre(String genre){
            List<Book> list=new ArrayList<>();
            for(int i:dB.keySet()){
                if(dB.get(i).getGenre().equals(genre)){
                    list.add(dB.get(i));
                }
            }
            return list;
        }
    }

