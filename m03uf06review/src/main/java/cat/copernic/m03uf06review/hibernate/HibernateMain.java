/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf06review.hibernate;

import cat.copernic.m03uf06review.conexiobdd.Controlador;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 * 3 entrega
 *
 * En aquesta secció cal accedir a una taula de MySQL amb un camp de cada tipus:
 *
 * int o long, double o float, boolean, char, String i java.sql.Date
 *
 * Recòrrer el result set i mostrar-lo per la consola com a instancies de la
 * classe Registre, que tindrà l'estructura de la teva taula.
 *
 * Cal usar la llibreria Hibernate.
 *
 *
 * @author pep
 */
public class HibernateMain {

    static Session sessio = Controlador.getSessionFactory().openSession();
    static Transaction tx = sessio.beginTransaction();
    static Persona persona = new Persona();
    static String viva;

    public static void main(String[] args) {
        showPersona(2);
        showLlistaPersones();

        tx.commit();
        sessio.close();

    }

    public static void addPersona(Persona persona) {
        sessio.save(persona);
    }

    public static void showPersona(Integer id) {
        Persona p = sessio.get(Persona.class, id);

        if (p.getPersona_viva() == true) {
            viva = "Si.";
        } else {
            viva = "No.";
        }

        System.out.println("\n------------------Persona ID: " + p.getPersona_id() + " ------------------");
        System.out.println("-Nom: " + p.getPersona_nom());
        System.out.println("-Direccio: " + p.getPersona_direccio());
        System.out.println("-Altura: " + p.getPersona_altura());
        System.out.println("-Viva: " + viva);
        System.out.println("-Nom: " + p.getPersona_naixement());
    }

    public static void showLlistaPersones() {
        String sql = "from Persona";
        Query query = sessio.createQuery(sql);
        List<Persona> llista = query.list();

        for (Iterator<Persona> it = llista.iterator(); it.hasNext();) {
            persona = it.next();

            if (persona.getPersona_viva() == true) {
                viva = "Si.";
            } else {
                viva = "No.";
            }

            System.out.println("\n------------------Persona ID: " + persona.getPersona_id() + " ------------------");
            System.out.println("-Nom: " + persona.getPersona_nom());
            System.out.println("-Direccio: " + persona.getPersona_direccio());
            System.out.println("-Altura: " + persona.getPersona_altura());
            System.out.println("-Viva: " + viva);
            System.out.println("-Nom: " + persona.getPersona_naixement());

        }
    }

}
