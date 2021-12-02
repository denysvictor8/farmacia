package br.com.denys.farmacia.repository;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.denys.farmacia.domain.Produto;

@SpringBootTest
public class ProdutoRepositoryTests {

	@Autowired
	private ProdutoRepository pr;
	
	@Test
	public void inserir() {
		
		Produto p1 = new Produto(
				null,
				"Dramin", 
				Short.valueOf("100"), 
				BigDecimal.valueOf(4.50), 
				LocalDate.of(2022,11,19)
		);
		
		pr.save(p1);
		
	}
	
}
