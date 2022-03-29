 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []
        def back(road, nums):
            if len(road) == len(nums):
                res.append(road.copy())
                return
            for j in nums:
                if j in road:
                    continue
                road.append(j)
                back(road, nums)
                road.pop()
        for i in nums:
            road = []
            road.append(i)
            back(road, nums)
        return res

