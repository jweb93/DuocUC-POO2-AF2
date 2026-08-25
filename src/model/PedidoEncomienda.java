package model;

/**
 * Representa un pedido de Encomienda que puede ser fragil o no
 */

public class PedidoEncomienda extends Pedido{
    private boolean fragil;

    // Constructor
    public PedidoEncomienda(int idPedido, Direccion direccionEntrega, double distanciaKM, boolean fragil) {
        super(idPedido, direccionEntrega, distanciaKM);
        this.fragil = fragil;
    }

    // Getter and Setters
    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    // Implementación del método abstracto
    @Override
    public int calcularTiempoEntrega(){
        return (int) Math.round(20 + (1.5 * getDistanciaKM()));
    }

    // Sobreescritura
    @Override
    public void mostrarResumen(){
        System.out.println("Pedido Encomienda N°: " + getIdPedido());
        System.out.println("Destino: " + getDireccionEntrega());
        System.out.println("Distancia (km): " + getDistanciaKM());
        System.out.println("Tiempo (min): " + calcularTiempoEntrega());
    }
}
