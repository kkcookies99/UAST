class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        results = []

        def fun(curList, leftNums):
            if leftNums == []:
                results.append(curList)
                return
            fun(curList+[leftNums[0]], leftNums[1:])
            fun(curList, leftNums[1:])

        fun([], nums)
        return results

