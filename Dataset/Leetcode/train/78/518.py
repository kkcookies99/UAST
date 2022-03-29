 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def back(index,tmp):
            res.append(tmp[:])
            if index==size:return
            for i in range(index,size):
                tmp.append(nums[i])
                back(i+1,tmp)
                tmp.pop()
        size = len(nums)
        res = []
        back(0,[])
        return res

