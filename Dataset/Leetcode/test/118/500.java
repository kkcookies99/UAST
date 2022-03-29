 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            res.add(new ArrayList<>());
            long n=1;
            for(int j=0;j<=i;j++){
                res.get(i).add((int)n);
                n=n*(i-j)/(j+1);
            }
        }
        return res;
    }
}

