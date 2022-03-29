class Solution {
    public int[] XXX(int[] digits) {
        digits[digits.length-1]+=1;
        if(digits[digits.length-1]>=10){
           
                
             
                int log=0;
                for(int i=digits.length-1;i>=0;i--){
                    digits[i]+=log;
                    log=digits[i]/10;   //进位
                    digits[i]=digits[i]%10;//求剩下的数
                
                }
                if(log==0){//没有进位
                    return digits;
                }else{
                    int[] arr=new int[digits.length+1];
                arr[0]=log;
                for(int j=1;j<digits.length;j++){
                    arr[j]=digits[j];
                }
                return arr;
         
                }
                
         
            
           
        }
        return digits;
    }
}

