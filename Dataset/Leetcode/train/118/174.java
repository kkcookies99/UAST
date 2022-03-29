 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 1) {
            list.add(Arrays.asList(1));
            return list;
        }
        for (int i = 1 ; i <= numRows ; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    tmp.add(1);
                } else {
                    tmp.add(list.get(i-2).get(j-2)+list.get(i-2).get(j-1));
                }
            }
            list.add(tmp);
        }
        return list;
    }
}

