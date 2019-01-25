package Control;
import java.util.Random;
public class World extends Thread{
	public int nRow;
	public int nColum;
	private double[][] grass;
	private double grassGrowingSpeed = 0.1;
	public static long TIME_STEP = 1000;
	Random ran;
	public Animal animal;
	public World(int row, int colum) {
		this.nRow = row;
		this.nColum = colum;
		ran = new Random();
		grass = new double[row][colum];
		for(int i=0; i<row; i++) {
			for(int j=0; j<colum; j++) {
				grass[i][j] = ran.nextDouble();
			}
		}
	}
	public double getGrass(int i, int j) {
		return grass[i][j];
	}
	public void run() {
		grow();
		while(true) {
			try {
				Thread.sleep(World.TIME_STEP);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void grow() {
			for (int i=0; i<nRow;i++) {
				for( int j=0; j<nColum ; j++) {
					grass[i][j] += ran.nextDouble()*grassGrowingSpeed;
					grass[i][j] = (grass[i][j]>1) ? 1 : grass[i][j];
					/*if (grass[i][j] > 1) {
						grass[i][j] = 1;
					}*/
				}
			}
			
		}
	}

	
