 class Solution {
    public boolean XXX(int x) {
        if(x<0){
            return false;
        }
        int x1=x;
        int y=0;
        
        while(x!=0){
            y=y*10+x%10;
            x/=10;
        }
        return y==x1;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


