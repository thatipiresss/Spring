package br.org.generation.lojagames.respository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.lojagames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long> {
	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);
	
	public Object findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	public List <Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);


}
