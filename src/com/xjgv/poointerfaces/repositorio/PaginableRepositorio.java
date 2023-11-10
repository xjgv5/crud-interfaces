package com.xjgv.poointerfaces.repositorio;

import com.xjgv.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
