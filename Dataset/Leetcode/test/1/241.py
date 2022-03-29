 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        tmp=[0]*len(nums)
        for i in range(len(nums)):
            tmp[i]=nums[i]
        tmp.sort()
        i,j=0,len(nums)-1
        while i<j:
            if tmp[i]+tmp[j]>target:
                j=j-1
            elif tmp[i]+tmp[j]<target:
                i=i+1
            else:
                l,r=tmp[i],tmp[j]
                break
        res=[]
        res.append(nums.index(l))
        nums[nums.index(l)]=12354531523
        res.append(nums.index(r))
        return res

