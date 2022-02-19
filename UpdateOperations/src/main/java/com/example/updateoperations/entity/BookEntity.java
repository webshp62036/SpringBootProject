package com.example.updateoperations.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.print.Book;
import java.security.PrivateKey;

@Entity
public class BookEntity {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     /******************************
      -> Fields Declaration of Book

      ******************************/
     private  int Id;
     private String BookName;
     private long TotalPages;
     private String BookColor;
     private float BookPrice ;

     /***************************
      - Parameterized constructor &
      - Non Parameterized constructors
      */

     public BookEntity(int id, String bookName, long totalPages, String bookColor, float bookPrice) {
          Id = id;
          BookName = bookName;
          TotalPages = totalPages;
          BookColor = bookColor;
          BookPrice = bookPrice;
     }

     // default constructor
     public BookEntity(){
          super();
     }


     /*******************************************
     - Getter  Methods of all declared fields
     - Setter Method of all declared fields
     ******************************************/

     public int getId() {
          return Id;
     }

     public void setId(int id) {
          Id = id;
     }

     public String getBookName() {
          return BookName;
     }

     public void setBookName(String bookName) {
          BookName = bookName;
     }

     public long getTotalPages() {
          return TotalPages;
     }

     public void setTotalPages(long totalPages) {
          TotalPages = totalPages;
     }

     public String getBookColor() {
          return BookColor;
     }

     public void setBookColor(String bookColor) {
          BookColor = bookColor;
     }

     public float getBookPrice() {
          return BookPrice;
     }

     public void setBookPrice(float bookPrice) {
          BookPrice = bookPrice;
     }


}
