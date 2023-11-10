package com.xjgv.poointerfaces.repositorio;

import com.xjgv.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {

    List<Cliente> listar();
    Cliente porId(Integer id);
    void insertar(Cliente cliente);
    void editarCliente(Cliente cliente);
    void eliminarCliente(Integer id);
}
