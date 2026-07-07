class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if(matrix.length == 0) return list;

        int minr = 0;
        int maxr = matrix.length - 1;
        int minc = 0;
        int maxc = matrix[0].length - 1;
        int total = matrix.length * matrix[0].length;
        int count = 0;

        while(count < total) {
            // Traverse top row
            for(int i = minc; i <= maxc && count < total; i++) {
                list.add(matrix[minr][i]);
                count++;
            }
            minr++;

            // Traverse right column
            for(int i = minr; i <= maxr && count < total; i++) {
                list.add(matrix[i][maxc]);
                count++;
            }
            maxc--;

            // Traverse bottom row
            for(int i = maxc; i >= minc && count < total; i--) {
                list.add(matrix[maxr][i]);
                count++;
            }
            maxr--;

            // Traverse left column
            for(int i = maxr; i >= minr && count < total; i--) {
                list.add(matrix[i][minc]);
                count++;
            }
            minc++;
        }

        return list;
    }
}
