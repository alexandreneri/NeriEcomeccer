package com.neri.bank.model.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.neri.bank.model.Pedido;
import com.neri.bank.model.StatusPedido;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
	List<Pedido> findAll();
	List<Pedido> findByStatus(StatusPedido aguardando);


// jpa puro
//	@PersistenceContext
//	private EntityManager entiryManager;
//	
//	public List<Pedido> retornaTodosOsPedidos(){
//		Query query = entiryManager.createQuery("select p from Pedido p", Pedido.class);
//		return query.getResultList();
//	}
//	

}
