package one.digitalinnovation.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Produto;
import one.digitalinnovation.gof.model.ProdutoRepository;
import one.digitalinnovation.gof.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Iterable<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto buscarPorId(Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.orElse(null);
    }

    @Override
    public void inserir(Produto produto) {
        produtoRepository.save(produto);
    }

    @Override
    public void atualizar(Long id, Produto produto) {
        if (produtoRepository.existsById(id)) {
            produto.setId();
            produtoRepository.save(produto);
        }
    }

    @Override
    public void deleter(Long id) {

    }

    @Override
    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }
}