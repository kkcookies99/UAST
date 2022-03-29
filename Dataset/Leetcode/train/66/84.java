 class Solution {
    public int[] XXX(int[] digits) {
        if (digits[0] == 0){
            digits[0]++;
            return digits;
        }
        if(digits[digits.length-1]<9){ //无需进位
            digits[digits.length-1]++;
            return digits;
        }
        digits[digits.length-1]=0;
        int carry = 1;//进位
        int i = digits.length-1;//当前运算位数，先算最后一位
        i--;
        while (carry !=0){
            if(i==-1){//需要多一位
                int[] answer = new int[digits.length+1];
                answer[0] = 1;
                for (int j = 1;j<answer.length;j++){
                    answer[j] = digits[j-1];
                }
                return answer;
            }
            digits[i]+=carry;
            if (digits[i]==10){
                digits[i]=0;
                carry =1;
                i--;
            }else {
                carry = 0;
            }
        }
return digits;
    }
}

