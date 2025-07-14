import java.util.Scanner;

public class Main {
    public static void setZeroes(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        boolean firstRowZero = false, firstColZero = false;

        // 1️⃣ Check if first row or first column contain 0
        for (int j = 0; j < C; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }
        for (int i = 0; i < R; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // 2️⃣ Use first row/col as markers for rows/cols to be zeroed
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // 3️⃣ Zero out cells based on markers
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 4️⃣ Finally, zero the entire first row and/or first column if needed
        if (firstRowZero) {
            for (int j = 0; j < C; j++) {
                matrix[0][j] = 0;
            }
        }
        if (firstColZero) {
            for (int i = 0; i < R; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("enter the no of rows and coloums: ");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];
              System.out.print("enter elements in matrix: ");
            // Read binary matrix (1s and 0s)
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Apply the in-place zeroing algorithm
            setZeroes(matrix);
             System.out.println("Output: ");
            // Output the modified matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        

        sc.close();
    }
}


// Input:


// 3 3
// 1 0 1
// 1 1 1
// 1 1 0


// Output:

// 0 0 0
// 1 0 0
// 0 0 0
