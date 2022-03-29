 class Solution {
    public int[] XXX(int[] digits) {
        int len = digits.length;
        int[] result = new int[len];
        for (int i = len-1;i>=0;i--){
            int temp = digits[i] + 1;
            if(temp < 10){
                digits[i] = temp;
                result = digits;
                break;
            } else {
                digits[i] = 0;
                continue;
            }

        }
        if(result != digits){
            result = new int[len+1];
            result[0] = 1;
        }
        return result;
    }
}

