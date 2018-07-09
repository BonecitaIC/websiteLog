/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClsConexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author EstIvonneGeovannaCam
 */
public class Usuario extends clsConexion{
    String cedula, nickname,password, nombres, apellidos, tel_fijo, tel_celular, email,direccion;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTel_fijo() {
        return tel_fijo;
    }

    public void setTel_fijo(String tel_fijo) {
        this.tel_fijo = tel_fijo;
    }

    public String getTel_celular() {
        return tel_celular;
    }

    public void setTel_celular(String tel_celular) {
        this.tel_celular = tel_celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   
    public static String autenticacion(String nick, String pass){
       String log="false";
       clsConexion con=new clsConexion();
       ResultSet rs=null;
       String sql_Usuario="SELECT cedula FROM usuarios WHERE nickname='"+nick+"' AND password='"+pass+"'";
        try {
            rs=con.Consulta(sql_Usuario);
            while(rs.next()){
                log="true";
                System.out.println("ci"+rs.getString(0));
                
         }
        } catch (SQLException e) {
        }
        System.out.println(log);
        return log;
        
       

    }

}
