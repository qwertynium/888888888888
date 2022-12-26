package vsu.cs.vega.logic;


public class Solution {


	public static int[][] TurnRight90(int[][] array) {
		int rows = array.length;

		int cols = array[0].length;
		int a = 0;
		int[][] result = new int[cols][rows];
		for (int i = 0; i < cols; i++) {
			for (int j = rows - 1; j > -1; j--) {
				result[i][a] = array[j][i];
				a++;
			}
			a = 0;
		}
		return result;
	}

	public static int[][] TurnLeft90(int[][] array) {
		int rows = array.length;
		int cols = array[0].length;
		int a = 0;
		int[][] result = new int[cols][rows];
		for (int i = cols - 1; i > -1; i--) {
			for (int j = 0; j < rows; j++) {
				result[a][j] = array[j][i];
			}
			a++;
		}
		return result;
	}
}
