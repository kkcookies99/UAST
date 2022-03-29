 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList();
            list.add(1);
            for (int j = 1; j < i; j++) {
                List<Integer> last = res.get(i - 1);
                list.add(last.get(j - 1) + last.get(j));
            }
            if (i != 0) {
                list.add(1);
            }
            res.add(list);
        }

        return res;
    }
}

