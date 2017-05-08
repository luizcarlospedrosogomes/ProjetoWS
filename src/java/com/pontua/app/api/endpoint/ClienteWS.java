package com.pontua.app.api.endpoint;

import com.pontua.app.controle.ClienteC;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("cliente")
public class ClienteWS {

    @Context
    private UriInfo context;

    
    public ClienteWS() {
    }

    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        throw new UnsupportedOperationException();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON) //produz um json
    @Path("get/ler")
    public String getClientes(){
        ClienteC cc = new ClienteC();
        return cc.getClientes();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON) //consome um json
    @Path("post/criar")
    public boolean postClientes(String cliente){
        ClienteC cc = new ClienteC();
        return cc.postClientes(cliente);
    }
    
    @GET
    @Consumes(MediaType.APPLICATION_JSON) //consome um json
    @Path("get/deletar/{id}")
    public boolean deleteClientes(@PathParam("id") int id){
        ClienteC cc = new ClienteC();
        return cc.deleteCliente(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON) //consome um json
    @Path("post/atualizar")
    public boolean atualizarClientes(String cliente){
        ClienteC cc = new ClienteC();
        return cc.atualizarCliente(cliente);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON) //consome um json
    @Path("post/login/")
    public String loginCliente(String cliente){
        ClienteC cc = new ClienteC();
        return cc.loginCliente(cliente);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON) //produz um json
    @Path("get/buscar/{id}")
    public String buscaCliente(@PathParam("id") int id){
        ClienteC cc = new ClienteC();
        return cc.buscaCliente(id);
    }

    /**
     * PUT method for updating or creating an instance of ClienteWS
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
}
