class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        m=len(nums)
        blue_num=0
        j=0
        for i in range(m):
            if nums[i]==0:
                if i!=j:
                    nums[j]=0
                    nums[i]=1
                j+=1
            elif nums[i]==2:
                blue_num+=1
                nums[i]=1
        nums[m-blue_num:]=[2 for k in range(blue_num)]

