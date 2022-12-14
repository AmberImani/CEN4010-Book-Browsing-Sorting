package com.example.demo.Books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Books.BooksService;
@RestController
@RequestMapping(path = "api/v1/books")
public class BooksController {

  public BooksService booksService;

  @Autowired
  public BooksController(BooksService booksService) {
    this.booksService = booksService;
  }

  @GetMapping("/books")
 public List<Books> getBooks() {
   return booksService.getBooks();
  }


  @GetMapping("/genre/{genre}")
  public List<Books> getGenre(@PathVariable String genre) {
    return booksService.getBookByGenre(genre);
  }

  @GetMapping("/top10")
  public List<Books> getTop(){
    return booksService.getTopTen();
  }

  @GetMapping("/rating/{rating}")
  public List<Books> getRating(@PathVariable double rating){
    return booksService.getBookByRating(rating);
  }

  @GetMapping("/index/{index}")
  public List<Books> getBooks(@PathVariable int index){
    return booksService.getBookByX(index);
  }

  @PostMapping
  public void registerNewBook(@RequestBody Books books){
    booksService.addNewBook(books);
  }

}
