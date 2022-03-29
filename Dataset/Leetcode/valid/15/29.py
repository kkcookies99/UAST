 class Solution:
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        nums.sort()
        for i in range(len(nums)-2):
        	if nums[i]>0:#排好序之后，如果nums[i]>0，说明后面的数全部大于0
        		break
        	if i==0 or nums[i]>nums[i-1]:#去重	
	        	left,right = i+1,len(nums)-1
	        	#剪枝
	        	if nums[i]+nums[left]+nums[left+1]>0 or nums[i]+nums[right-1]+nums[right]<0:
	        		continue
	        	while left<right:
	        		ident = nums[i]+nums[left]+nums[right]
	        		if ident==0:
	        			res.append([nums[i],nums[left],nums[right]])
	        			left+=1
	        			right-=1
	        			#去重
	        			while left<right and nums[left]==nums[left-1]:
	        				left+=1
	        			while left<right and nums[right]==nums[right+1]:
	        				right-=1
	        		elif ident<0:
	        			left+=1
	        		else:
	        			right-=1
        return res

