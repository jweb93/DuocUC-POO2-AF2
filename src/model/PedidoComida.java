package model;

/**
 * Representa un pedido de Comida que puede requerirse caliente o no
 */

public class PedidoComida extends Pedido{

    private boolean caliente;

    // Constructor
    public PedidoComida(int idPedido, Direccion direccionEntrega, String tipoPedido, boolean caliente) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.caliente = caliente;
    }

    // Getter and Setters
    public boolean isCaliente() {
        return caliente;
    }

    public void setCaliente(boolean caliente) {
        this.caliente = caliente;
    }

    // Sobreescritura
    @Override
    public void asignarRepartidor(){
        System.out.println("[Pedido Comida]");
        System.out.println("Buscando un repartidor para llevar su comida 🍲");

    }

    // Sobrecarga
    public void asignarRepartidor(String nombreRepartidor){
        System.out.print(nombreRepartidor + " llevará su(s) " + getTipoPedido());
        if(isCaliente()){
            System.out.println(" caliente(s)");
        }
        System.out.println();
    }
}
