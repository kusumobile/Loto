import lib.*;
import java.util.*;

public class Loto {

	private static final int WIN = 3;
	private static int size = 10;
	private static int[] lot = new int[size];
	private static int n = 0;

	public static void main(String[] args){

		init();

		loto();

		System.out.println("\nSize: " + size);

		System.exit(0);
		
	}

	private static void loto(){

		while(true){
	
			String b = Input.getString("Type return to break or the others to get result.");
				
			if(b == null) break;

			animation();

			if(size == 1){
				draw(lot[0]);
				break;
			}			

			draw(number());
		}

		return;

	}

	private static void init(){

		for(int i=0; i<(WIN); i++){

			lot[i] = 1;
		}

		for(int i=WIN; i<(lot.length-WIN); i++){

			lot[i] = 0;

		}



	}

	private static int number(){

		int p = (int)(Math.random()*size);
		int ret = lot[p];
		lot[p] = lot[size-1];
		size--;
		return ret;

	}

	private static void draw(int a){

		if(a==0) System.out.println("You lost.");
		else System.out.println("You won!");

	}

	private static void animation(){

		System.out.println();

		for(int i=0; i<10; i++){
			System.out.print("#");
			delay(100);
		}

		System.out.println();

	}

	private static void delay(int t){
	
		try{
			Thread.sleep(t);

		} catch(InterruptedException e) {

			e.printStackTrace();
		}
	}

}
