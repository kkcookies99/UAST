class Solution {
    public int[] XXX(int[] digits) {
        if(digits[digits.length-1] == 9) {
            digits[digits.length-1] = 0;
            boolean plusFlag = true;

            if(digits.length == 1) {
                digits = new int[]{1,0};
                return digits;
            }

            for(int i=digits.length-2; i>=0; i--) {
                System.out.print("i:" + i);
                if(i == 0 && plusFlag && digits[i] == 9) {
                    int[] zero = new int[digits.length+1];
                    zero[0] = 1;
                    for(int j=0;j<digits.length;j++) {
                        zero[i+1] = 0;
                    }
                    return zero;
                }

                if(plusFlag) {
                    digits[i] += 1;
                }
                if(digits[i] == 10) {
                    digits[i] = 0;
                    plusFlag = true;
                }
                else {
                    return digits;
                }
            }
        }
        else {
            digits[digits.length-1] += 1;
            return digits;
        }
        return digits;
    }
}


