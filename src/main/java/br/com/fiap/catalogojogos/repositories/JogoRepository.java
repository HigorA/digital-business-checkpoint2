// Higor Alves Santos RM93359
package br.com.fiap.catalogojogos.repositories;

import br.com.fiap.catalogojogos.model.entity.Jogo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogoRepository extends JpaRepository<Jogo, Long> {

    Page<Jogo> findAllByAtivoTrue(Pageable paginacao);
}
