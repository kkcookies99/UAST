 public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> numberList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                // 第一个数据为1，最后一个数据(即i == j的那个数据)为1
                if (j == 0 || i == j) {
                    numberList.add(1);
                } else {
                    // 前一行
                    List<Integer> preList = list.get(i - 1);
                    numberList.add(preList.get(j - 1) + preList.get(j));
                }
            }
            list.add(numberList);
        }
        return list;
    }

