package view;
import java.util.*;
import controller.ThreadsMatriz;

public class Main {
	public static void main(String[] args) {
		int random;
		int [][] matriz=new int [3][5];
		int l;
		for(l=0;l<3;l++) {
			for(int c=0;c<5;c++) {
				random=(int)(Math.random()*10)+1;
				matriz[l][c]=random;
			}
		}
		for(l=0;l<3;l++) {
			Thread threadsMatriz=new ThreadsMatriz(l,matriz);
			threadsMatriz.start();
		}
	}
}
