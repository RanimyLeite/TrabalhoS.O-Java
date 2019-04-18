
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

public class Pombo extends Thread {
    
    private boolean vivo = true;
    private float t_carga, t_descarga, t_voo;
    private int max_msg;
    
    public Pombo(float t_carga, float t_descarga, float t_voo, int max_msg){
       this.t_carga = t_carga * (float)(1000);
       this.t_descarga = t_descarga * (float)(1000);
       this.t_voo = t_voo * (float)(1000);
       this.max_msg = max_msg;
    }
    
    @Override
    public void run(){
        Principal.img_pombo.setEnabled(vivo);
        Principal.status_pombo.setText("executando...");
        
        while(vivo){
            Principal.downViajar();
            Principal.downMutex_menssage();
            Principal.downMutex_acordado();
            Principal.acordado = 1;
            Principal.status_pombo.setText("executando...");
            Principal.menssage -= max_msg;
            Principal.upMutex_acordado();
            Principal.upMutex_menssage();
            
            executar_viagem();
            
            Principal.downMutex_menssage();
            if (Principal.menssage >= max_msg){
                Principal.upViajar();
            }
            else {
                Principal.status_pombo.setText("esperando...");
                Principal.downMutex_acordado();
                Principal.acordado = 0;
                Principal.upMutex_acordado();
            }
            Principal.upMutex_menssage();
        }
        
        Principal.img_pombo.setEnabled(vivo);
        Principal.status_pombo.setText("pombo libertado...");
    }
    
    private void carregar(){
        Principal.status_pombo.setText("carregando mensagens...");
        Principal.mailbox_left.retiraMsg(max_msg);
    }
    
    private void descarregar(){
        Principal.status_pombo.setText("descarregando mensagens...");
        Principal.mailbox_rigth.insereMsg(max_msg);
    }
    
    private void executar_viagem(){
        long initial_t;
        
        carregar();
        initial_t = System.currentTimeMillis();
        while((System.currentTimeMillis() - initial_t) < (long)t_carga){}
        
        Principal.status_pombo.setText("voando para B...");
        initial_t = System.currentTimeMillis();
        while((System.currentTimeMillis() - initial_t) < (long)t_voo){}
        
        descarregar();
        initial_t = System.currentTimeMillis();
        while((System.currentTimeMillis() - initial_t) < (long)t_descarga){}
        
        Principal.status_pombo.setText("voando para A...");
        initial_t = System.currentTimeMillis();
        while((System.currentTimeMillis() - initial_t) < (long)t_voo){}
    }
    
    public void libertarPombo(){
        vivo = false;
    }
    
    public int getMaxMsg(){
        return max_msg;
    }
    
}
