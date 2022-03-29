class Solution {
    public int XXX(int x) {
        Queue<Integer> queue = new LinkedList<>();
        int sign = x >= 0 ? 1 : -1;
        while(x != 0){
            queue.add((x % 10));
            x /= 10;
        }
        int result = honourRule(queue, 10, sign);
 
        return result;
    }

    //计算 反转后的数值和
public int honourRule(Queue<Integer> queue, int x, int sign){
    int sum = 0;
    int ge;
    while (!queue.isEmpty()){
        ge = queue.remove();

        //判断溢出
        if ((sign == 1 && (Integer.MAX_VALUE - ge) /x < sum) || (sign == -1 && (Integer.MIN_VALUE - ge) /x > sum)){
            sum = 0;
            break;
        }
        sum = x * sum + ge;

    }
    return sum;
}
}

