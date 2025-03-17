package com.example.tarjetaGraficaJpa.DAO;

public interface tarjetaGraficaDAO {

    void save(tarjetaGrafica tarjetaGrafica);
    tarjetaGrafica findById(Integer id);
}
