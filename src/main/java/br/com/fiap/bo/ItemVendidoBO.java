package br.com.fiap.bo;

import br.com.fiap.dao.ItemVendidoDAO;
import br.com.fiap.to.ItemVendidoTO;

import java.util.ArrayList;

public class ItemVendidoBO {
    //atributos
    private ItemVendidoDAO itemVendidoDAO;
    //metodos particulares
    public ArrayList<ItemVendidoTO> findAll() {
        itemVendidoDAO = new ItemVendidoDAO();
        return itemVendidoDAO.findAll();
    }

    public ItemVendidoTO findByCodigo(Long codigo) {
        itemVendidoDAO = new ItemVendidoDAO();
        return itemVendidoDAO.findByCodigo(codigo);
    }

    public ItemVendidoTO update(ItemVendidoTO itemVendidoTO){
        itemVendidoDAO = new ItemVendidoDAO();
        return itemVendidoDAO.update(itemVendidoTO);
    }
}
