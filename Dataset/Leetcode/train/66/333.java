 class Solution {
    public int[] XXX(int[] digits) {
            int i=digits.length-1;
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }else{
                while(i>=0&&digits[i]==9){
                    digits[i]=0;
                    i--;
                }
                if(i<0){
                    i++;
                    int[] ans=new int[digits.length+1];
                    ans[0]=1;
                    for(i=0;i<digits.length;i++){
                        ans[i+1]=digits[i];
                    }
                    return ans;
                }
                else{
                    digits[i]+=1;
                    return digits;
                }
            }
    }
}

