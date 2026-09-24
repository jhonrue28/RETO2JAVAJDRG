package servicio;

import modelos.Productos;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Productoservice {
    public List<Productos> filtrarYOrdenarPorPrecioDesc(List<Productos> productos, String categoriaBuscada) {
        return productos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase(categoriaBuscada))

                .sorted(Comparator.comparingDouble(Productos::getPrecio).reversed())
                .collect(Collectors.toList());
    }
}
