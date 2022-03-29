 class Solution {
    public boolean XXX(int x) {
        if(x<0){
           return false;
        }
        int s = 0;
            int f = x;
            while(x!=0){
                int num = x % 10;
                s = s*10+num;
                x = x/10;
            }
           if(s!=f){
               return false;
           }
        return true;
    }
}

