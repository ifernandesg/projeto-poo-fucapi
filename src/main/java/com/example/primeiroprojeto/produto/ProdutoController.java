package com.example.primeiroprojeto.produto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProdutoController {

    private final ProdutoService produtoService;

    // Injeção de dependência do serviço
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping("/produtos")
    public List<Produto> listarProdutos() {
        return produtoService.getProdutos();
    }
}
