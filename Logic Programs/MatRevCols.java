import java.lang.*;
import java.util.*;

class DemoMatrix {
	static void RevCol(int arr[][], int iRow, int iCol) {

		for (int j = 0; j < arr.length; j++) {
			int s = 0;
			int e = arr.length - 1;
			while (s < e) {
				int t = arr[s][j];
				arr[s][j] = arr[e][j];
				arr[e][j] = t;
				s++;
				e--;
			}

		}

	}
}

class MatRevCols {
	public static void main(String args[]) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the row");
		int row = sobj.nextInt();
		System.out.println("Enter the col");
		int col = sobj.nextInt();
		int arr[][] = new int[row][col];
		System.out.println("enter the elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter in Row index: " + i);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("enter in Row,Col:" + i + " , " + j);
				arr[i][j] = sobj.nextInt();
			}
		}
		DemoMatrix Dm = new DemoMatrix();
		Dm.RevCol(arr, row, col);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println(" ");
		}

	}

}