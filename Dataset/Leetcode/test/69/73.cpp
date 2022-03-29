class Solution {
public:
    int XXX(int x) {
        if(x==0) return 0;
        int l=1,r=x;
        long int mid;
        while(l<=r) {
            mid = l+(r-l)/2;
            if(mid==l) break;
            if(mid*mid > x) r=mid;
            else l=mid;
        }
        return mid;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


