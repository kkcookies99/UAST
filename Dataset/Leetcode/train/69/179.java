class Solution {
    public int XXX(int x) {
        int l=1, r=x;
        while(l<r){
            int mid =(l+r)>>1;
            if(mid>x/mid) r=mid;
            else l=mid+1; 
        }
        if(l*l==x) return l;
        return l-1;
    }
}

