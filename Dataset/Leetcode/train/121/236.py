 class Solution:
    def XXX(self, prices: List[int]) -> int:
        prices = [-prices[0]]+[prices[i]-prices[i-1] for i in range(1,len(prices))]
        for i in range(1,len(prices)):
            prices[i] += max(0,prices[i-1])
        return max(0,max(prices))

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


