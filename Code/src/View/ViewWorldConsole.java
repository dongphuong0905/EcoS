package View;

import Control.Animal;
import Control.Sheep;
import Control.World;

public class ViewWorldConsole {
	public static void main(String[] args) {
		World v_world = new World(5,7);	
		Animal animal = new Sheep(10,1,v_world,0,0);
		v_world.animal = animal;
		animal.start();
		v_world.start();
		while(true) {
			double[][] view = new double[v_world.nRow][v_world.nColum];
			for(int i=0; i<v_world.nRow; i++) {
				for(int j=0; j<v_world.nColum; j++) {
					view[i][j] = v_world.getGrass(i, j);	
				}
			}
			view[animal.getCurrentRow()][animal.getCurrentColum()] = 2;
			for(int i=0; i<v_world.nRow; i++) {
				for(int j=0; j<v_world.nColum; j++) {
					System.out.printf("%.2f ",view[i][j]);
				}
				System.out.println();
			}
			try {
				Thread.sleep(World.TIME_STEP);
			} catch (Exception e) {

			}
		}
		
	}
}
