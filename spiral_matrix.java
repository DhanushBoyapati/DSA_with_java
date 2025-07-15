class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        List<Integer> arr = new ArrayList<>();

        while (top <= bottom && left <= right) {
            // Traverse Top Row
            for (int i = left; i <= right; i++) {
                arr.add(matrix[top][i]);
            }
            top++;

            // Traverse Right Column
            for (int i = top; i <= bottom; i++) {
                arr.add(matrix[i][right]);
            }
            right--;

            // Traverse Bottom Row (only if still within bounds)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse Left Column (only if still within bounds)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }

        return arr;
    }
}




// ✅ Example Input:
// java
// Copy
// Edit
// int[][] matrix = {
//     {1, 2, 3},
//     {4, 5, 6},
//     {7, 8, 9}
// };
// ✅ Output:
// csharp
// Copy
// Edit
// [1, 2, 3, 6, 9, 8, 7, 4, 5]
