package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{

}
