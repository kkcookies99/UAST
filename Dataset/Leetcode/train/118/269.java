 public List<List<Integer>> XXX(int numRows) {
    List<List<Integer>> result = new ArrayList<>(numRows);
    List<Integer> preList = new ArrayList<>(1);
    for (int i = 1; i <= numRows; i++) {
        List<Integer> temp = new ArrayList<>(i);
        for (int j = 1; j <= i; j++) {
            if (j == 1 || j == i) {
                //首尾数填充
                temp.add(1);
            } else {
                //中间数
                temp.add(preList.get(temp.size() - 1) + preList.get(temp.size()));
            }
        }
        preList = temp;
        result.add(temp);
    }
    return result;
}

