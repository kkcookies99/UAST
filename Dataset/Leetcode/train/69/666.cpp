class Solution {
public:
    int XXX(int x) {
       int l=0,r=x,mid;
       while(l<r)
       {
           mid=l+r>>1;
           if(1ll*mid*mid>x) r=mid-1;
           else l=mid+1;
       }
       if(1ll*l*l>x) return l-1;
       else return l;
    }
};

