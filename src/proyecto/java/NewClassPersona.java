/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.java;

/**
 *
 * @author sena
 */
public class NewClassPersona {
     private String id;
     public void setid( String idParametro){
        this.id= idParametro;
     }      
    
    public String getId() {
        return this.id;         
    }  
    public void andar () {
                System.out.print(id + "esta caminando");
                
            }
    
}
