 class Solution {
public:
    int XXX(int x) {
        int y=0;
       
        while(x){
            if(y > INT_MAX/10 || y < INT_MIN/10){
            return 0;
        }
            y=y*10+(x%10);
            x=x/10;
        }
       return y;
    }
};


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


