/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hhd.sessionbeans;

import hhd.entities.Shippers;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author STUDENT
 */
@Stateless
public class ShippersFacade extends AbstractFacade<Shippers> implements ShippersFacadeLocal {

    @PersistenceContext(unitName = "Lab04-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ShippersFacade() {
        super(Shippers.class);
    }

    @Override
    public List<Shippers> findShipperById(int id) {
        Query query = em.createNamedQuery("Shippers.findByShipperID");
        query.setParameter("shipperID", id);
        return query.getResultList();
    }
    
}
