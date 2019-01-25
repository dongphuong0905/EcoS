package Control;

import java.util.Random;

public class Animal  extends Thread implements IAnimal{
	protected double energy;
	protected boolean iMale;
	protected int speed;
	protected World world;
	protected int currentRow;
	protected int currentColum;	
	protected Random ran;
	@Override
	public Object eat(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object move(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCurrentRow() {
		return currentRow;
	}

	public void setCurrentRow(int currentRow) {
		this.currentRow = currentRow;
	}

	public int getCurrentColum() {
		return currentColum;
	}

	public void setCurrentColum(int currentColum) {
		this.currentColum = currentColum;
	}

	@Override
	public Object die(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object mate(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
