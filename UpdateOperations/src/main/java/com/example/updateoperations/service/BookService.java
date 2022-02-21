package com.example.updateoperations.service;

import com.example.updateoperations.entity.BookEntity;
import com.example.updateoperations.repository.BookRepo;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

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

    public String updateData(BookEntity Book ,int Id) {
        // for successfully executing this program then first of all we have run GET() method for storing data into 'listData' variable;
          BookEntity data;
          String str = null;
          listData=obj.findAll();
          Iterator<BookEntity> it = listData.iterator();
        while (it.hasNext()) {
            data =it.next();
            if(data.getId() == Id){
                data.setTotalPages(Book.getTotalPages());
                data.setBookPrice(Book.getBookPrice());
                data.setBookName(Book.getBookName());
                data.setBookColor(Book.getBookColor());
                obj.save(data);
                str="data successfully updated !!!!!!!! of Id ="+Id;
                break;
            }
            else
            {
                str="Book Not Found with given Id ="+Id;
            }


        }
//
//         BookEntity idObj =obj.findById(Id).get();
//         idObj.setBookName(Book.getBookName());
//        idObj.setTotalPages(Book.getTotalPages());
//        idObj.setBookColor(Book.getBookColor());
//        idObj.setBookPrice(Book.getBookPrice());
//        obj.save(idObj);
//        return idObj;
        return str;
    }
   // getting single data by id from database
    public BookEntity getSingleData(int id) {
        BookEntity singleData =obj.findById(id).get();
        return singleData;
    }
     // getting single data by book name from database;
    public BookEntity getSingleDataByName(String bookName) {
        BookEntity single;
        Object finalData = null;
        List<BookEntity> allData =obj.findAll();
        Iterator<BookEntity> result = allData.iterator();
        while(result.hasNext()){
            single = result.next();
            if(single.getBookName()==bookName){
              finalData = single;
              break;
            }
            else
            {   String s= "sorry you have enter wrong input";
                finalData=s;

            }
        }
        return (BookEntity) finalData;
    }
}

