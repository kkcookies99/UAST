 class Solution(object):
    def XXX(self, nums):
        nums.sort();
        ans=set();
        target=0;
        for i in range(len(nums)-2):
                left=i+1;
                right=len(nums)-1;
                while(right>left):
                    temp=nums[i]+nums[left]+nums[right];
                    if target==temp:
                        ans.add((nums[i],nums[left],nums[right]));
                        left=left+1;
                        right=right-1;
                    elif temp>target:
                        right=right-1;
                    elif temp<target:
                        left=left+1;
        rec=[];
        for i in ans:
            rec.append(list(i));
        return rec;