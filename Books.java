 package com.example.demo.Books;

 import javax.persistence.SequenceGenerator;
 import javax.persistence.GeneratedValue;
 import javax.persistence.Table;
 import javax.persistence.Entity;
 import javax.persistence.Id;
 import javax.persistence.GenerationType;
//
 @Entity
 @Table
 public class Books {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    //



  /*@SequenceGenerator(
      name = "book_sequence",
      sequenceName = "book_sequence",
      allocationSize = 1
  )

  @GeneratedValue(
      strategy = GenerationType.SEQUENCE,
      generator = "book_sequence"
  )*/
//
  int ISBN;
  //int ISBNNumber;
    String books;
    String theAuthor;
    String genre;
   double readerRating;
   String description;
    int year;
    String publisher;


    int price;

    int copiesSold;
//
//
//
   public Books() {
//
   }
//
   // Here is the constructor
   public Books( String books, String description, int price, String theAuthor,
       String genre, String publisher, int year, int copiesSold, double readerRating) {

     this.books = books;
     this.theAuthor = theAuthor;
     this.genre = genre;
     this.readerRating = readerRating;
     this.description = description;
     this.year = year;
     this.publisher = publisher;
     //this.ISBNNumber = ISBNNumber;
     this.price = price;
     this.copiesSold = copiesSold;
                                                                                                                             //
  }                                                                                                                         //
                                                                                                                         //
   // Here are my getters
   //public int getISBNNumber() {
    //return ISBNNumber;
  //}
                                                                                                                        //
   public String getBooks() {
    return books;
  }
                                                                                                                         //
   public String getDescription() {
    return description;
  }
                                                                                                                               //
   public int getPrice() {
    return price;
  }
                                                                                                                         //
   public String getTheAuthor() {
    return theAuthor;
  }
                                                                                                                        //
   public String getGenre() {
    return genre;
  }
                                                                                                                         //
   public String getPublisher() {
    return publisher;
  }
                                                                                                                         //
   public int getYear() {
    return year;
  }
                                                                                                                         //
   public int getCopiesSold() {
    return copiesSold;
  }
                                                                                                                         //
   public double getReaderRating(){return readerRating;}
                                                                                                                         //
                                                                                                                         //
   // Here are the setters
   public void setISBNNumber(int ISBNNumber) {
    //this.ISBNNumber = ISBNNumber;
  }
                                                                                                                         //
   public void setBooks(String books) {
    this.books = books;
  }
                                                                                                                         //
   public void setDescription(String description) {
    this.description = description;
  }
                                                                                                                         //
   public void setPrice(int price) {
    this.price = price;
  }
                                                                                                                         //
   public void setTheAuthor(String theAuthor) {
    this.theAuthor = theAuthor;
  }
                                                                                                                         //
   public void setGenre(String genre) {
    this.genre = genre;
  }
                                                                                                                         //
   public void setPublisher(String publisher) {
    this.publisher = publisher;
  }
                                                                                                                         //
   public void setYear(int year) {
    this.year = year;
  }
                                                                                                                         //
   public void setCopiesSold(int copiesSold) {
    this.copiesSold = copiesSold;
  }
                                                                                                                         //
   public void setReaderRating(double readerRating){
    this.readerRating = readerRating;
  }
                                                                                                                         //
   @Override
   public String toString() {
     return "Books{" +
         //"ISBN Number:" + ISBNNumber +
         " Book:" + books + '\'' +
         " Storyline:'" + description + '\'' +
         " price:" + price +
         " Author:" + theAuthor + '\'' +
         " Book Genre:'" + genre + '\'' +
         " Publishing Company:" + publisher + '\'' +
         " Year Published:" + year +
         " Number of Copies Sold:" + copiesSold +
         " Average Reader Rating:" + readerRating +
         '}';
  }                                                                                                                         //
}                                                                                                                         //
