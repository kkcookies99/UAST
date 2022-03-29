 class Solution {
    public List<String> XXX(int n) {
        res = new LinkedList<>();
        tarverse(0, 0, n, new StringBuilder());
        return res;
    }
    List<String> res;
    void tarverse(int left, int right, int n, StringBuilder sb){
        if(right == n){
            res.add(sb.toString());
        }

        if(left < n){
            sb.append("(");
            tarverse(left + 1, right, n, sb.append("("));
        }

        if(right < left){
            sb.append(")");
            tarverse(left, right + 1, n , sb.append(")"));
        }

        if(sb.length() > 0){
            sb.deleteCharAt(sb.length() - 1);
        }

    }
}

