package ui;

import model.*;

/**
 * Clase principal para ejecutar el programa
 */

public class Main {

    public static void main(String[] args) {
        PedidoComida pedido1 = new PedidoComida(
                1,
                new Direccion("Avenida Matta", 1042, "Santiago"),
                "Completos",
                true);

        PedidoExpress pedido2 = new PedidoExpress(
                2,
                new Direccion("Avenida Presidente Riesco", 777, "Las Condes"),
                "Tapsin Día en polvo",
                "Farmacia");

        PedidoEncomienda pedido3 = new PedidoEncomienda(
                3,
                new Direccion("Avenida Central", 987, "Maipú"),
                "Notebook",
                true);

        pedido1.asignarRepartidor();
        pedido1.asignarRepartidor("Javier");

        pedido2.asignarRepartidor();
        pedido2.asignarRepartidor("Ignacio");

        pedido3.asignarRepartidor();
        pedido3.asignarRepartidor("Nora");


    }
}
