class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        ans = []

        for i in range(2**len(nums)):
            temp = []
            num = i
            index = 0

            while num > 0:

                if num & 1 == 1:
                    temp.append(nums[index])

                index += 1
                num = i >> index
            
            ans.append(temp)
        
        return ans

