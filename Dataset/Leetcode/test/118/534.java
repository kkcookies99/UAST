 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows == 0) return ans;
        ans.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> pre = ans.get(i - 1);
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int j = 1; j < i; j++) {
                cur.add(pre.get(j - 1) + pre.get(j));
            }
            cur.add(1);
            ans.add(cur);
        }
        return ans;
    }
}

