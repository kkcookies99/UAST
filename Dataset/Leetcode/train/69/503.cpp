class Solution {
public:
    int XXX(int x) {
        if(x<=1){
            return x;
        }
        int start = 1;
        int end = x;
        while(start<end){
            int mid = (end - start)/2 + start;
            if(mid>INT_MAX/mid || mid*mid>x){
                end = mid;
            }else if(mid*mid<x){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start-1;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


