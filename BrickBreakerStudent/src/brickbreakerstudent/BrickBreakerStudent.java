/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreakerstudent;

import javafx.scene.paint.Color;

/**
 *
 * @author CDOGG_000
 */
public class BrickBreakerStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Level levelnum= new Level();
         BrickRow row = new BrickRow();
         
        for (int i=0; i<11; i++) {   
        levelnum.setBrickRows(i, row);
        levelnum.setLevelNum(i);
        
   
        for(int j=0; j<20;j++){
            
            row.setBrickMaskValue(j, true);
            row.setPointValue(10);
            row.setColor(Color.BEIGE);
            
        }
          System.out.println(levelnum.toString()+row.toString());
          
        //}
       
    }  
       
// TODO code application logic here
   
    }
    
}
