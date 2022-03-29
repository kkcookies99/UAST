 class Solution {
    public int XXX(int[] prices) {
        if(prices.length == 0)return 0;
        int n = prices[0];
        int abs = 0;
        for(int i = 1;i<prices.length;i++){
            if(prices[i]>n){
                abs = Math.max(prices[i]-n,abs);
            }else{
                n = prices[i];
            }
        }
        return abs;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


