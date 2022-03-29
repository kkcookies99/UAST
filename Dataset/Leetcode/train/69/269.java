class Solution {
    public int XXX(int x) {
       if(x == 0 || x == 1){
           return x;
       }
       int left = 1;
       int right = x/2;
       while(left <= right){
           int middle = left + (right - left)/2;
           if( (x / middle) < middle ){
               right = middle - 1;
           }else if( (x / middle) == middle){
               return middle;
           }else if((x / middle) > middle){
               left = middle + 1;
           }
       }
       return right;
    }
}

