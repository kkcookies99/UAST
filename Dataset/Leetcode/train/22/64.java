 class Solution {
    List<String> result;
    public List<String> XXX(int n) {
        result=new ArrayList<>();
        _generate(0,0,n,"");
        return result;
    }

    private void _generate(int left,int right,int n,String s){
        if(left==n&&right==n){
            result.add(s);
            return;
        }
        if(left<n){
             _generate(left+1,right,n,s+"(");
        }
        if(left>right){
            _generate(left,right+1,n,s+")");
        }
    }
}```

