 class Solution {
    private List<String> res;
    public List<String> XXX(int n) {
        this.res=new ArrayList<>();
        backTracking(n,n,"");
        return res;
    }
    private void backTracking(int left,int right,String temp){
        if(left==0 && right==0){
            res.add(temp);
            return;
        }
        if(left>0){
            backTracking(left-1,right,temp+'(');
        }
        if(left<right){
            backTracking(left,right-1,temp+')');
        }
    }
}

