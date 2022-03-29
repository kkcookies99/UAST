 class Solution {
    public int[] XXX(int[] digits) {
        int len = digits.length-1;
        //计数
        int count = 0;
        for (int i = 0; i < len+1; i++){
            if (digits[i] == 9){
                count++;
            }
        }
        // 如果全都是9，那么直接返回一个全新的数组，首位为1，其他全为0
        if (count == len+1){
            int[] res_arr = new int[count+1];
            res_arr[0] = 1;
            return res_arr;
        }


        while (len >= 0){
            //如果碰到小于9的数，➕1返回
            if (digits[len] < 9){
                digits[len] = digits[len]+1;
                break;
            }else {//如果不是小于9的数，传给前一个数去➕1
                digits[len--] = 0;
            }
        }
        return digits;
    }
}

