/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreakerstudent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.Color;





/**
 *
 * @author charles randall
 */
public class BrickBreakerIO {
    
    public static void readConfigFile(String cFileName) throws FileNotFoundException{
      try{
        Scanner input = new Scanner(new File(cFileName));
       int numlvl= Integer.parseInt(input.next());
       Level num []= new Level[numlvl];
       
       for(int i=0;i<num.length;i++){
          int levelnum= Integer.parseInt(input.next());
          int numBkRow=Integer.parseInt(input.next());
           num[i]=new Level(levelnum,numBkRow);
           for(int j=0; j<numBkRow;j++){
               int bkRowNum=Integer.parseInt(input.next());
               int red=Integer.parseInt(input.next());
               int green=Integer.parseInt(input.next());
               int blue=Integer.parseInt(input.next());
               Color rgb=new Color(red,green,blue);
               int ptVal=Integer.parseInt(input.next());
               String bMask=input.next();
               BrickRow bkset=new BrickRow(ptVal,rgb,bMask);
               num[i].setBrickRows(bkRowNum, bkset);
               
           }
           System.out.println(num[i].toString());
       }
       
       
       
       
       
      }
      catch(java.io.FileNotFoundException ex){
          
      }
        
       
    }
    
}
