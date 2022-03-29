 class Solution {
    List<String> res = new ArrayList<>();

    public List<String> XXX(int n) {
        computer(n,n,new StringBuilder());
        return res;
    }

    public void computer(int l,int r,StringBuilder s){
                
        if (l==0&&r==0){
            res.add(s.toString());
            return ;
        }

        if (r<l || l <0){
            return ;
        }



        computer(l-1,r,s.append("("));
        s.deleteCharAt(s.length()-1);
        computer(l,r-1,s.append(")"));
        s.deleteCharAt(s.length()-1);
    }
}

