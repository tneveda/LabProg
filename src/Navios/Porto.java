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
public class Porto {
    private int CtNavios;
    private int NoMaxNavios;
    private Navio[] navios;

    public Porto(int NoMaxNavios) {
        this.NoMaxNavios = NoMaxNavios;
        navios = new Navio[NoMaxNavios];
        CtNavios = 0;
        
    }

    public int getNoMaxNavios() {
        return NoMaxNavios;
    }

    public Navio[] getNavios() {
        return navios;
    }
    
    public void novoNavio (Navio n){
        if(CtNavios == NoMaxNavios){
            System.out.println("O número maximo de navios foi atingido!!! Estão presentes no porto" + NoMaxNavios + "navios");
        }
        boolean enc = false;
        for(int i= 0; i<CtNavios; i++){
            if(n.getMatricula().equals(navios[i].getMatricula())){
                enc = true;
                System.out.println("A Matricula"+ n.getMatricula() + " já existe");
            }
        }
        if(!enc){
            navios[CtNavios]= n;
            CtNavios ++;  
        }
    }
    
    public float getCapacidadeTotal() {
        float total = 0;
        for (int i= 0; i<CtNavios; i++){
            if(navios[i] instanceof Petroleiro)
                total += ((Petroleiro)navios[i]).getCarga();
            if(navios[i] instanceof portaContentores)
                total += ((portaContentores)navios[i]).getNoContentores()*10;
        }
        
        return total;
    }
    
    public static void main(String[] args) {
Porto porto = new Porto(3);
Petroleiro petro1 = new Petroleiro("1234"); petro1.setCarga(200);
portaContentores pConta1 = new portaContentores("2345"); pConta1.setNoContentores(50);
portaContentores pConta2 = new portaContentores("3456"); pConta2.setNoContentores(20);
Navio n = new Navio("0123");
Petroleiro petro2 = new Petroleiro("1234"); petro2.setCarga(200);
porto.novoNavio(petro1);
porto.novoNavio(petro2);
porto.novoNavio(pConta1);
porto.novoNavio(pConta2);
porto.novoNavio(n);
System.out.println("Capacidade total = " + porto.getCapacidadeTotal() + " toneladas.");
System.out.println("teste");
}
    
    
}
