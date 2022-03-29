 class Solution {
    public int[] XXX(int[] digits) {
        //没有任何进位的情况 末尾加一
        //如果都是9的情况 要进位
        //有进位 但是全部都进位 9换成0 高位加上1
        //定义数组长度
        int len = digits.length;

        //计算9的个数
        int count = 0;
        for (int digit : digits) {
            if (digit == 9) {
                count ++;
            }
        }

        //有9的情况：1、都是9的情况 2、不都是9的情况
        //1、
        if (count != 0 && count != len) {
            //199
            // 1、最后一位是9 2、最后一位不是9
            if (digits[len - 1] == 9) {
            //第一位是9 那么计算有多少个连续的9 全部变成0 知道第一个不是9的地方改成原来的数字加1
                int i = 0;
                while (true) {
                    if (digits[len - 1 - i] == 9) {
                        digits[len - 1 - i] = 0;
                    } else {
                        //到了
                        digits[len - 1 - i] += 1;
                        return digits;
                    }
                    i ++;
                }

            } else {
                digits[len - 1] += 1;
                return digits;
            }
        } else if (count == len) {
            //2、都是9的情况
            int[] res = new int[len + 1];
            res[0] = 1;
            return res;
        }
        


        
        //没有9的情况
        digits[digits.length - 1] += 1;
        return digits;
        

    }
}

