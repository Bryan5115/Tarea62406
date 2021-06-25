/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import ico.fes.herencia.Alumno;

/**
 *
 * @author user
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno estudiante=new Alumno("318180386", "ICO", 2, "Bryan", 18, 1, 1.68f);
        System.out.println(estudiante);
        System.out.println("Edad: " + estudiante.getEdad());
    }
    
}
