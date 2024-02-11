package com.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        RegistroProductos registroProductos = new RegistroProductos();
        boolean dentro = true;
        int eleccion;

        System.out.print("¿Es vendedor externo? ");
        String respuesta = IO.leerString();

        if (respuesta.equalsIgnoreCase("si")) {
            
            System.out.println("Introduce el nombre del vendedor externo:");
            String nombreVendedor = IO.leerString();
            System.out.println();

            while (dentro) {

                System.out.println("");
                System.out.println("     Tienda (" + nombreVendedor + ")");
                System.out.println("");
                System.out.println("1. Agregar Producto.");
                System.out.println("2. Mostrar Productos.");
                System.out.println("3. Calcular Precio.");
                System.out.println("4. Calcular Precio Unitario.");
                System.out.println("5. Salir.");
                System.out.println("");
                System.out.print("Elige una opción: ");
    
                eleccion = IO.leerInt();
    
                if (eleccion == 1) {
    
                    System.out.println("");
                    System.out.print("Introduce el nombre del producto: ");
                    String nombre = IO.leerString();
                    System.out.print("ID: ");
                    
                    Integer idProd = (int) (Math.random() * 1000) + 1;
                    System.out.println(idProd);
                    if (registroProductos.conjuntoDeIDs.contains(idProd)) {
                        idProd = (int) (Math.random() * 1000) + 1;
                    }
    
                    System.out.print("Introduce el precio base: ");
                    Double preciobase = IO.leerDouble();
                    System.out.print("Introduce la cantidad: ");
                    int cantidad = IO.leerInt();
                    System.out.print("Introduce el descuento: ");
                    int descuento = IO.leerInt();
                    registroProductos.AgregarProducto(nombre, idProd, preciobase, cantidad, descuento);
    
                }
    
                else if (eleccion == 2) {
    
                    System.out.println("");
                    registroProductos.mostrarInformacion();
                    System.out.println("");
                    System.out.print("Introduce el ID del producto para ver más detalles: ");
                    int idElegido = IO.leerInt();
                    System.out.println("");
                    registroProductos.mostrarInformacionProducto(idElegido);
    
                }
    
                else if (eleccion == 3) {
    
                    System.out.println("");
                    registroProductos.calcularPrecio();
    
                } else if (eleccion == 4) {
    
                    System.out.println("");
                    registroProductos.calcularPrecioUnitario();
    
                } else if (eleccion == 5) {
    
                    System.out.println("Has salido del programa.");
                    dentro = false;
    
                } else {
    
                    System.out.println("Has introducido una opción incorrecta, elija del 1-5.");
    
                }
    
            }

        }
        else if (respuesta.equalsIgnoreCase("no")) {
            
            while (dentro) {

                System.out.println("");
                System.out.println("     Tienda     ");
                System.out.println("");
                System.out.println("1. Agregar Producto.");
                System.out.println("2. Mostrar Productos.");
                System.out.println("3. Calcular Precio.");
                System.out.println("4. Calcular Precio Unitario.");
                System.out.println("5. Salir.");
                System.out.println("");
                System.out.print("Elige una opción: ");
    
                eleccion = IO.leerInt();
    
                if (eleccion == 1) {
    
                    System.out.println("");
                    System.out.print("Introduce el nombre del producto: ");
                    String nombre = IO.leerString();
                    System.out.print("ID: ");
                    
                    Integer idProd = (int) (Math.random() * 1000) + 1;
                    System.out.println(idProd);
                    if (registroProductos.conjuntoDeIDs.contains(idProd)) {
                        idProd = (int) (Math.random() * 1000) + 1;
                    }
    
                    System.out.print("Introduce el precio base: ");
                    Double preciobase = IO.leerDouble();
                    System.out.print("Introduce la cantidad: ");
                    int cantidad = IO.leerInt();
                    System.out.print("Introduce el descuento: ");
                    int descuento = IO.leerInt();
                    registroProductos.AgregarProducto(nombre, idProd, preciobase, cantidad, descuento);
    
                }
    
                else if (eleccion == 2) {
    
                    System.out.println("");
                    registroProductos.mostrarInformacion();
                    System.out.println("");
                    System.out.print("Introduce el ID del producto para ver más detalles: ");
                    int idElegido = IO.leerInt();
                    System.out.println("");
                    registroProductos.mostrarInformacionProducto(idElegido);
    
                }
    
                else if (eleccion == 3) {
    
                    System.out.println("");
                    registroProductos.calcularPrecio();
    
                } else if (eleccion == 4) {
    
                    System.out.println("");
                    registroProductos.calcularPrecioUnitario();
    
                } else if (eleccion == 5) {
    
                    System.out.println("Has salido del programa.");
                    dentro = false;
    
                } else {
    
                    System.out.println("Has introducido una opción incorrecta, elija del 1-5.");
    
                }
    
            }

        }
        else{

            System.out.println("No has introducido una opcion valida, responde con 'Si' o 'No'");

        }
    }
}