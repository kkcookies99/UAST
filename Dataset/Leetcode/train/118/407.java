 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> resList = new ArrayList<>();
        resList.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>(i);
            list.add(1);

            int index = 1;
            int len = i-1;
            List<Integer> lastList = resList.get(i-1);
            while (index <= len) {
                list.add(lastList.get(index) + lastList.get(index-1));
                index++;
            }
            list.add(1);
            resList.add(list);
        }
        System.out.println(resList);
        return resList;
    }
}

