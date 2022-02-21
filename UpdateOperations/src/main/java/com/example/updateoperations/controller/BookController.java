package com.example.updateoperations.controller;

import com.example.updateoperations.entity.BookEntity;
import com.example.updateoperations.service.BookService;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@Controller
@RestController
public class BookController {
    private  final BookService serObject;

    public BookController(BookService serObject) {
        this.serObject = serObject;
    }
    // Get All Data of repository
    @GetMapping("getAllData")
    public List<BookEntity> getAllData() {
        return serObject.allListData();
    }

    @PutMapping("updateData/{id}")
    public String updateData(@RequestBody BookEntity Book, @PathVariable("id") int Id) {
         return serObject.updateData(Book,Id);

    }
    // get specific data from database by id
    @GetMapping("getSingleData/{id}")
    public BookEntity getDataById(@RequestBody @PathVariable("id") int id){
        return serObject.getSingleData(id);
    }
   // get specific data from database by BookName;

    @GetMapping("getSingleData/{bookName}")
    public BookEntity getDataByName(@PathVariable("bookName") String BookName){
        return serObject.getSingleDataByName(BookName);
    }
}
