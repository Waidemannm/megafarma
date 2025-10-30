package br.com.fiap.resource;

import br.com.fiap.bo.VendaBO;
import br.com.fiap.to.VendaTO;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;

@Path("/venda")
public class vendaResource {
    //atributos
    private VendaBO vendaBO = new VendaBO();

    //metodos particulares
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll(){
        ArrayList<VendaTO> resultado = vendaBO.findAll();
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
    public Response findByCodigo(@PathParam("codigo") Long codigo){
        VendaTO resultado = vendaBO.findByCodigo(codigo);
        Response.ResponseBuilder response = null;
        if (resultado != null) {
            response = Response.ok();  // 200 (OK)
        } else {
            response = Response.status(404);  // 404 (NOT FOUND)
        }
        response.entity(resultado);
        return response.build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response save(@Valid VendaTO venda){
        VendaTO resultado = vendaBO.save(venda);
        Response.ResponseBuilder response = null;
        if (resultado != null){
            response = Response.created(null);
        } else {
            response = Response.status(400);
        }
        response.entity(resultado);
        return response.build();
    }

    @PUT
    @Path("/{codigo}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@Valid VendaTO venda, @PathParam("codigo") Long codigo){
        venda.setCodigo(codigo);
        VendaTO resultado = vendaBO.update(venda);
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
