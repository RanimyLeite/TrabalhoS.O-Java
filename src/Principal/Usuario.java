/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Ibyte
 */
public class Usuario extends Thread {
    
    private boolean vivo = true;
    private int id;
    private float t_escrita;
    
    public Usuario(int id, float t_escrita){
        this.id = id;
        this.t_escrita = t_escrita * (float)(1000);
    }
    
    @Override
    public void run(){
        
        Principal.users_img.get(id-1).setEnabled(true);
        
        while(vivo){
          escreveMsg();
          
          Principal.downMutex_menssage();
          Principal.menssage +=1;
          Principal.upMutex_menssage();
          
          if(Principal.acordado == 0){ Principal.users_stats.get(id-1).setText("Dormindo"); }
          Principal.downMutex_acordado();
          Principal.downMutex_menssage();
          
          if(Principal.pombo != null){
            if (Principal.menssage >= Principal.pombo.getMaxMsg() && Principal.acordado ==0){
                Principal.upViajar();
            }
          }
          
          Principal.upMutex_menssage();
          Principal.upMutex_acordado();
          Principal.upMutex_acordado();
        }
        
        Principal.users_stats.get(id-1).setText("");
        Principal.users_img.get(id-1).setEnabled(false);
        Principal.users.set(id-1, null);
    }
    
    private void escreveMsg(){
        long initial_t;
        
        Principal.users_stats.get(id-1).setText("Escrevendo");
        
        initial_t = System.currentTimeMillis();
        while((System.currentTimeMillis() - initial_t) < (long)t_escrita){}
        
        Principal.mailbox_left.insereMsg(1);
    }
    
    public void excluirUsuario(){
        vivo = false;
    }
    
    public int getID(){
        return id;
    }
    
}
