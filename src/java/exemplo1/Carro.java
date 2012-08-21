/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jnaves
 */
@Named
public class Carro {
    private String fabricante;
    private String modelo;
    private int ano;
    
    public Carro() {
        this.fabricante = "Ford";
        this.modelo = "Fiesta";
        this.ano = 2008;
    }
    
    @Inject
    private Combustivel combustivel;
    
    public void especificao() {
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return "Carro:\nFabricante:" + fabricante + "\nModelo:" + modelo + "\nAno:" + ano + "\nCombustível:" + combustivel + "\nSerial:" + super.toString();
    }
    
    @PostConstruct
    public void qa(){
        System.out.println("Carro aprovado na inspeção de qualidade.");
    } 
    
    @PreDestroy
    public void ligaAlarme(){
        System.out.println("Carro desligado, vidros e travas acionados, alarme ligado.");
    }
}
