 public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> level = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    level.add(1);
                } else {
                    int num = result.get(i-1).get(j) + result.get(i-1).get(j-1);
                    level.add(num);
                }
            }
            result.add(level);
        }
        return result;
    }

