package com.example.tarjetaGraficaJpa.DAO;

import com.example.tarjetaGraficaJpa.entity.tarjetaGrafica;

public interface tarjetaGraficaDAO {

    void save(tarjetaGrafica tarjetaGrafica);
    tarjetaGrafica findById(Integer id);
}
