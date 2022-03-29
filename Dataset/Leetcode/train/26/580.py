     def XXX(self, nums: List[int]) -> int:
        N=len(nums)
        ans=1
        for i in range(1,N):
            if(nums[i]==nums[i-1]):
                continue
            else:
                nums[ans]=nums[i]
                ans+=1
        return ans

