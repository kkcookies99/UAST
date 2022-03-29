 class Solution(object):
    def XXX(self, nums):
        ans = []
        def paixu(yipai, weipai):
            if len(weipai) == 0: 
                ans.append(yipai)
                return
            for i in range(len(weipai)):
                yipai2 = yipai[:]
                yipai2.append(weipai[i])
                wei = []
                for it in weipai:
                    if it != weipai[i]:
                        wei.append(it)
                
                paixu(yipai2,wei)
        paixu([], nums)
        return ans

