 class Solution {
    public int XXX(int[] prices) {
        int res = 0;
        Deque<Integer> stack = new LinkedList();
        stack.push(prices[prices.length-1]);
        for(int i = prices.length-2;i>=0;i--){
            if(prices[i]>stack.peek()){
                stack.push(prices[i]);
            }else res = Math.max(stack.peek()-prices[i],res);
        }
        return res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


