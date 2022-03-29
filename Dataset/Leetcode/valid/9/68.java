class Solution {
    public boolean XXX(int x) {
        if(x<0||x%10==0){
            return false;
        }
        int reversedx=0;
        while(x>reversedx){
            reversedx=reversedx*10+x%10;
            x=x/10;
        }
        if(x==reversedx||x==reversedx/10){
            return true;
        }
        return false;

    }
}

