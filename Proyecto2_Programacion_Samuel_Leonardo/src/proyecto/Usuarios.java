/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author unwir
 */
public class Usuarios{
    private String passW; // Contraseña
    private String nomU;

    public Usuarios(String nomU, String passW){
        this.nomU = nomU;
        this.passW = passW;
    }
    
    
    public String getName(){
        return nomU;
    }
    public String getPass(){
        return passW;
    }
    
 
}
