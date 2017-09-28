package com.theironyard.charlotte.sampleherokusite;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    List<Book> books = new ArrayList<>();




    @RequestMapping(path = "/books", method = RequestMethod.GET)
    public List<Book> getBooks() {
//        Book greenEggsAndHam = new Book("1234","Green Eggs And Ham",
//                                        "Dr. Seuss!", true,
//                            "Awesome", true, 67 );
//        books.add(greenEggsAndHam);
        return books;
    }
    // {"isbn":"12345","title":"The Great Gatsomething","author":"yamama"}

    @RequestMapping(path = "/books", method = RequestMethod.POST)
    public void addBook(@RequestBody Book book) {
        books.add(book);

    }
}
