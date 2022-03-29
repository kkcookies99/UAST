 class Solution {
    public List<String> XXX(int n) {
        List<String> list = new ArrayList<>();
        if(n <= 0){
            return list;
        }
        StringBuilder sb = new StringBuilder();
        getCombinations(list, sb, n, n);
        return list;
    }
    private void getCombinations(List<String> list, StringBuilder cur, int left, int right){
        if(left < 0 || right < 0){
            return;
        }
        if(left == 0 && right == 0){
            String str = cur.toString();
            list.add(str);
            return;
        }
        if(left == right){
            // 放左括号
            cur.append("(");
            getCombinations(list, cur, left - 1, right);
            cur.deleteCharAt(cur.length() - 1);
        }else if(left < right){
            // 可以放左或者右
            cur.append("(");
            getCombinations(list, cur, left - 1, right);
            cur.deleteCharAt(cur.length() - 1);
            cur.append(")");
            getCombinations(list, cur, left, right - 1);
            cur.deleteCharAt(cur.length() - 1);
        }else{
            // left > right， 这种情况不应该出现
            return;
        }
        return;
    }
}

