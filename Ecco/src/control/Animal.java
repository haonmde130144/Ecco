package control;

import java.util.Random;

public class Animal extends Thread implements IAnimal {
    protected double energy;
    protected boolean iMale;
    protected int speed;
    protected World world;
    protected int currentRow;
    protected int currentColumn;
    protected Random ran;
	@Override
	public Object eat(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object mate(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object die(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object move(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public double getEnergy() {
		return energy;
	}

	public void setEnergy(double energy) {
		this.energy = energy;
	}

	public boolean isiMale() {
		return iMale;
	}

	public void setiMale(boolean iMale) {
		this.iMale = iMale;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

	public int getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}

	public int getCurrentColumn() {
		return currentColumn;
	}

	public void setCurrentColumn(int currentColumn) {
		this.currentColumn = currentColumn;
	}

	public Random getRan() {
		return ran;
	}

	public void setRan(Random ran) {
		this.ran = ran;
	}

}
