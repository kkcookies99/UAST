class Solution {
    public int[] XXX(int[] digits) {
        int carry = 1;
        Stack<Integer> stack = new Stack<>();
        for(int i = digits.length - 1; i >= 0; i --){
            int sum = carry + digits[i];
            carry = sum / 10;
            sum %= 10;
            stack.push(sum);
        }
        int i = 0;
        if(carry != 0) stack.push(carry);
        int[] ret = new int[stack.size()];
        while(!stack.isEmpty()){
            ret[i++] = stack.pop();
        }
        return ret;
    }
}

