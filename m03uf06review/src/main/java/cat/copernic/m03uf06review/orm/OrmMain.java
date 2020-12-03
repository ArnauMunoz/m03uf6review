/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf06review.orm;

import cat.copernic.m03uf06review.conexiobdd.ConexioBDD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 2 entrega
 *
 * En aquesta secció cal accedir a una taula de MySQL amb un camp de cada tipus:
 *
 * int o long, double o float, boolean, char, String i java.sql.Date
 *
 * Recòrrer el result set i mostrar-lo per la consola com a instancies de la
 * classe Registre, que tindrà l'estructura de la teva taula.
 *
 *
 * @author pep
 */
public class OrmMain extends ConexioBDD {

    static List<Persona> listaPersonas = new ArrayList();

    public static void fillPersonas() {

        Connection con = getConexioBDD();

        try {
            String query = "select * from persona";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                Persona p = new Persona(rs.getInt("persona_id"), rs.getString("persona_nom"),
                        rs.getString("persona_direccio"), rs.getDouble("persona_altura"),
                        rs.getBoolean("persona_viva"), rs.getDate("persona_naixement"));

                listaPersonas.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void showPersones() {
        for (int i = 0; i < listaPersonas.size(); i++) {
            System.out.println(listaPersonas.get(i));
        }
    }

    public static void main(String[] args) {
        fillPersonas();
        showPersones();
    }
}
