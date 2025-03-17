package com.example.tarjetaGraficaJpa.DAO;

import com.example.tarjetaGraficaJpa.entity.TarjetaGrafica;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TarjetaGraficaDAOImplements implements TarjetaGraficaDAO{
    private EntityManager entityManager;

    @Autowired
    public TarjetaGraficaDAOImplements(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(TarjetaGrafica theTarjetaGrafica){
        this.entityManager.persist(theTarjetaGrafica);
    }

    public TarjetaGrafica findById(int id){
        return this.entityManager.find(TarjetaGrafica.class, id);
    }
    @Override
    public TarjetaGrafica findById(Integer id) {
        return this.entityManager.find(TarjetaGrafica.class, id);
    }

    @Transactional
    public void update(TarjetaGrafica tarjetaGrafica) {
        entityManager.merge(tarjetaGrafica);
    }

    @Transactional
    public void delete(Integer id) {

        TarjetaGrafica tarjetaGrafica = this.entityManager.find(TarjetaGrafica.class, id);
        entityManager.remove(tarjetaGrafica);
    }
    @Override
    public List<TarjetaGrafica> findAll() {
        TypedQuery<TarjetaGrafica> theQuery;
        theQuery =
                entityManager.createQuery("FROM TarjetaGrafica", TarjetaGrafica.class);
        return theQuery.getResultList();
    }
}
