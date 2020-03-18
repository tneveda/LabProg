/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Navios;

/**
 *
 * @author tneve
 */
public class Petroleiro extends Navio{
    private float Carga;
    
    public Petroleiro(String matricula){
        super(matricula);
    }

    public float getCarga() {
        return Carga;
    }

    public void setCarga(float Carga) {
        this.Carga = Carga;
    }
    
    
    
}
