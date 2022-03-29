 class Solution {
    public List<String> XXX(int n) {
        List<String> res = new ArrayList<String>();
        if(n == 0) return res;
        helper(n, 0, 0, res, new StringBuilder());
        return res;
    }
    private void helper(int n, int left, int right, List<String> res, StringBuilder sb){
        if(left == n && right == n){
            res.add(sb.toString());
            return;
        }else{
            if(left < n){
                sb.append('(');
                helper(n, left + 1, right, res, sb);
                sb.deleteCharAt(sb.length()-1);
            }
            if(right < n && right < left){
                sb.append(')');
                helper(n, left, right + 1, res, sb);
                sb.deleteCharAt(sb.length()-1);
            } 
        }
    }
}

