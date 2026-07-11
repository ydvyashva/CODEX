class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list= new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        int row1[]=new int [row];
        int col1[]=new int [col];
        for(int i=0; i<row;i++){
            int min= Integer.MAX_VALUE;
            for(int j=0;j<col;j++){
                min=Math.min(min,matrix[i][j]);
            }
            row1[i]=min;
        }
        for(int j=0; j<col; j++){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<row;i++){
                max=Math.max(max,matrix[i][j]);
            }
            col1[j]=max;
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col;j++){
                if(matrix[i][j]==row1[i] && matrix[i][j]== col1[j]){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
      }  
}