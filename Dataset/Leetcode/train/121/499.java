 class Solution {
    public int XXX(int[] prices) {
        int result = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]<prices[i]){
                result = Math.max(result,prices[i]-prices[i-1]);
                prices[i]=prices[i-1];
            }
        }
        return result;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


