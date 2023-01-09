package com.example.demo.Books;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.Books.Books;
@Repository //data access
public interface BooksRepository extends JpaRepository<Books,Integer> {


  // Genre feature
  List<Books> findByGenre(String genre);

  //Top Ten feature
  List<Books> findTop10ByOrderByCopiesSoldDesc();

  //  rating feature
  List<Books> findAllByreaderRatingGreaterThanEqual(double readerRating);

  //index feature
}
