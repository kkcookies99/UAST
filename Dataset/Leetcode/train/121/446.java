 class Solution {
    public int XXX(int[] prices) {
        int ret = 0;
        int minprice = 0;

        try {
            if (prices == null || prices.length <= 1 ) {
                return 0;
            }

            minprice = prices[0];

            for (int i = 1; i < prices.length; i++) {
                //System.out.println("prices[i]:" + prices[i] +  "   minprice:" + minprice);
                if (prices[i] < minprice){
                    minprice = prices[i];
                } else {
                    ret = prices[i] - minprice > ret ? (prices[i] - minprice) : ret;
                }
            }
            return ret;
        } catch (Exception e){
            //System.out.println("e:" + e.getStackTrace());
            return 0;
        }

    }
}

