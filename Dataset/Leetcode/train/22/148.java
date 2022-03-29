 class Solution {
    public List<String> back = new LinkedList<>();
    
    public List<String> XXX(int n) {
        StringBuilder cur = new StringBuilder();
        recursive(n,n,cur);
        return back;
    }

    public void recursive(int Ri,int Li,StringBuilder cur){
        if(Ri==0&&Li==0){
            back.add(cur.toString());
            return ;
        }
        if(Ri==Li||Ri!=0){
            cur.append("(");
            recursive(Ri-1,Li,cur);
            int length =cur.length(); 
            cur.delete(length-1,length);
        }
        if(Li!=0&&Ri!=Li){
            cur.append(")");
            recursive(Ri,Li-1,cur);
            int length =cur.length(); 
            cur.delete(length-1,length);
        }
    }

}

