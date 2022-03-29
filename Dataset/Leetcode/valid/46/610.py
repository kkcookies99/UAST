 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if nums == []: return []
        
        '''
        核心想法：递归，从2个数的情况，推导3个数的情况...最后推导到n个数的情况。
        '''

        ans = [[nums[0]]]  
     
        for i in range(1,len(nums)):

            ans = [sub[:k]+[nums[i]]+sub[k:] for sub in ans for k in range(i+1) ]

        return ans

