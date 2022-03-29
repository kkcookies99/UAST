 class Solution {
    public List<String> XXX(int n) {
        List<String> result = new LinkedList<>();
        recAdd(1,n,1,result,"(");
        return result;
    }
    public void recAdd(int depth,int maxdepth,int nr,List<String> result,String str){
        if(str.length() == maxdepth*2){
            result.add(str);
            return;
        }
        if(depth < maxdepth){
            recAdd(depth+1,maxdepth,nr+1,result,str+"(");
        }
        if(nr > 0)
            recAdd(depth,maxdepth,nr-1,result,str+")");
    }
}

