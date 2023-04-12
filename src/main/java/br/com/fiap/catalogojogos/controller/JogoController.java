package br.com.fiap.catalogojogos.controller;

import br.com.fiap.catalogojogos.model.dto.AtualizarJogo;
import br.com.fiap.catalogojogos.model.dto.CadastroJogo;
import br.com.fiap.catalogojogos.model.dto.ListagemJogo;
import br.com.fiap.catalogojogos.service.JogoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/jogo")
public class JogoController {

    private final JogoService jogoService;

    @Autowired
    public JogoController(JogoService jogoService) {
        this.jogoService = jogoService;
    }

    @GetMapping
    public Page<ListagemJogo> listar(@PageableDefault(size = 5, sort={"titulo"})
                                         Pageable pageable)
    {
        return jogoService.listarTodosJogos(pageable);
    }

    @PostMapping("/criar")
    @Transactional
    public void criar(@RequestBody @Valid CadastroJogo cadastroJogo) {
        jogoService.salvarJogo(cadastroJogo);
    }

    @PutMapping("/alterar")
    @Transactional
    public void alterar(@RequestBody AtualizarJogo atualizarJogo) {
        jogoService.atualizar(atualizarJogo);
    }

    @DeleteMapping("/excluir/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        jogoService.exclusaoLogica(id);
    }
}
