package model;

/**
 * Representa un pedido que debe ser entregado a una dirección
 */

public class Pedido {
    private int idPedido;
    private Direccion direccionEntrega;
    private String tipoPedido;

    // Constructor
    public Pedido(int idPedido, Direccion direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    // Getter and Setters
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Direccion getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(Direccion direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    // Método base
    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public void asignarRepartidor(){
        System.out.println("[Pedido]");
        System.out.println("Buscando un repartidor para llevar su pedido");;
    }
}

