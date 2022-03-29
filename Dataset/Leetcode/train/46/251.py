class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []

        def recurse(leftNums, curList):
            if leftNums == []:
                res.append(curList)
                return
            for i in range(len(leftNums)):
                recurse(leftNums[:i]+leftNums[i+1:], curList+[leftNums[i]])

        recurse(nums, [])
        return res

