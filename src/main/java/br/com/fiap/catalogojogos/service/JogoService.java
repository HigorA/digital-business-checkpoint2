// Higor Alves Santos RM93359
package br.com.fiap.catalogojogos.service;

import br.com.fiap.catalogojogos.model.dto.AtualizarJogo;
import br.com.fiap.catalogojogos.model.dto.CadastroJogo;
import br.com.fiap.catalogojogos.model.dto.DeletarJogo;
import br.com.fiap.catalogojogos.model.dto.ListagemJogo;
import br.com.fiap.catalogojogos.model.entity.Jogo;
import br.com.fiap.catalogojogos.repositories.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class JogoService {


    private final JogoRepository jogoRepository;

    @Autowired
    public JogoService(JogoRepository jogoRepository) {
        this.jogoRepository = jogoRepository;
    }

    public void salvarJogo(CadastroJogo cadastroJogo) {
        Jogo jogo = new Jogo(cadastroJogo);
        jogoRepository.save(jogo);
    }

    public Page<ListagemJogo> listarTodosJogos(Pageable pageable) {
        return jogoRepository.findAllByAtivoTrue(pageable).map(ListagemJogo::new);
    }

    public void atualizar(AtualizarJogo atualizarJogo) {
        Long id = atualizarJogo.id();
        Jogo jogo = jogoRepository.getReferenceById(id);
        jogo.atualizarInformacoes(atualizarJogo);
    }

    public void exclusaoLogica(DeletarJogo deletarJogo) {
        Long id = deletarJogo.id();
        Jogo jogo = jogoRepository.getReferenceById(id);
        jogo.excluir();

    }
}
