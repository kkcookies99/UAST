class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        zero_index,two_index=0,len(nums)-1
        one_index=0
        while one_index<two_index:
            if nums[zero_index]==0:
                zero_index+=1
                one_index=max(one_index,zero_index)
                continue
            elif nums[zero_index]==2:
                while nums[two_index]==2 and two_index>one_index:
                    two_index-=1
                nums[zero_index],nums[two_index]=nums[two_index],nums[zero_index]
                continue
            else:
                one_index=max(one_index,zero_index+1)
                while one_index<=two_index:
                    if nums[one_index]==1:
                        one_index+=1
                    elif nums[one_index]==0:
                        nums[one_index],nums[zero_index]=nums[zero_index],nums[one_index]
                        zero_index+=1
                        break
                    else:
                        nums[one_index],nums[two_index]=nums[two_index],nums[one_index]
                        two_index-=1


