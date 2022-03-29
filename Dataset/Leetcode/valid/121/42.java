 class Solution {
    public int XXX(int[] prices) {
        int t = prices[0], Max = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] < t){
                t = prices[i];
            }
            if(prices[i] - t > Max){
                Max = prices[i] - t;
            }
        }

        return Max;
    }
}

undefined
PascalTriangleAnimated2.gif:1 Failed to load resource: net::ERR_TIMED_OUT
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


