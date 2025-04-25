package com.example.primeiroprojeto.controller;

import com.example.primeiroprojeto.model.Tarefa;
import com.example.primeiroprojeto.service.TarefaService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @GetMapping
    public List<Tarefa> getAll() {
        return tarefaService.listarTodas();
    }

    @GetMapping("/{id}")
    public Tarefa getById(@PathVariable Long id) {
        return tarefaService.buscarPorId(id);
    }
}
