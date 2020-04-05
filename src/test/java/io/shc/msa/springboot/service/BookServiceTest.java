package io.shc.msa.springboot.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import io.shc.msa.springboot.domain.Book;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.NONE)
public class BookServiceTest {

	@Autowired
	BookService bookService;
	
	@Test(expected = RuntimeException.class)
	public void testFindById() {
		Long id = 1L;
		bookService.fidnById(id).orElseThrow(() -> new RuntimeException("NOT FOUND"));
		
	}
}
