package model;

/**
 * Representa un pedido que debe ser entregado a una dirección
 */

public abstract class  Pedido {
    private int idPedido;
    private Direccion direccionEntrega;
    private double distanciaKM;

    public Pedido(int idPedido, Direccion direccionEntrega, double distanciaKM) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKM = distanciaKM;
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

    public double getDistanciaKM() {
        return distanciaKM;
    }

    public void setDistanciaKM(double distanciaKM) {
        this.distanciaKM = distanciaKM;
    }

    // Método base
    public void mostrarResumen(){
        System.out.println("Pedido N°: " + idPedido);
        System.out.println("Destino: " + direccionEntrega);
        System.out.println("Distancia (km): " + distanciaKM);
        System.out.println("Tiempo (min): " + calcularTiempoEntrega());
    }

    // Método abstracto
    public abstract int calcularTiempoEntrega();
}

