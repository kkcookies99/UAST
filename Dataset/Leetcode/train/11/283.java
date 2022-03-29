    public int XXX(int[] height) {
        int[][] dpTable = new int[height.length][height.length];
        for (int i = dpTable.length - 2; i >= 0; i--) {
            for (int j = i + 1; j <= dpTable[0].length - 1; j++) {
                int length = j - i;
                int minHeight = Math.min(height[i], height[j]);
                int max1 = length * minHeight;
                dpTable[i][j] = Math.max(max1, dpTable[i + 1][j]);
                dpTable[i][j] = Math.max(dpTable[i][j], dpTable[i][j - 1]);
            }
        }
        return dpTable[0][dpTable[0].length - 1];
    }

