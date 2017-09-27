/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreakerstudent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author charles randall
 */
public class BrickBreakerIO {
    
    public static void readConfigFile(String cFileName) throws FileNotFoundException{
      try{
        Scanner input = new Scanner(new File(cFileName));
       int lvlnum= Integer.parseInt(input.next());
       
       
       
       
       
      }
      catch(java.io.FileNotFoundException ex){
          
      }
        
       
    }
    
}
