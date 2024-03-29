package com.example;

public class ProductoBase {
    
    private String nombreProducto;
    private int idProducto;
    private Double precioBase;
    private int cantidad;
    private int descuento;
    private String nombreVendedor;

    public ProductoBase(String nombreProducto, int idProducto, Double precioBase, int cantidad, int descuento, String nombreVendedor) {
        this.nombreProducto = nombreProducto;
        this.idProducto = idProducto;
        this.precioBase = precioBase;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.nombreVendedor = nombreVendedor;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

}
