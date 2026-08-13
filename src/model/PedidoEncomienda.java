package model;

/**
 * Representa un pedido de Encomienda que puede ser fragil o no
 */

public class PedidoEncomienda extends Pedido{
    private boolean fragil;

    // Constructor
    public PedidoEncomienda(int idPedido, Direccion direccionEntrega, String tipoPedido, boolean fragil) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.fragil = fragil;
    }

    // Getter and Setters
    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    // Sobreescritura
    @Override
    public void asignarRepartidor(){
        System.out.println("[Pedido Encomienda]");
        System.out.println("Buscando un repartidor para llevar su encomienda rapidamente ✈️");
    }

    // Sobrecarga
    public void asignarRepartidor(String nombreRepartidor){
        System.out.print(nombreRepartidor + " llevará su(s) " + getTipoPedido());
        if(isFragil()){
            System.out.println(" frágil(es)");
        }
        System.out.println();
    }
}
