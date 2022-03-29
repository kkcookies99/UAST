 class Solution {
    List<String>list=new ArrayList<>();
    int n;
    public List<String> XXX(int n) {
        this.n=n;
        if(n<=0)
            return list;
        huisu(0,0,"");
        return list;
    }
    public void huisu(int zuo_number,int you_number,String s)
    {
        //
        if(s.length()==2*n)
        {
            list.add(s);
            return ;
        }
        //先加入左
        if(zuo_number<n)
            huisu(zuo_number+1,you_number,s+"(");
        //需要加入右
        if(you_number<zuo_number)
            huisu(zuo_number,you_number+1,s+")");
    }
}

