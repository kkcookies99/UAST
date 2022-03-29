 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        subList.add(1);
        list.add(subList);
        for (int i = 2; i <= numRows; i++) {
            List<Integer> preList = list.get(i - 2);
            subList = new ArrayList<>();
            subList.add(1);
            int preNum = preList.get(0);
            for (int j = 1, len = preList.size(); j < len; j++) {
                subList.add(preNum + preList.get(j));
                preNum = preList.get(j);
            }
            subList.add(1);
            list.add(subList);
        }
        return list;
    }
}

