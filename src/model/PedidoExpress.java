package model;

/**
 * Representa un pedido de Express de algún comercio
 */

public class PedidoExpress extends Pedido{
    private String comercio;

    // Constructor
    public PedidoExpress(int idPedido, Direccion direccionEntrega, double distanciaKM, String comercio) {
        super(idPedido, direccionEntrega, distanciaKM);
        this.comercio = comercio; //Supermercado, Farmacia
    }

    // Getter and Setters
    public String getComercio() {
        return comercio;
    }

    public void setComercio(String comercio) {
        this.comercio = comercio;
    }

    // Implementación del método abstracto
    @Override
    public int calcularTiempoEntrega(){
        if (getDistanciaKM() > 5){
            return 15;
        }
        else{
            return 10;
        }
    }

    // Sobreescritura
    @Override
    public void mostrarResumen(){
        System.out.println("Pedido Express N°: " + getIdPedido());
        System.out.println("Destino: " + getDireccionEntrega());
        System.out.println("Distancia (km): " + getDistanciaKM());
        System.out.println("Tiempo (min): " + calcularTiempoEntrega());
    }
}
