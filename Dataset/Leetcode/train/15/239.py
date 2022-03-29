 class Solution(object):
    def XXX(self,nums):
        import collections
        nums.sort()
        temp=[]
        for num in nums:
            if len(temp)<3 or not (num==temp[-1] and num==temp[-2] and num==temp[-3]):
                temp.append(num)
        nums=temp[:]
        temp=[]
        n=len(nums)
        
        for idx in range(n):
            lookup=collections.defaultdict(int)
            for i1 in range(idx+1,n):
                lookup[nums[idx]+nums[i1]]=i1
            for i2 in range(idx+1,n):
                i1=lookup[-nums[i2]]
                if i1 and i1!=i2:
                    cur=[nums[idx],nums[i1],nums[i2]]
                    cur.sort()
                    temp.append(cur)
        temp.sort()
        result=[]
        for each in temp:
            if result==[] or result[-1]!=each:
                result.append(each)
        return result

