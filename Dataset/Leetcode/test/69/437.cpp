class Solution {
public:
    int XXX(int x) {
        if(x==1) return 1;
        int l=1,r=x/2+1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(mid<=x/mid){
                l=mid+1;
            }
            else if(mid>x/mid){
                r=mid;
            }
        }
        return l-1;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


