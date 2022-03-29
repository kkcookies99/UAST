 class Solution {
    public int XXX(int[] prices) {
        int maxV = 0; int len = prices.length;
        int mini = prices[0];
        for(int i=1;i<len;i++){
          mini = Math.min(mini , prices[i]);
          maxV = Math.max(maxV , prices[i] - mini);
        }
        return maxV;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


