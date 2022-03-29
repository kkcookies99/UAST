class Solution {
public:
    int XXX(int x) {
        if(x==0) return 0;
        if(x==1) return 1;
        int l,r=1,mid;
        while(r<x/r) r*=2;
        r+=1;
        l=r/2;
        while(l<r)
        {
            mid=(l+r)/2;
            if(mid<=x/mid) l=l<mid?mid:l+1;
            else r=mid;
            if(r-l==1&&r>x/r&&l<=x/l) return l;
        }
        if(l*l<=x)
        return l;
        else
        return l-1;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


