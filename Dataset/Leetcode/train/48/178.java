class Solution {
    public void XXX(int[][] matrix) {
        int n = matrix.length;

        int a = 0;
        int half = n / 2;
        while (a < half) {
            for(int i = a;i < n - a - 1;i++) {
                int p = a, q = i;
                int v = matrix[p][q];
                for (int k = 0; k < 4; k++) {
                    int ni = q;
                    int nj = n - p - 1;
                    p = ni;
                    q = nj;
                    
                    int tmp = matrix[p][q];
                    matrix[p][q] = v;
                    v = tmp;
                }
            }
            a++;
        }
    }
}

