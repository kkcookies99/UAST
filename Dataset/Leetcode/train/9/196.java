class Solution {
    public boolean XXX(int x) {
        if(x==0){return true;}
        if(x<0||x%10==0){return false;}
        int right = 0;
        while(x>right){
            right = right*10+x%10;
            x/=10;
        }
        return x==right||x==right/10;
    }
}

