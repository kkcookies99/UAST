 class Solution:
def XXX(self, prices):
    """
    :type prices: List[int]
    :rtype: int
    """
    if len(prices)<2:
        return 0
    maxs=0
    mins=prices[0]
    for i in range(1,len(prices)):
        mins=min(mins,prices[i])
        maxs=max(prices[i]-mins,maxs)
    return maxs
