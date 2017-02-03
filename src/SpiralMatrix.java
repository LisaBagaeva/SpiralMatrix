public class SpiralMatrix {

	public static void printMatrix(int n) {
		int[][] matrix = new int[n][n];
		int i = 1, j = 0;
		int step = n / 2;

		while (i <= step) {

			j = i - 1;

			while (j < n - i + 1) {
				matrix[i - 1][j] = 6;
				// System.out.println("a[" + (i-1) + "][" + j + "] = " +
				// matrix[i-1][j]);
				j++;
			}

			// System.out.println();
			j = i;

			while (j < n - i + 1) {
				matrix[j][n - i] = 5;
				// System.out.println("a[" + j + "][" + (n-i) + "] = " +
				// matrix[j][(n-i)]);
				j++;
			}

			// System.out.println();
			j = n - 1 - i;

			while (j >= i - 1) {
				matrix[n - i][j] = 4;
				// System.out.println("a[" + (n-i) + "][" + j + "] = " +
				// matrix[n-i][j]);
				j--;
			}

			// System.out.println();
			j = n - 1 - i;

			while (j >= i) {
				matrix[j][i - 1] = 3;
				// System.out.println("a[" + j + "][" + (i-1) + "] = " +
				// matrix[j][i-1]);
				j--;
			}
			// System.out.println();
			i++;
		}

		if (n % 2 == 1)
			matrix[n / 2][n / 2] = 9;

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}

	public static void main(String[] argv) {
		SpiralMatrix.printMatrix(10);
	}
}
