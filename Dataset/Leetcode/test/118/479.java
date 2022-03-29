 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> ls=new ArrayList<>(i+1);
            for (int j = 0; j < i + 1; j++) {
                if (j==0||j==i) ls.add(1);
                else ls.add((res.get(i-1).get(j-1)+res.get(i-1).get(j)));
            }
            res.add(ls);
        }
        return res;
    }
}

