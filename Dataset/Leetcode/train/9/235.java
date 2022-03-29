class Solution {
    public boolean XXX(int x) {
        int temp1=0,temp2 = x;
        while(x>0){
            temp1 = x%10 + temp1*10;
            x = x/10;
        }
        if (temp1 == temp2){
            return true;
        }
        else{
            return false;
        }
    }
}

