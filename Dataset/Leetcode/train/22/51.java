 class Solution {
    char[] path;
    List<String> res=new LinkedList<>();
    
    public List<String> XXX(int n) {
        path=new char[n*2];
        startFrom(0,0,0);
        return res;
    }
    //要确定path[i]位置的字符，left表示'(‘已经有几个
    private void startFrom(int i,int left,int right){
        if(left<right){
            return;
        }
        if(i==path.length){
            res.add(new String(path));
        }
        //
        //right>left
        if(left<path.length/2){
            path[i]='(';
            startFrom(i+1,left+1,right);
        }
        if(right<path.length/2){
            path[i]=')';
            startFrom(i+1,left,right+1);
        }
    }
}

