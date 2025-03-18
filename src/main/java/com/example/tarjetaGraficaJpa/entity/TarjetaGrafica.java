package com.example.tarjetaGraficaJpa.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "tarjeta_grafica")
public class TarjetaGrafica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    private String manufacturer;

    public TarjetaGrafica() {
    }




    public TarjetaGrafica(int id, String name, String manufacturer) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "TarjetaGrafica{" +
                "id=" + id +
                ", name='" + name +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
