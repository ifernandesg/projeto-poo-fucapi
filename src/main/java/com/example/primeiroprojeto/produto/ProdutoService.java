package com.example.primeiroprojeto.produto;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Arrays;

@Service
public class ProdutoService {
    public List<Produto> getProdutos() {
        return Arrays.asList(
            new Produto(1L, "Caderno", 12.90),
            new Produto(2L, "Caneta", 1.50),
            new Produto(3L, "Lápis", 0.80)
        );
    }
}
