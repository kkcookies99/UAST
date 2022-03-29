 class Solution {
    public List<String> XXX(int n) {
        List<String> ret = new ArrayList();
        backtrack(0,0,"",n,ret);
        return ret;
    }

    private void backtrack(int used,int needPair,String s,int n,List<String> ret){
        if(used == n){
            for(int i=0;i<needPair;i++){
                s+=")";
            }
            ret.add(s);
            return;
        }
        // zuo
        backtrack(used+1,needPair+1,s+"(",n,ret);
        if(needPair>0){
            // you
            backtrack(used,needPair-1,s+")",n,ret);
        }
    }
}

