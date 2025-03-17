package com.example.tarjetaGraficaJpa.DAO;

public interface tarjetaGraficaDAO {

    void save(tarjetaGrafica tarjetaGrafica);

    tarjetaGrafica findById(Integer id);

    List<TarjetaGrafica> findAll();

}
@Override
public List<TarjetaGrafica> findAll() {
  TypedQuery<TarjetaGrafica> theQuery;
  theQuery =
 entityManager.createQuery("FROM TarjetaGrafica", TarjetaGrafica.class);
  return theQuery.getResultList();
}
@Repository
public class TarjetaGrafica implements tarjetaGraficaDAO{

    @Override
 public TarjetaGrafica findById(Integer id) {
return this.entityManager.find(TarjetaGrafica.class, id);
 }
    @Override
 @Transactional
public void update(TarjetaGrafica tarjetaGrafica) {
 entityManager.merge(tarjetaGrafica);
}
    @Override
@Transactional
public void delete(Integer id) {

TarjetaGrafica tarjetaGrafica = this.entityManager.find(TarjetaGrafica.class, id);
 entityManager.remove(tarjetaGrafica);
}



}
