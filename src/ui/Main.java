package ui;

import model.*;

import java.util.ArrayList;

/**
 * Clase principal para ejecutar el programa
 */

public class Main {

    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();

        pedidos.add(new PedidoComida(
                1,
                new Direccion("Avenida Matta", 1042, "Santiago"),
                4,
                true
        ));

        pedidos.add(new PedidoEncomienda(
                2,
                new Direccion("Avenida Central", 987, "Maipú"),
                6,
                true
        ));

        pedidos.add(new PedidoExpress(
                3,
                new Direccion("Avenida Presidente Riesco", 777, "Las Condes"),
                7,
                "Farmacia"
        ));



        for(Pedido p : pedidos){
            System.out.println("--------------------------");
            p.mostrarResumen();

        }

    }
}
