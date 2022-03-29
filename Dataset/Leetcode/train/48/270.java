public void XXX(int[][] matrix) {
        // 旋转90度，y轴变成x轴，x轴变-y轴
        int n = matrix.length;
        boolean[][] moved = new boolean[n][n];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (moved[x][y]) {
                    continue;
                }
                int newx = y;
                int newy = n - 1 - x;
                move(moved, matrix, matrix[x][y], newx, newy);
            }
        }

    }

    /**
     *
     * @param moved 设置了移动后的值就是true，未设置过就是false
     * @param matrix
     * @param val 需要设置的值
     * @param tarx val要设置的目标位置
     * @param tary val要设置的目标位置
     */
    void move(boolean[][] moved, int[][] matrix, int val, int tarx, int tary) {
        if (moved[tarx][tary]) {
            return;
        }
        int n = matrix.length;
        int newx = tary;
        int newy = n - 1 - tarx;
        int resourceVal = matrix[tarx][tary];//保存目标位置的原始值
        matrix[tarx][tary] = val;//移动到目标位置
        moved[tarx][tary] = true;
        move(moved, matrix, resourceVal, newx, newy);
    }

