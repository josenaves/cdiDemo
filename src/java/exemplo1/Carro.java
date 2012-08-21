/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jnaves
 */
@Named
@SessionScoped
@Log
public class Carro implements Serializable {
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
    
    @Inject private Event<CombustivelBaixo> abastecerEvento;
    
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
        System.out.println("--------------\n");
    }
    
    public void viajar() {
        abastecerEvento.fire(new CombustivelBaixo());
    }
    
    private void onCombustivelBaixo(@Observes CombustivelBaixo combustivelBaixo) {
        System.out.println("Evento CombustivelBaixo capturado - mensagem " + combustivelBaixo.getMensage());
    }
}
