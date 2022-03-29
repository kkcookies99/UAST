 class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;
        int tr = 0;
        int tc = 0;
        int br = n - 1;
        int bc = n - 1;
        while (tr <= br && tc <= bc) {
            XXXCycle(matrix, tr++, tc++, br--, bc--);
        }
    }

    private void XXXCycle(int[][] matrix, int tr, int tc, int br, int bc) {
        for (int i = 0; i < bc - tc; i++) {
            int i1 = matrix[tr][tc + i];
            int i2 = matrix[tr + i][bc];
            int i3 = matrix[br][bc - i];
            int i4 = matrix[br - i][tc];

            matrix[tr + i][bc] = i1;
            matrix[br][bc - i] = i2;
            matrix[br - i][tc] = i3;
            matrix[tr][tc + i] = i4;
        }
    }
}

