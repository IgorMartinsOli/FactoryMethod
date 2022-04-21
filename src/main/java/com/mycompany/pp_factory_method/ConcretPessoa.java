/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pp_factory_method;

/**
 *
 * @author igor_
 */
public class ConcretPessoa extends FactoryPessoa{
    @Override
    public Pessoa getPessoa(String nome, String sexo) {
        if(sexo.equals("M")){
            return new Homem(nome);
        }else{
            return new Mulher(nome);
        }
    }
}
