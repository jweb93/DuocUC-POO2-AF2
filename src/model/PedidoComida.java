package model;

/**
 * Representa un pedido de Comida que puede requerirse caliente o no
 */

public class PedidoComida extends Pedido{

    private boolean caliente;

    // Constructor
    public PedidoComida(int idPedido, Direccion direccionEntrega, double distanciaKM, boolean caliente) {
        super(idPedido, direccionEntrega, distanciaKM);
        this.caliente = caliente;
    }

    // Getter and Setters
    public boolean isCaliente() {
        return caliente;
    }

    public void setCaliente(boolean caliente) {
        this.caliente = caliente;
    }


    // Implementación del método abstracto
    @Override
    public int calcularTiempoEntrega(){
        return (int) Math.round(15 + (2 * getDistanciaKM()));
    }

    // Sobreescritura
    @Override
    public void mostrarResumen(){
        System.out.println("Pedido Comida N°: " + getIdPedido());
        System.out.println("Destino: " + getDireccionEntrega());
        System.out.println("Distancia (km): " + getDistanciaKM());
        System.out.println("Tiempo (min): " + calcularTiempoEntrega());
    }

}
