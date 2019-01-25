package Control;

import java.util.Random;

public class Sheep extends Animal {
	public static double LOST_ENERGY = 0.01;
	public Sheep(double energy, int speed, World world, int row, int colum) {
		this.energy = energy;
		this.speed = speed;
		this.world = world;
		this.currentRow = row;
		this.currentColum = colum;
		this.ran = new Random();
		this.iMale = ran.nextBoolean();
	}
	public Object move(Object o) {
		// TODO Auto-generated method stub
		currentRow += ran.nextInt(2*speed+1) - speed;
		currentColum += ran.nextInt(2*speed+1) - speed;
		if(currentRow >= world.nRow ) {
			currentRow %= world.nRow;
		}
		else if(currentRow < 0 ) {
			currentRow += world.nRow; 
		}
		if(currentColum >= world.nColum ) {
			currentColum %= world.nColum;
		}
		
		else if(currentColum < 0 ) {
			currentColum += world.nColum; 
		}
		energy -= LOST_ENERGY*speed;
		return null;
	}
	public void run() {
		while(true) {
			move(new Object());
			try {
				Thread.sleep(World.TIME_STEP);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
