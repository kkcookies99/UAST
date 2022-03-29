 class Solution {
    public int[] XXX(int[] digits) {
        int count = 0;
        boolean up; // 进位标志，true进位
        for (int digit : digits) // 计算9的个数
            if (digit == 9) count++;
        
        if (count != digits.length) { //不全是9，不需要扩容
            if(digits[digits.length - 1] == 9) up = true;
            else {
                digits[digits.length - 1] += 1;
                return digits;
            }
            
            int w = digits.length - 1;
            while (up) {
                if (digits[w - 1] != 9) {
                    digits[w] = 0;
                    digits[w - 1] += 1;
                    up = false;
                } else {
                    digits[w] = 0;
                    digits[w - 1] = 0;
                }
                w--;
            }
            return digits;
        } 
        else { //全是9，需要扩容
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            for (int i = 1; i < res.length; i++)
                res[i] = 0;
            return res;
        }
    }
}

