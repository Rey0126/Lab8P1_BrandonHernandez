/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_brandonhernandez;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author brhb2
 */
public class Libro {
    
    String titulo;
    String escritor;
    int año;
    
    public Libro(){
        
    }
    
    public Libro(String tituloN, String escritorN, int añoN){
        
        this.titulo = tituloN;
        this.escritor = escritorN;
        this.año = añoN;
        
    }
    
    public String getNombre(){
        return this.titulo;
    }
    
    public String getEscritor(){
        return this.escritor;
    }
    
    public int getAño(){
        return this.año;
    }
    
    public void setNombre(String tituloN){
        this.titulo = tituloN;
    }
    
    public void setEscritor(String escritorN){
        this.escritor = escritorN;
    }
    
    public void setAño(int añoN){
        this.año = añoN;
    }
    
}
