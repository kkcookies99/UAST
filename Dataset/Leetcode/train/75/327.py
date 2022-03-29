class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n=len(nums)
        idx_0,idx_2=0,n-1
        for i in range(n):
            while nums[i]==2 and idx_2>=idx_0:
                nums[idx_2],nums[i]=nums[i],nums[idx_2]
                idx_2-=1
            idx_0+=1
        idx_0=0
        # print(idx_2)
        for i in range(idx_2+1):
            while nums[i]==1 and idx_2>=idx_0:
                nums[idx_2],nums[i]=nums[i],nums[idx_2]
                idx_2-=1
            idx_0+=1

