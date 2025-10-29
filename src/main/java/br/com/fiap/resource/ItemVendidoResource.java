package br.com.fiap.resource;

import br.com.fiap.bo.ItemVendidoBO;
import br.com.fiap.to.ItemVendidoTO;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;

@Path("/itemvendido")
public class ItemVendidoResource {
    //atributos
    private ItemVendidoBO itemVendidoBO;
    //métodos particulares

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll(){
        ArrayList<ItemVendidoTO> resultado = itemVendidoBO.findAll();
        Response.ResponseBuilder response = null;
        if (resultado != null) {
            response = Response.ok(); // 200 - OK
        }
        else {
            response = Response.status(404);  // 404 - NOT FOUND
        }
        response.entity(resultado);
        return response.build();
    }

    @GET
    @Path("/{codigo}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findByCodigo(@PathParam("codigo") Long codigo) {
        ItemVendidoTO resultado = itemVendidoBO.findByCodigo(codigo);
        Response.ResponseBuilder response = null;
        if (resultado != null) {
            response = Response.ok();  // 200 (OK)
        } else {
            response = Response.status(404);  // 404 (NOT FOUND)
        }
        response.entity(resultado);
        return response.build();
    }

    @PUT
    @Path("/{codigo}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@Valid ItemVendidoTO itemVendido, @PathParam("codigo") Long codigo){
        ItemVendidoTO resultado = itemVendidoBO.update(itemVendido);
        Response.ResponseBuilder response = null;
        if (resultado != null){
            response = Response.created(null);
        } else {
            response = Response.status(400);
        }
        response.entity(resultado);
        return response.build();
    }
}
