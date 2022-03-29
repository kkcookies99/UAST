 class Solution {
    public boolean XXX(int x) { 
        int init = x;
        int answer = 0;
        while(x!=0){
            answer = answer*10+x%10;
            x/=10;
        }
        return init<0?false:(answer==init);
    }
}

