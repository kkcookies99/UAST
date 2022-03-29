class Solution {
    public boolean XXX(int x) {
        if(x < 0){
            return false;
        } else if (x < 10){
            return true;
        } else {
            int temp = 0;
            int cul = x;
            while (cul != 0){
                temp = temp * 10 + cul % 10;
                cul/=10;
            }
            return x == temp;
        }
    }
}

