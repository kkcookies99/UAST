 class Solution {
    public int nn;
    public List<String> res=new ArrayList<String>();
    public List<String> XXX(int n) {
        nn=n;
        proc("",0,0);
        return res;
    }
    public void proc(String temp,int c1,int c2)
    {
        if(c1>nn||c2>nn) return;
        if(c1==nn && c2==nn) res.add(temp);
        if(c1>=c2)
        {
            String temp2=new String(temp);
            proc(temp+"(",c1+1,c2);
            proc(temp2+")",c1,c2+1);
        }
    }
}

