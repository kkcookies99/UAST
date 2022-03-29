class Solution:
    def XXX(self, nums: List[int]) -> None:
        
        tmp = copy.deepcopy(nums)
        each = list(set(nums))
        each.sort()
        point = 0                   #一个指向当前到达nums哪一个位置的指针
        
        for i, e in enumerate(each):
            for j in range(point, point+tmp.count(e)): 
                nums[j] = e
            point += tmp.count(e)

