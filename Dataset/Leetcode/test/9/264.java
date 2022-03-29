class Solution {
    public boolean XXX(int x) {
         int temp = 0;
        if(x < 0)
            return false;
        while(x > 0){
            temp*=10;
            temp+=x%10;
            x/=10;
        }
        return temp == x;
    }
    public static void main(String [] args){
        new Solution().XXX(121);
    }
}

