 class Solution {
    public int XXX(int[] prices) {
        int n = prices.length;
        if(n<=1) return 0;
        int minPrice = prices[0];
        int maxProfile = 0;
        int currentProfile;
        for(int i=1;i<n;++i){
            if(prices[i]<minPrice){
                minPrice = prices[i];
                continue;
            }
            currentProfile = prices[i]-minPrice;
            maxProfile = currentProfile>maxProfile?currentProfile:maxProfile;
        }
        return maxProfile;
    }
}

