 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(1);
            for (int j = 1; j < i; j++) {
                int sumnum = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                temp.add(sumnum);
            }
            if (i > 0) {
                temp.add(1);
            }
            res.add(temp);
        }
        return (List)res;
    }
}

