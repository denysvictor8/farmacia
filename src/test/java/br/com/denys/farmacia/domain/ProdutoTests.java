package br.com.denys.farmacia.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProdutoTests {

	@Test
	public void criar() {
		
		Produto p = new Produto(
				Short.valueOf("1"), 
				"Doril", 
				Short.valueOf("100"), 
				BigDecimal.valueOf(6.50), 
				LocalDate.of(2022,11,19)
				);
		
		System.out.println(p);
	}
	
}
