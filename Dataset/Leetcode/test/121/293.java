 class Solution {
    public int XXX(int[] prices) {
        int ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int price : prices) {
            if (!stack.isEmpty() && stack.peek() < price) {
                ans = Math.max(ans, price - stack.peek());
            } else stack.push(price);
        }

        return ans;
    }
}

