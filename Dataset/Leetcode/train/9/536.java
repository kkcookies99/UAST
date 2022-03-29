 class Solution {
    public boolean XXX(int x) {
        if(x<0) return false;
        int a = 0;
        int b = x;
        while(x!=0){
            a = a*10+x%10;
            x/=10;
        }
        return a==b;
    }
}


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


