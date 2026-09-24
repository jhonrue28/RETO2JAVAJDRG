//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import modelos.Productos;
import servicio.Productoservice;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Añadí los productos
        List<Productos> productos = new ArrayList<>();
        productos.add(new Productos("Laptop", "Electrónica", 1200.00));
        productos.add(new Productos("Teclado Mecánico", "Electrónica", 85.50));
        productos.add(new Productos("Camiseta", "Ropa", 25.00));
        productos.add(new Productos("Monitor 4K", "Electrónica", 450.00));
        productos.add(new Productos("Pantalón", "Ropa", 40.00));
        productos.add(new Productos("Mouse Gamer", "Electrónica", 50.00));

        // Escoger que categoría está buscando
        Productoservice productoService = new Productoservice();
        String categoriaBuscada = "Electrónica";

        //Resultado de la busqueda
        List<Productos> resultado = productoService.filtrarYOrdenarPorPrecioDesc(productos, categoriaBuscada);

        //Impresión de la lista.
        System.out.println("--- Productos de la categoría '" + categoriaBuscada + "' (Ordenados por precio descendente) ---");
        resultado.forEach(p -> System.out.println(p));
    }
}