package Array;

public class Array_intro {

	public static void main(String[] args) {
		// 1_d
		// Declaration of Array
		/*
		 * int[] a; int[]a1; int a2[]; int[]a3; //Creation of Array int[] e = new
		 * int[5]; //it will compile and run
		 * 
		 * //Initialization of Array int[] h = new int[3]; h[0] = 100; h[1] = 200; h[2]
		 * = 300; h[3] = 400;
		 */ // Its show an error IndexOfBpundException because Array indexing begin with 0

		// 2 _Dimensional
		/*
		 * int[][] b; int[][]b1; int b2[][]; int[][]b3;
		 * 
		 * int[][] j = new int[2][3]; int[][] k = new int[2][3]; k[0][0] = 100; k[0][1]
		 * = 200; k[0][2] = 300; k[1][0] = 400; k[1][1] = 500; k[1][2] = 600;
		 * System.out.println(k[1][2]);
		 */

		int m[][] = { { 1, 4, 6 }, { 8, 7, 9 } };
		for (int i = 0; i < 2; i++) { // Row
			for (int j5 = 0; j5 < 3; j5++) { // Column
				System.out.println(m[i][j5]);
			}
		}

	}

}
