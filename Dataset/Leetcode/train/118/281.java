 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> YHList = new ArrayList<>();
        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        YHList.add(firstList);
        if (numRows == 1) {
            return YHList;
        }
        List<Integer> lastList = firstList;
        for (int i = 0; i < numRows - 1; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j <= i; j++) {
                list.add(lastList.get(j - 1) + lastList.get(j));
            }
            list.add(1);
            lastList = list;
            YHList.add(list);
        }
        return YHList;
    }
}

