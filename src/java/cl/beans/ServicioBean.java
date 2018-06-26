/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.beans;

import cl.entities.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HP EliteBook
 */
@Stateless
public class ServicioBean implements ServicioBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PersistenceContext(unitName = "GestionVentaPU")
    private EntityManager em;
    @Override
    public Usuario iniciarSesion(String rut, String clave){
        try {
            return  (Usuario) em.createNamedQuery("Usuario.iniciarSesion", Usuario.class)
                    .setParameter("rutUser", rut)
                    .setParameter("clave", clave)
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
