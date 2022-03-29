 class Solution {
    private List<String> res = new ArrayList<>();
    public List<String> XXX(int n) {
        _gen("",0,0,n);
        return res;
    }

    private void _gen(String result, int left, int right,int n) {
        if (left == n && right == n){
            res.add(result);
            return;
        }

        if (left < n) {
            _gen(result +"(",left + 1,right,n);
        }
        if (right < left && right < n){
            _gen(result +")",left,right + 1,n);
        }
    }
}

