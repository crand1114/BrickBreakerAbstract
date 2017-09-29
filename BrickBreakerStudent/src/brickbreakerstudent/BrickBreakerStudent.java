/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreakerstudent;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CDOGG_000
 */
public class BrickBreakerStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*PlayerProfile player=new PlayerProfile();
       
       player.setName("Charles");
       String item ="brickbreakerprofiles.txt";
       for(int i=0;i<9;i++){
       player.setNumGamesPlayed(i);
      player.setSavedGames(i,item);
      player.addSavedGames(item);
      player.deleteSavedGames(i);
       
           
       }
       for(int i=0;i<21;i++){
       player.setHighScore(1997+i);    
       }
       System.out.println(player.toString());
           
        */try {
            BrickBreakerIO.readConfigFile("brickbreaker.txt");
            /*Level levelnum= new Level();
            
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
            
}*/
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BrickBreakerStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }  
       
// TODO code application logic here
   
    }
    

