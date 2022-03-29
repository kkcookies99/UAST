 class Solution {
    public int[] XXX(int[] digits) {
        int beforeNum = 0;
        for(int i=digits.length-1 ; i>=0 ;i--){
           int num;
           if(i==digits.length-1){
                 num = digits[i]+1;
           }else{
                num = digits[i]+beforeNum;
           }
            if(num>9){
                digits[i]=num-10;
                beforeNum=1;
            }else{
                digits[i]=num;
                beforeNum=0;
            }
        }
        if(beforeNum==1){
            int [] newarray = new int[digits.length+1];
            for(int i= 1  ; i<digits.length+1 ;i++){
                newarray[i]=digits[i-1];
            }
            newarray[0]=beforeNum;
            return newarray;
        }
    return digits;

    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


