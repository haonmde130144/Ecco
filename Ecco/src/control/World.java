package control;
import java.util.*;
public class World extends Thread {
  public int nRow;
  public int nColumn;
  private double[][] cells;
  private double grassGrowinSpeed = 0.1;
  public static long TIME_STEP= 5000;
  Random rd;
  public Animal animal;
  public World(int row , int column) {
	  nRow =row;
	  nColumn = column;
	  rd = new Random();
	  cells = new double[row][column];
	  for(int i=0 ; i<row;i++) {
		  for(int j=0;j<column;j++) {
			  cells[i][j]= rd.nextDouble();
		  }
	  }
	  
  }
  public double getGrass(int i, int j) {
	  return cells[i][j];
     
  }
  public void run() {
	  while(true) {
		  grow();
		  try {
			  Thread.sleep(World.TIME_STEP);
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
	}
  }
  private void grow() {
		  for(int i=0;i<nRow;i++) {
			  for(int j=0;j<nColumn;j++) {
				  cells[i][j]+=rd.nextDouble() * grassGrowinSpeed;
				  /*if(cells[i][j]>1) {
					  cells[i][j] = 1;
				  }*/
				  cells[i][j]=(cells[i][j]>1)?1:cells[i][j];
			  }
		  }
}
}
