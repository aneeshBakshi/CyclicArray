import java.util.*;

class RotateMatrix{
		
		private static void rotate(int[][] a, int n){
			for (int i = 0; i < n; i++) {
				reverseRow(a, i, n);
			}
			for (int i = 0; i < n; i++) {
				reverseColumn(a, i, n);
			}
		}

		private static void reverseColumn(int[][] matrix, int i, int n) {
			int j=0;
			int k=n-1;
			while(j<k) {
				int temp=matrix[j][i];
		    	matrix[j][i]=matrix[k][i];
		    	matrix[k][i]=temp;
				j++;
				k--;
			}

		}

		private static void reverseRow(int[][] matrix, int i, int n) {
			int j=0;
			int k=n-1;
			while(j<k) {
				int temp=matrix[i][j];
		    	matrix[i][j]=matrix[i][k];
		    	matrix[i][k]=temp;
				j++;
				k--;
			}
		}
		private static void displayMatrix(int matrix[][]){
        	for (int i = 0; i < matrix.length; i++){
            	for (int j = 0; j < matrix[i].length; j++)
            		System.out.print(matrix[i][j] + " ");
            	System.out.println();
        	}
    	} 

    	public static void main(String[] args) {
			int[][] matrix= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
			};
		
			rotate(matrix, 3);
			displayMatrix(matrix);
	}
}