 class Solution {
    public int XXX(int[] prices) {
        int ret=0;
        //创建一个数组max[i]存放i(包含i)后面最大的数
        int[] max=new int[prices.length];
        max[prices.length-1]=prices[prices.length-1];
        for(int i=prices.length-2;i>=1;i--){
            max[i]=Math.max(prices[i],max[i+1]);
        }

        for(int i=0;i<prices.length-1;i++){
            ret=Math.max(ret,max[i+1]-prices[i]);
        }
        return ret;


    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


