 class Solution {
    public boolean XXX(int x) {
        if(x < 0){
            return false;
        }
        
        int reverse = 0;
        int a = x;

        while(a != 0){
            reverse = reverse * 10 + a % 10;
            a = a / 10;
        }

        if(reverse == x){
            return true;
        }
        return false;
    }
}

