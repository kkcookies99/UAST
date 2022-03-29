 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        tmp_dict={}
        for index,val in enumerate(nums):
            diff=target-val
            if diff in tmp_dict:
                return [tmp_dict[diff],index]
            else:
                tmp_dict[val]=index

