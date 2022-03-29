     public int XXX(int m, int n) {
        if (m == 1 && n == 1) {
            return 1;
        }
        int[][] dpTable = new int[m][n];
        for (int i = 1; i < dpTable.length; i++) {
            dpTable[i][0] = 1;
        }
        for (int i = 1; i < dpTable[0].length; i++) {
            dpTable[0][i] = 1;
        }
        for (int i = 1; i < dpTable.length; i++) {
            for (int j = 1; j < dpTable[0].length; j++) {
                dpTable[i][j] = dpTable[i - 1][j] + dpTable[i][j - 1];
            }
        }
        return dpTable[dpTable.length - 1][dpTable[0].length - 1];
    }

