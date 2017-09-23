/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreakerstudent;

/**
 *
 * @author CDOGG_000
 */
public class Level {
     private int levelNum;
    private BrickRow[] brickRows;
    
    public Level(){
        levelNum=0;
        brickRows=new BrickRow[24];
        
    }
    public Level(int levelNum, int numBrickRows){
        this.levelNum=levelNum;
        brickRows=new BrickRow[numBrickRows];
        
    }

    /**
     * @return the levelNum
     */
    public int getLevelNum() {
        return levelNum;
    }

    /**
     * @param levelNum the levelNum to set
     */
    public void setLevelNum(int levelNum) {
        this.levelNum = levelNum;
    }

    /**
     * @return the brickRows
     */
    public BrickRow getBrickRows(int index) {
        return brickRows[index];
    }

    /**
     * @param brickRows the brickRows to set
     */
    public void setBrickRows(int index, BrickRow bkRow) {
        brickRows[index]=bkRow;
          }
    /*formats the string level to have the level number go to next line show the num of 
    brickrows in the specific level go to next line and show the brickrow */
    
    public String toString(){
      String level="Level: " +  levelNum + System.lineSeparator() + brickRows.length;
      for(int i=0;i<brickRows.length;i++){
       level += System.lineSeparator()+"Row: " + i +System.lineSeparator()+ brickRows[i]; 
    }
      return level;
}
    
}
