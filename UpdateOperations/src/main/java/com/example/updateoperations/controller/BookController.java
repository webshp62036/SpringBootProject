package com.example.updateoperations.controller;

import com.example.updateoperations.entity.BookEntity;
import com.example.updateoperations.service.BookService;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class BookController {
    private  final BookService serObject;

    public BookController(BookService serObject) {
        this.serObject = serObject;
    }
    @GetMapping("getData")
    public List<BookEntity> getData() {
        return serObject.allListData();
    }
    @PutMapping("updateData/{Id}")
    public BookEntity updateData(@RequestBody BookEntity Book, @PathVariable("Id") int Id) {
       return  serObject.updateData(Book,Id);
    }

}
