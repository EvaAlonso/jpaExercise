package com.example.tarjetaGraficaJpa.DAO;

import com.example.tarjetaGraficaJpa.entity.TarjetaGrafica;

import java.util.List;

public interface TarjetaGraficaDAO {

    void save(TarjetaGrafica tarjetaGrafica);
    TarjetaGrafica findById(Integer id);
    List<TarjetaGrafica> findAll();
    void update (TarjetaGrafica tarjetaGrafica);
    void delete (Integer id);


}








