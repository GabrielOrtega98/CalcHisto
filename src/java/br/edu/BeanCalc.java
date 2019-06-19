/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Gabriel Ortega
 */

@ManagedBean
@ApplicationScoped
public class BeanCalc {
    private List<String> historico = new ArrayList<>();
    private int a;
    private int b;
    private int numitem;
    
    public List<String> getHistorico(){
     return historico;
    }
    

    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }        
    
    public void somar(){
        int resultado= a+b;
        historico.add(a+"+"+ b + "="+ resultado);
    }
    public void subtrair(){
        int resultado= a-b;
        historico.add(a+"-"+ b + "="+ resultado);
    }
    public void limpar(){
        historico.clear();
        
    }
    public void limparnum(){
        historico.remove(numitem-1);
        
}

    /**
     * @return the numitem
     */
    public int getNumitem() {
        return numitem;
    }

    /**
     * @param numitem the numitem to set
     */
    public void setNumitem(int numitem) {
        this.numitem = numitem;
    }
}