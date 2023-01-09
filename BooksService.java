package com.example.demo.Books;                                                                     //
                                                                                                       //
import java.awt.print.Book;                                                                                //
import java.util.ArrayList;
import java.util.List;                                                                                      //
import java.util.Optional;                                                                              //
import javax.swing.text.html.Option;                                                                   //
import org.springframework.beans.factory.annotation.Autowired;                                                 //
import org.springframework.stereotype.Service;                                                               //
import com.example.demo.Books.BooksRepository;
@Service                                                                                                                 //
public class BooksService {                                                                                             //
  @Autowired                                                                                                            //
  BooksRepository booksRepository;
                                                                                                                        //
                                                                                                                             //
  public List<Books> getBooks() {                                                                                        //
    return booksRepository.findAll();                                                                                     //
  }                                                                                          //
                                                                                                                         //
                                                                                         //
  public void addNewBook(Books books) {                                                                                  //
    System.out.println(books);                                                                                           //
    booksRepository.save(books);                                                                                          //
  }                                                                                                                     //
                                                                                                                        //
                                                                                         //
  public List<Books> getBookByGenre(String genre) {                                                                                         //
    return booksRepository.findByGenre(genre);                                                                                         //
  }                                                                                                                      //
                                                                                                //
  public List<Books> getTopTen(){                                                                                          //
    return booksRepository.findTop10ByOrderByCopiesSoldDesc();                                                                                         //
  }                                                                                         //
                                                                                         //
  public List<Books> getBookByRating(double rating){                                                                                          //
    return booksRepository.findAllByreaderRatingGreaterThanEqual(rating);
  }                                                                                          //
                                                                                         //
                                                                                         //
  public List<Books> getBookByX(int index){
    List<Books> books = new ArrayList<>();
    for(int i = 0; i < index; i++){                                                                                          //
      books.add(booksRepository.findAll().get(i));
    }                                                                                          //
    return books;                                                                                         //
  }                                                                                       //
                                                                                          //
}                                                                                         //
//