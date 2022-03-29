class Solution {
    public int[] XXX(int[] digits) {
        int j = digits.length-1;
        for(int i = 0; i <= j; i++)
            // 有一位不为9 都不需要进位 
            if(digits[i] != 9) 
                break;
            else{
                //所有数字都是9 需要进位 数组长度+1
                if(i==j){ 
                    digits = new int[j+2];
                    digits[0] = 1;
                    return digits;
                }
                continue;
            }
        // 不需要进位情况
        for(; j >= 0; j--){
            // 从低位到高位判断遇到不是9的时候 加1退出返回即可
            if(digits[j] != 9){
                digits[j]++;
                break;
            }else{
                digits[j] = 0;
            }
        }
        return digits;
    }
}

