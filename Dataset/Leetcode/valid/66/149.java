 class Solution {
    public int[] XXX(int[] digits) {
        boolean flag = false;
        for(int i = digits.length - 1;i >= 0;i --)
        {
            if(!flag && digits[i] != 9)
                {
                    digits[i] ++;
                    break;
                }
            if(!flag && digits[i] == 9)
                {
                digits[i] = 0;
                flag = true;
                continue;
                }
            if(flag)
            {
                if(digits[i] != 9)
                {
                    digits[i] ++;
                    flag = false;
                    break;
                }
                else
                {
                    digits[i] = 0;
                    flag = true;
                }
            }
        }
        if(flag)
        {
            digits[0] = 1;
            digits = Arrays.copyOf(digits,digits.length +1);
            digits[digits.length - 1] = 0;
        }
        return digits;
    }
}

