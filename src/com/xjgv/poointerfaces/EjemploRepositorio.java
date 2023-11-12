package com.xjgv.poointerfaces;

import com.xjgv.poointerfaces.modelo.Cliente;
import com.xjgv.poointerfaces.repositorio.ClienteListRepositorio;
import com.xjgv.poointerfaces.repositorio.Direccion;
import com.xjgv.poointerfaces.repositorio.OrdenableRepositorio;
import com.xjgv.poointerfaces.repositorio.PaginableRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        ClienteListRepositorio repo = new ClienteListRepositorio();

        repo.insertar(new Cliente("Jano", "Perez"));
        repo.insertar(new Cliente("Bea", "Gonzalez"));
        repo.insertar(new Cliente("Luci", "Martinez"));
        repo.insertar(new Cliente("Andres", "Guzman"));

        List<Cliente> clientes =  repo.listar();
        clientes.forEach(System.out::println);

        System.out.println();

        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(0, 3);
        paginable.forEach(System.out::println);
        System.out.println();
        List<Cliente> clientesOrdenAsc = ((OrdenableRepositorio)repo)
                .listar("nombre", Direccion.ASC);
        clientesOrdenAsc.forEach(System.out::println);

        System.out.println("_----------------------------_");
        Cliente actualizado = new Cliente("Bea", "Mena");
        actualizado.setId(2);
        repo.editarCliente(actualizado);
        Cliente bea = repo.porId(2);
        System.out.println(bea);

        System.out.println();
        List<Cliente> clientesOrdenAsc2 = ((OrdenableRepositorio)repo)
                .listar("nombre", Direccion.ASC);
        clientesOrdenAsc2.forEach(System.out::println);

    }
}
