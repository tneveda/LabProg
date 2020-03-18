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
public class portaContentores extends Navio {
    private int NoContentores;

    public portaContentores(String Matricula) {
        super(Matricula);
    }

    public int getNoContentores() {
        return NoContentores;
    }

    public void setNoContentores(int NoContentores) {
        this.NoContentores = NoContentores;
    }
    
    
    
}
