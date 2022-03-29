 public List<List<Integer>> XXX(int numRows) {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> lastRow = null;
    // 逐行进行构建
    for (int i = 1; i <= numRows; i++) {
        List<Integer> row = new ArrayList<>(i);
        row.add(1);
        for (int j = 1; j < i-1; j++) {
            row.add(lastRow.get(j-1) + lastRow.get(j));
        }
        if(i>1) {
            row.add(1);
        }
        lastRow = row;
        ans.add(row);
    }
    return ans;
}

