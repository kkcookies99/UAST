     public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> subset = new ArrayList<>();
            if (i <= 1) {
                for (int j = 0; j <= i; j++) {
                    subset.add(1);
                }
            } else {
                List<Integer> upper = result.get(i - 1);
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        subset.add(1);
                    } else {
                        subset.add(upper.get(j) + upper.get(j - 1));
                    }
                }
            }
            result.add(subset);
        }
        return result;
    }

