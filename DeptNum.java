/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoFinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author luiis
 */
public class DeptNum {

    private int Num;
    private String Nombre;

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String toString() {
        return this.Nombre;
    }

    public Vector<DeptNum> mostrarDept() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        Vector<DeptNum> Datos = new Vector<DeptNum>();
        DeptNum dat = null;
        try {
            String sql = "SELECT * FROM DEPT";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new DeptNum();
            dat.setNum(0);
            dat.setNombre("Selecciona Departamento");
            Datos.add(dat);

            while (rs.next()) {
                dat = new DeptNum();
                dat.setNum(rs.getInt("deptno"));
                dat.setNombre(rs.getString("dname"));
                Datos.add(dat);

            }

            rs.close();
        } catch (SQLException E) {
            System.out.println(E.toString());
        }
        
        return Datos;
    }

}







