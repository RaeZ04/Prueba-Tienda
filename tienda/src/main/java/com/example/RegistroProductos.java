package com.example;

import java.util.*;

public class RegistroProductos implements Productable {
    
    Map<Integer, ProductoBase> inventario = new HashMap<>();

    public void AgregarProducto (String nombreProducto, int idProducto, Double precioBase, int cantidad, int descuento, String nombreVendedor){

        ProductoBase nuevoProducto = new ProductoBase(nombreProducto, idProducto, precioBase, cantidad, descuento, nombreVendedor);
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
            System.out.println("Vendedor Externo: " + producto.getNombreVendedor());

        } else {

            System.out.println("No se encontró un producto con el ID proporcionado.");

        }
    }

    public void calcularPrecioUnitario(){

        for (Map.Entry<Integer, ProductoBase> entry : inventario.entrySet()) {

            ProductoBase producto = entry.getValue();
            Double PrecioUnitario = producto.getPrecioBase() * producto.getCantidad();
            Double Descuento = (PrecioUnitario * producto.getDescuento())/100;
            Double PrecioUnitarioDesc = PrecioUnitario - Descuento;
            System.out.println("ID: " + producto.getIdProducto() + ", Precio: " + PrecioUnitarioDesc);

        }

    }

    public void calcularPrecio(){

        Double PrecioTotal = 0.0;

        for (Map.Entry<Integer, ProductoBase> entry : inventario.entrySet()) {

            ProductoBase producto = entry.getValue();
            Double PrecioUnitario = producto.getPrecioBase() * producto.getCantidad();
            Double Descuento = (PrecioUnitario * producto.getDescuento())/100;
            Double PrecioUnitarioDesc = PrecioUnitario - Descuento;
            PrecioTotal = PrecioTotal + PrecioUnitarioDesc;
    
        }

        System.out.println("Precio Total: " + PrecioTotal);

    }

    Set<Integer> conjuntoDeIDs = new HashSet<>();

    public void ConjuntoIds(){

        for (Map.Entry<Integer, ProductoBase> entry : inventario.entrySet()) {

            ProductoBase producto = entry.getValue();
            int id = producto.getIdProducto();
            conjuntoDeIDs.add(id);
    
        }

    }

}
