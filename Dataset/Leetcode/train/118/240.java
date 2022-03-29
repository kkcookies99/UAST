 public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    list.add(1);
                } else {
                    list.add(result.get(i - 2).get(j - 2) + result.get(i - 2).get(j - 1));
                }
            }
            result.add(list);
        }

        return result;
    }

