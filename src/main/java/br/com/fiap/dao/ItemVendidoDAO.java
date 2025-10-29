package br.com.fiap.dao;

import br.com.fiap.to.ItemVendidoTO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemVendidoDAO {
    //metodos particulares
    public ArrayList<ItemVendidoTO> findAll() {
        ArrayList<ItemVendidoTO> itens = new ArrayList<>();
        String sql = "select * from ddd_itensvendidos";
        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    ItemVendidoTO itemVendido = new ItemVendidoTO();
                    itemVendido.setCodVenda(rs.getLong("codvenda"));
                    itemVendido.setCodRemedio(rs.getLong("codremedio"));
                    itemVendido.setQuantidade(rs.getInt("quantidade"));
                    itens.add(itemVendido);
                }
            }
        }catch (SQLException e) {
            System.out.println("Erro na consulta: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        return itens;
    }

    public ItemVendidoTO findByCodigo(Long codigo) {
        ItemVendidoTO itemVendido = new ItemVendidoTO();
        String sql = "select * from ddd_itensvendidos where codigo = ?";
        try (PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)) {
            ps.setLong(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                itemVendido.setCodVenda(rs.getLong("codvenda"));
                itemVendido.setCodRemedio(rs.getLong("codremedio"));
                itemVendido.setQuantidade(rs.getInt("quantidade"));
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Erro na consulta: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        return itemVendido;
    }

    public ItemVendidoTO update(ItemVendidoTO itemVendidoTO){
        String sql = "update ddd_itensvendidos set codvenda = ?, codremedio = ?, quantidade = ?  where = codvenda = ? and codremedio = ?";
        try(PreparedStatement ps = ConnectionFactory.getConnection().prepareStatement(sql)){
            ps.setLong(1, itemVendidoTO.getCodVenda());
            ps.setLong(2, itemVendidoTO.getCodRemedio());
            ps.setInt(3, itemVendidoTO.getQuantidade());
            ps.setLong(4, itemVendidoTO.getCodVenda());
            ps.setLong(5, itemVendidoTO.getCodRemedio());
            if (ps.executeUpdate() > 0) {
                return itemVendidoTO;
            }else {
                return null;
            }
        }catch (SQLException e) {
            System.out.println("Erro ao atualizar: " + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }
        return null;
    }

}