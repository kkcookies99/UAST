 class Solution {
    public int[] XXX(int[] digits) {
        
        if(digits.length==1){
               if(digits[0]==9){
                   int []digits9={1,0};
                   return digits9;
               }
               else{
                   digits[0]=digits[0]+1;
                   return digits;
               }
           }
       for(int i=digits.length-1;i>=0;i--){
           if(i!=0){
            if(digits[i]==9){
                digits[i]=0;
            }
               else{
                   digits[i]=digits[i]+1;
                   break;
               }
           }
           else{
               if(digits[i]==9){
                   digits[i]=1;
                   int []newDigits=Arrays.copyOf(digits,digits.length+1);
                   return newDigits;
               }
               else{
                   digits[i]=digits[i]+1;
               }
               
           }
       }
        return digits;
    }
}

