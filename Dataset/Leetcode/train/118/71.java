 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        if(numRows == 0) return new ArrayList<List<Integer>>();
        int n = numRows;
        int[] f = new int[n+1];
        f[1] = 1;
        int last = 0,tmp = 0;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i = 1; i <= n; i++){
            last = 0;
            List<Integer> cur = new ArrayList<Integer>();
            for(int j = 1; j <= i; j++){
                tmp = f[j];
                f[j] += last;
                cur.add(f[j]);
                last = tmp;
            }
            ans.add(cur);
        }
        return ans;
    }
}