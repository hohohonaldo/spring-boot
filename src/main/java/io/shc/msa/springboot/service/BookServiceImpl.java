package io.shc.msa.springboot.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import io.shc.msa.springboot.domain.Book;
import io.shc.msa.springboot.domain.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService {
	private final BookRepository bookRepository; 

	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public Optional<Book> fidnById(Long Id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(Id);
	}

}
