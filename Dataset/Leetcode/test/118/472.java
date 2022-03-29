 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        if(numRows == 0)
            return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>(numRows);
        for(int i = 0; i < numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            if(i == 0) {
                res.add(curr);
                continue;
            }
            List<Integer> prev = res.get(i-1);
            for(int j = 0; j < i-1; j++) {
                curr.add(prev.get(j)+prev.get(j+1));
            }
            curr.add(1);
            res.add(curr);
        }
        return res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


