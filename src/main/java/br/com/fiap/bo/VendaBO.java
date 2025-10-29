package br.com.fiap.bo;

import br.com.fiap.dao.VendaDAO;
import br.com.fiap.to.VendaTO;

import java.util.ArrayList;

public class VendaBO {
    //atributos
    private VendaDAO vendaDAO;
    //metodos particulares
    public ArrayList<VendaTO> findAll() {
        vendaDAO = new VendaDAO();
        return vendaDAO.findAll();
    }
    public VendaTO findByCodigo(Long codigo){
        vendaDAO = new VendaDAO();
        return vendaDAO.findByCodigo(codigo);
    }
    public VendaTO save(VendaTO venda){
        vendaDAO = new VendaDAO();
        return vendaDAO.save(venda);
    }
    public VendaTO update(VendaTO venda){
        vendaDAO = new VendaDAO();
        return vendaDAO.update(venda);
    }
}
