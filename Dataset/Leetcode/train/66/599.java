class Solution {
    public int[] XXX(int[] digits) {
        //记录第一位的数字
        int first = digits[0];
        
        //从后往前指，元素为9时直接置0
        int i = digits.length - 1;
        while(i >= 0 && digits[i] == 9){

            //新写法，直接避免下标越界情况
            digits[i --] = 0;

            // 原来的写法
            // digits[i] = 0;
            // i等于0时不要再减了，防止越界
            // if(i != 0){
            //     i--;
            // }
        }

        //并且第一位数字发生改变，说明数组全是9
        if(digits[0] != first){

            int[] resultArr = new int[digits.length + 1];
            // 能走到这里说明整个数组全是零0了，直接new一个数组，数组默认本来就是零
            // 所以不用copy了，直接赋值返回
            // for (int j = 1; j < digits.length; j++) {
            //     resultArr[j] = digits[j - 1];
            // }
            
            resultArr[0] = 1;
            return resultArr;

        //第一位数字未发生该改变，则i位置 != 9，直接加一返回
        }else {
            digits[i] = digits[i] + 1;
            return digits;
        }
    }
}

