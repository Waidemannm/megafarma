package br.com.fiap.bo;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.to.ClienteTO;

import java.util.ArrayList;

public class ClienteBO {
    //atributos
    private ClienteDAO clienteDAO;
    //metodos particulares
    public ArrayList<ClienteTO> findAll(){
        clienteDAO = new ClienteDAO();
        return clienteDAO.findAll();
    }
    public ClienteTO findByCodigo(Long codigo){
        clienteDAO = new ClienteDAO();
        return clienteDAO.findByCodigo(codigo);
    }
    public ClienteTO save(ClienteTO cliente){
        clienteDAO = new ClienteDAO();
        if (cliente.getCpf() == null || cliente.getCpf().length() != 11){
            return null;
        }
        return clienteDAO.save(cliente);
    }
    public boolean delete(Long codigo){
        clienteDAO = new ClienteDAO();
        return clienteDAO.delete(codigo);
    }
    public ClienteTO update(ClienteTO cliente){
        clienteDAO = new ClienteDAO();
        if (cliente.getCpf() == null || cliente.getCpf().length() != 11){
            return null;
        }
        return clienteDAO.update(cliente);
    }
}
