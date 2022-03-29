 class Solution {
    public void XXX(int[][] matrix) {
        List<Integer> list = new LinkedList<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                list.add(matrix[i][j]);
            }
        }

        for(int i = 0; i < matrix.length; i++){
            int size = list.size();
            size = size - matrix[0].length + i;
            for(int j = 0; j < matrix[0].length; j++){
                int num = list.get(size);
                matrix[i][j] = num;
                size = size -  matrix[0].length;
            }
        }
    }
}

