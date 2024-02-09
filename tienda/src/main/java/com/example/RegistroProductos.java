package com.example;

import java.util.*;

public class RegistroProductos {
    
    Map<Integer, ProductoBase> inventario = new HashMap<>();

    public void AgregarProducto (String nombreProducto, int idProducto, Double precioBase, int cantidad, int descuento){

        ProductoBase nuevoProducto = new ProductoBase(nombreProducto, idProducto, precioBase, cantidad, descuento);
        inventario.put(idProducto, nuevoProducto);

    }

    public void mostrarInformacion() {

        System.out.println("Listado de Productos:");

        for (Map.Entry<Integer, ProductoBase> entry : inventario.entrySet()) {

            ProductoBase producto = entry.getValue();
            System.out.println("ID: " + producto.getIdProducto() + ", Nombre: " + producto.getNombreProducto());

        }
    }

    public void mostrarInformacionProducto(int idProducto) {

        ProductoBase producto = inventario.get(idProducto);

        if (producto != null) {

            System.out.println("Información del Producto (ID: " + idProducto + "):");
            System.out.println("Nombre: " + producto.getNombreProducto());
            System.out.println("Precio Base: " + producto.getPrecioBase());
            System.out.println("Cantidad: " + producto.getCantidad());
            System.out.println("Descuento: " + producto.getDescuento());

        } else {

            System.out.println("No se encontró un producto con el ID proporcionado.");

        }
    }


}
