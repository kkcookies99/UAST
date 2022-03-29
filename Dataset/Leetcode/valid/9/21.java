class Solution {
    public boolean XXX(int x) {
        int oldx = x;
        int result =0;
        if(x <0){
            return false;
        }
        while(x!=0){
            int digit = x%10;
            x /=10;
            result = result*10+digit;
        }

        if(result == oldx){
            return true;
        }
        return false;

    }

}


