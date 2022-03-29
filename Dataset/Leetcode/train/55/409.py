 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        
        def down(index):
            if index == len(nums)-1:
                return True
            elif index > len(nums)-1:
                return False
            else:
                if nums[index] == 0:
                    return False
                else:
                    for i in range(1,nums[index]+1):
                        index += i
                        if down(index):
                            return True
                        else:
                            index -= i
                    return False
        
        return down(0)

