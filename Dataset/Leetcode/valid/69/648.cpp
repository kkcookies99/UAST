class Solution {
public:
    int XXX(int x) {
       int l = 0,r=x;
       while(l<=r)
       {
           long mid = (l+r)/2;
           if(mid*mid == x)
           {
               return mid;
           }else if(mid*mid < x)
           {
               l = mid + 1;
           }else{
               r = mid - 1;
           }
       }
       return (l+r)/2;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


