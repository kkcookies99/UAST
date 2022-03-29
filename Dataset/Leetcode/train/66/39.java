 class Solution {
    public int[] XXX(int[] digits) {
        int count=0;        //需要进位的个数
        for(int i=digits.length-1;digits.length-1-i<=count;i--){
            if(digits[i]==9){
                count++; 
                digits[i]=0;
                if(count==digits.length) {  //如果所有数都需要进位，即9999，返回10000
                    digits=new int[digits.length+1];
                    digits[0]=1;
                    return digits;
                }
            }else{
                digits[i]+=1;;
            }
               
        }
        return digits;
    }
}