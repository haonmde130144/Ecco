package control;

import java.util.Random;

public class Sheep extends Animal{
	public static double LOSS_ENERGY=0.01;
     public Sheep(double energy,int speed,World world,int column,int row) {
    	 this.energy = energy;
    	 this.speed = speed;
    	 this.world = world;
    	 this.currentRow = row;
    	 this.currentColumn = column;
    	 this.ran=new Random();
    	 this.iMale = ran.nextBoolean();
     }
     public Object move(Object o) {
 		int x=ran.nextInt(2*speed+1)-speed;
 		currentRow += x;
 		currentColumn += x;
 		currentRow=(currentRow >= world.nRow)?(currentRow -= world.nRow):currentRow;
 		currentColumn=(currentColumn >= world.nColumn)?(currentColumn -= world.nColumn):currentColumn;
 		currentRow=(currentRow>0)?(currentRow +=world.nRow):currentRow;
 		currentColumn=(currentColumn>0)?(currentColumn +=world.nColumn):currentColumn;
 		energy -= LOSS_ENERGY*speed;
 		return null;
 	}
     public void run() {
    	 while(true) {
    		 move(new Object());
    		 try {
   			  Thread.sleep(World.TIME_STEP);
   		     }catch(Exception e) {
   			    e.printStackTrace();
   		      }
    	 }
     }
}
