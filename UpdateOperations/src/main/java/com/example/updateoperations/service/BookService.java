package com.example.updateoperations.service;

import com.example.updateoperations.entity.BookEntity;
import com.example.updateoperations.repository.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {
    private final BookRepo obj;
    List<BookEntity> listData ;

    public BookService(BookRepo obj) {
        this.obj = obj;
    }
    public List<BookEntity> allListData() {
        listData=obj.findAll();
        return listData;

    }

    public BookEntity updateData(BookEntity Book ,int Id){
           listData.stream().map(b->{
               if(b.getId()==Id){
                   b.setTotalPages(Book.getTotalPages());
                   b.setBookPrice(Book.getBookPrice());
                   b.setBookName(Book.getBookName());
                   b.setBookColor(Book.getBookColor());

               }
              return b;
           }).collect(Collectors.toList());

        return obj.save((BookEntity) listData);
    }

}

