package model;

/**
 * Representa un pedido de Express de algún comercio
 */

public class PedidoExpress extends Pedido{
    private String comercio;

    // Constructor
    public PedidoExpress(int idPedido, Direccion direccionEntrega, String tipoPedido, String comercio) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.comercio = comercio; //Supermercado, Farmacia
    }

    // Getter and Setters
    public String getComercio() {
        return comercio;
    }

    public void setComercio(String comercio) {
        this.comercio = comercio;
    }

    // Sobreescritura
    @Override
    public void asignarRepartidor(){
        System.out.println("[Pedido Express]");
        System.out.println("Buscando un repartidor para llevar su pedido express 🧺");
    }

    // Sobrecarga
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println(nombreRepartidor + " llevará su(s) " + getTipoPedido() + " de " + getComercio());
        System.out.println("");
    }
}
