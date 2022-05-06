/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;



/**
 *
 * @author Aluno
 */
public class DesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fabrica fabrica = new Fabrica();
        
        Transporte obj1;
        
        obj1 = fabrica.getFabrica(1);
        Transporte obj2;
        
        Transporte obj3;
        
        obj2 = fabrica.getFabrica(2);
        
        obj1.abastecer();
        obj2.abastecer();
        
        obj1.entregar();
        obj2.entregar();
        
        obj3=fabrica.getFabrica(5);
        
        
    }
    
}
