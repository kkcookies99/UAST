 class Solution {
    public void XXX(int[][] matrix) {
        // 记得要写 2.0 不能是2
        double m = (matrix.length - 1 ) / 2.0;
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j <= m; j ++) {
                int nowX = j;
                int nowY = i;
                Vector v = new Vector(m - j, m - i);
                XXXLeft(v);
                int tmp = matrix[(int)(m - v.y)][(int)(m - v.x)];
                
                for (int z = 0; z < 3; z ++) {
                    matrix[(int)(m - v.y)][(int)(m - v.x)] = matrix[nowY][nowX];
                    XXXRight(v);
                    XXXRight(v);
                    nowX = (int)(m - v.x);
                    nowY = (int)(m - v.y);
                    XXXLeft(v);
                }

                matrix[(int)(m - v.y)][(int)(m - v.x)] = tmp;
            }   
        }        
    }

    public void XXXRight (Vector v) {
        double tmp = v.x;
        v.x = v.y;
        v.y = - tmp;
    }

    public void XXXLeft (Vector v) {
        double tmp = v.y;
        v.y = v.x;
        v.x = - tmp;
    }

    public static class Vector {
        double x, y;

        public Vector(double x, double y ){
            this.x = x;
            this.y = y;
        }
    }
}

