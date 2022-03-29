class Solution {
    public int XXX(int x) {
        if(x<2) return x;
        double l=0,r=x/2;
        while(r-l>1e-8){
            double mid=(l+r)/2.0;
            if(mid*mid>=x){
                r=mid;
            }else{
                l=mid;
            }
        }
        return (int)r;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


