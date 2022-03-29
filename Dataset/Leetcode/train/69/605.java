class Solution {
    public int XXX(int x) {
        int l = 0,r = x,m;
        if(x>46339){
            r=46339;
        }
        while(l<=r){
            // System.out.println(l+" "+r);
            m = l+(r-l)/2;
            if(m*m==x){
                
                return m;
            }else if(m*m>x){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        
        if(l*l>x){
            return l-1;
        }
        return l;
    }
}

