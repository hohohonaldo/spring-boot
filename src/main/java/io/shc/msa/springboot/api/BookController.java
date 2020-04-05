package io.shc.msa.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.shc.msa.springboot.domain.Book;
import io.shc.msa.springboot.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/{bookId}")
	public ResponseEntity<Book> fidnById(Long bookId){
		Book book = bookService.fidnById(bookId).orElseThrow(() -> new RuntimeException("NOT FOUND" + bookId));
		return ResponseEntity.ok( book );
	}
}
