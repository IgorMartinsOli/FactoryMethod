/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.mycompany.pp_factory_method;

public class App {
   
    public static void main(String[] args) {
        ConcretPessoa factory = new ConcretPessoa();
        
        String nome = "Jose";
        String sexo = "m";
        
        factory.getPessoa(nome, sexo);
        
        nome = "Maria";
        sexo = "f";
        
        factory.getPessoa(nome, sexo);
        
    }
}
