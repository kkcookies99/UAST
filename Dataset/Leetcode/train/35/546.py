 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        def bis(head:int,tail:int):
            if head>=tail:
                if target>nums[head]:
                    return head+1;
                else:
                    return head;
            mid=nums[(head+tail)//2]
            if mid==target:
                return (head+tail)//2;
            elif mid>target:
                return bis(head,(head+tail)//2-1)
            else:
                return bis((head+tail)//2+1,tail)
        return bis(0,len(nums)-1)

