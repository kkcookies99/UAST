 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:

        if nums==[] or len(nums)==1:
            return []
        
        n = len(nums)

        ans = []
        for i in range(n-2):

            target = nums[i]
            hashmap = {}

            for j in range(i,n):
                
                if j==i:
                    continue

                if -target-nums[j] in hashmap:
                    _ans = [target,nums[j],nums[hashmap[-target-nums[j]]]]
                    
                    _ans.sort()
                    
                    if _ans not in ans:
                        ans.append(_ans)
                else:
                    hashmap[nums[j]] = j
        

        return ans

