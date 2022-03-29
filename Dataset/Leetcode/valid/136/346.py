 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        hashdict = dict()
        for i in nums:
            if i in hashdict:
                hashdict[i] += 1
            hashdict[i]=1
        for k, v in hashdict.items():
            if v == 1:
                return k

