  public List<List<Integer>> XXX(int numRows) {
        int col = numRows * 2 + 1;
        int[][] panel = new int[numRows][col];
        panel[0][numRows] = 1;
        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j < col - 1; j++) {
                panel[i][j] = panel[i - 1][j - 1] + panel[i - 1][j + 1];
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int[] ints : panel) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int anInt : ints) {
                if (anInt != 0){
                    row.add(anInt);
                }
            }
            result.add(row);
        }
        return result;
    }

