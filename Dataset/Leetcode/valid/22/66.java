 class Solution {
    List<String> res = new ArrayList<>();
    public List<String> XXX(int n) {
        if(n==0) return res;
        int cnt1=1,cnt2=0;
        backtracing(n,res,"(",cnt1,cnt2);
        return res;
    }
    public void backtracing(int n,List<String> res, String s,int cnt1,int cnt2){
        if(cnt1==n&&cnt2==n){
            res.add(s);
            return;
        }
        if(cnt1==n){
            backtracing(n,res,s+')',cnt1,cnt2+1);
        }else if(cnt1>=cnt2){
            backtracing(n,res,s+'(',cnt1+1,cnt2);
            backtracing(n,res,s+')',cnt1,cnt2+1);
        }
    }
}

