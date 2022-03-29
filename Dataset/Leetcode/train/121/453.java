 class Solution {
    public int XXX(int[] prices) {
        int minCost = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int price : prices) {
            maxprofit = Math.max(maxprofit, price - minCost);
            minCost = Math.min(price, minCost);
        }
        return maxprofit;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


