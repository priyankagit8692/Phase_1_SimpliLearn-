package com.simpli.MultiplyMatrices;

public class MultiplyMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r1 = 2, c1 = 3;
		int c2 = 2 ;
		int[][] firstMatrix = {{2,3,1},{3,0,6}};
		int[][] secondMatrix = {{2,3},{3,0},{7,2}};
		System.out.println("row length: "+firstMatrix.length);
		System.out.println("column length: "+firstMatrix[0].length);
		System.out.println("row length: "+secondMatrix.length);
		System.out.println("column length: "+secondMatrix[0].length);
		
		int[][] product = multiplyMatrices(r1, c1, c2, firstMatrix, secondMatrix);

		display(product);
	}

	private static void display(int[][] product) {
		for(int[] row : product) {
			for(int column : row) {
				System.out.println(column+"  ");
			}
			System.out.println();
		}
	}

	private static int[][] multiplyMatrices(int r1, int c1, int c2, int[][] firstMatrix, int[][] secondMatrix) {
		int[][] product = new int[r1][c2];
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c2; j++) {
				for(int k =0; k < c1; k++) {
					product[i][j] += firstMatrix[i][k]*secondMatrix[k][j];
				}
				
			}
		}
		return product;
	}

}
