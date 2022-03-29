class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []

        def recurse(leftNums, curList):
            if leftNums == []:
                res.append(curList)
                return
            recurse(leftNums[1:], curList+[leftNums[0]])
            recurse(leftNums[1:], curList)

        recurse(nums, [])
        return res

