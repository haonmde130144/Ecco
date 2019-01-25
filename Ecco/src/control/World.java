package control;
import java.util.*;
public class World {
  public int nRow;
  public int nColumn;
  private double[][] cells;
  public World(int row , int column) {
	  nRow =row;
	  nColumn = column;
	  Random rd = new Random();
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
  
}
