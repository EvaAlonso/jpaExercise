package com.example.tarjetaGraficaJpa.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "tarjeta_grafica")
public class tarjetaGrafica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    public tarjetaGrafica() {
    }

    public tarjetaGrafica(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "tarjetaGrafica{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
