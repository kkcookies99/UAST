class Solution {
    public int XXX(int x) {
        long left=0,right=x;
        if(x==1) return 1;
        while(left<=right){
            long mid=left+(right-left)/2; 
            if(mid*mid==x){
                return (int)mid;
            }else if(mid*mid<x){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return (int)right;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


