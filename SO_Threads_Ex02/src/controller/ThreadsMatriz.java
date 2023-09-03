package controller;

public class ThreadsMatriz extends Thread {

	private int linha;
	private int [][]matriz=new int[3][5];
	
	public ThreadsMatriz(int l, int [][]matriz) {
		this.linha=l;
		this.matriz=matriz;
	}
	
	@Override
	public void run() {
		soma();
	}
	
	private void soma() {
		int soma=0;
		for(int coluna=0;coluna<5;coluna++) {
			soma=soma+matriz[linha][coluna];
		}
		System.out.println("Soma da linha "+(linha+1)+": "+soma);
	}
}
