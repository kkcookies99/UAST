 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            Integer[] items = new Integer[i + 1];
            Arrays.fill(items, 1);
            ans.add(new ArrayList<>(Arrays.asList(items)));
        }
        if (numRows <= 2) return ans;
        List<Integer> cur, before;
        for (int i = 2; i < numRows; i++) {
            cur = ans.get(i);
            before = ans.get(i - 1);
            for (int j = 1; j < i; j++) {
                cur.set(j, before.get(j - 1) + before.get(j));
            }
        }
        return ans;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


