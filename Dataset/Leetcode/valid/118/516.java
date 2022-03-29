 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows == 0) return ans;
        ans.add(Arrays.asList(1));
        for (int i = 1; i < numRows; ++i) {
            List<Integer> list = new ArrayList<>(i + 1);
            list.add(1);
            List<Integer> pre = ans.get(i - 1);
            for (int j = 1; j <= i; ++j) {
                int num = pre.get(j - 1);
                num += pre.size() > j ? pre.get(j) : 0;
                list.add(num);
            }
            ans.add(list);
        }
        return ans;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


