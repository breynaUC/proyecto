/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe.edu.cientifica.test;

import pe.edu.cientifica.config.Conexion;
import pe.edu.cientifica.daoImp.UsuarioDaoImpl;

/**
 *
 * @author docente
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(Conexion.getConexion()!=null){
            System.out.println("Conectado");
        }else{
            System.out.println("No conctado");
        }
        UsuarioDaoImpl impl = new UsuarioDaoImpl();
        if(impl.validar("dreyna", "1234567")){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
    }
    
}
