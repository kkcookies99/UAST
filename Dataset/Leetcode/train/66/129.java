 class Solution {
    public int[] XXX(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
                if(i==0){
                    int[] digits1=new int[digits.length+1];
                    digits1[0]=1;
                    return digits1;
                }
            }else{
                digits[i]=digits[i]+1;
                break;
            }
        }
        return digits;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


