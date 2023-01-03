
package br.com.unipar.pcbuild.models;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Computador {
    private Double vlTotal = 0.0;
    private ArrayList<Peca> pecas = new ArrayList<Peca>();
    
    public void GerarTotal(){
       for(int i = 0;i<pecas.size();i++){
           vlTotal  = vlTotal + pecas.get(i).getValor();
       }
    }
    
    
}
