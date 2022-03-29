 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0 ; j < i ; j++) {
                if (j == 0 || j == i - 1) {
                    list.add(1);
                } else {
                    List<Integer> integerList = res.get(i - 2);
                    list.add(integerList.get(j - 1) + integerList.get(j));
                }
            }
            res.add(list);
        }
        return res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


