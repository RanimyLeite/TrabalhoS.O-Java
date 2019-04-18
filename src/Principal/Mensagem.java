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
public class Mensagem{
    
    private int max_msg;
    private int msg_armazenada = 0;
    
    public Mensagem(int max_msg){
        this.max_msg = max_msg;
    }
    
    public void insereMsg(int qtd_msg){
        if(!((msg_armazenada + qtd_msg) > max_msg) ){
           msg_armazenada += qtd_msg;
           Principal.qtd_msg_mailA.setText(""+msg_armazenada);
        }
    }
    
    public void retiraMsg(int qtd_msg){
        if(!((msg_armazenada - qtd_msg) < 0)){
            msg_armazenada -= qtd_msg;
            Principal.qtd_msg_mailA.setText(""+msg_armazenada);
        }
    }
    
    public int getQtdMsg(){
        return msg_armazenada;
    }
    
}
