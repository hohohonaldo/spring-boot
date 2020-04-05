package io.shc.msa.springboot.service;

import java.util.Optional;

import io.shc.msa.springboot.domain.Book;

public interface BookService {
	Optional<Book> fidnById(Long Id);
}
