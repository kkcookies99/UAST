class Solution {
    public boolean XXX(int x) {
        int temp = x;
        if(x<0){
            return false;
        }else{
            int i = 0;
        while(x!=0){
            if(i*10/10 != i){
                i=0;
                break;
            }
            i = i*10+x%10;
            x=x/10;
        }
        if(i == temp){
            return true;
        }
        return false;
        }
    }
}

