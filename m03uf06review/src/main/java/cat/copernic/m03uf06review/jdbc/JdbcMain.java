/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf06review.jdbc;

import cat.copernic.m03uf06review.hibernate.conexiobdd.ConexioBDD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * En aquesta secció cal accedir a una
 * taula de MySQL amb un camp de cada tipus:
 *
 * int o long, double o float, boolean, char, String i java.sql.Date
 *
 * Recòrrer el result set i mostrar-lo per la consola.
 *
 *
 * @author pep
 */
public class JdbcMain extends ConexioBDD {

    static ResultSet rs;

    public static void main(String[] args) {
        getDades();
    }

    public static void getDades() {

        Statement st = null;
        Connection con = getConexioBDD();
        String query = "SELECT * FROM persona";

        try {

            st = con.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                Integer persona_id = rs.getInt("persona_id");
                String persona_nom = rs.getString("persona_nom");
                String persona_direccio = rs.getString("persona_direccio");
                Double persona_altura = rs.getDouble("persona_altura");
                Boolean persona_viva = rs.getBoolean("persona_viva");
                Date persona_naixement = rs.getDate("persona_naixement");
                String viu;
                if (persona_viva == true) {
                    viu = "Si.";
                } else {
                    viu = "No.";
                }
                System.out.println("\n--------------------------------------------------"
                        + "\nID: " + persona_id + "\nNom: " + persona_nom
                        + "\nDirecció: " + persona_direccio + "\nAltura: "
                        + "" + persona_altura + " cm\nEsta viu/viva? "
                        + viu + "\nDia de naixement: "
                        + persona_naixement);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

    }
}
