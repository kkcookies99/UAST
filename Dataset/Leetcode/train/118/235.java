 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> cur = iterator(i, pre);
            ans.add(cur);
            pre = cur;
        }
        return ans;
    }

    public List<Integer> iterator(int n,List<Integer> pre) {
        List<Integer> list = new ArrayList<>();
        if (n == 1) {
            list.add(1);
            return list;
        }

        if (n == 2) {
            list.add(1);
            list.add(1);
            return list;
        }
        list.add(1);
        for (int i = 1; i < n - 1; i++) {
            list.add(pre.get(i - 1) + pre.get(i));
        }
        list.add(1);
        return list;
    }
}

