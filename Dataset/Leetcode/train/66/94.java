 class Solution {
    public int[] XXX(int[] digits) {
        Stack<Integer> stack = new Stack<>();
        //给最后一位+1
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        int len = digits.length;
        //是否需要进位
        boolean need = false;
        for(int i = len - 1;i >= 0;i--){
            if(digits[i] >= 10){
                digits[i] = digits[i]%10;
                if(i > 0){
                    digits[i-1]++;
                }else{
                    need = true;
                }
            }
            stack.push(digits[i]);
        }
        if(need){
            stack.push(1);
        }
        int resSize = stack.size();
        int[] res = new int[resSize];
        for(int i = 0;i < resSize;i++){
            res[i] = stack.pop();
        }
        return res;

    }
}

