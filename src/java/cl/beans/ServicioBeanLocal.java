/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.beans;

import cl.entities.Usuario;
import javax.ejb.Local;

/**
 *
 * @author HP EliteBook
 */
@Local
public interface ServicioBeanLocal {
    Usuario iniciarSesion(String rut, String clave);
}
