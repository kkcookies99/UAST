class Solution {
public:
    int XXX(int n) {
        int a = 1 , b = 1 ;
        while(-- n){    //跳n-1次
            int c = a + b ;
            a = b , b = c ;
        }
        return b ;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


