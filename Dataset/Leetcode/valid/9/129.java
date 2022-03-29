class Solution {
    public boolean XXX(int x) {
        if(x<0) return false;

         int temp =x;
         int reverseNum = 0;
         while(temp>0){
             int num = temp %10;
             reverseNum = reverseNum * 10 + num;
            temp = temp / 10;
         }
         return reverseNum == x;
    }
}

