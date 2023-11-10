package com.xjgv.poointerfaces.repositorio;

import com.xjgv.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
