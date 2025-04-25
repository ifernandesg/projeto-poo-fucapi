package com.example.primeiroprojeto.service;
 
import com.example.primeiroprojeto.model.Tarefa;

import java.util.List;
import java.util.ArrayList;

public class TarefaService {


    private List<Tarefa> tarefas = new ArrayList<>();

    public TarefaService() {
        tarefas.add(new Tarefa(1L, "Estudar Spring", false));
        tarefas.add(new Tarefa(2L, "Fazer exercícios", true));
    }

    public List<Tarefa> listarTodas() {
        return tarefas;
    }

    public Tarefa buscarPorId(Long id) {
        return tarefas.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
