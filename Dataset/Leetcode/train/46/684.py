 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def genList(lst):
            length = len(lst)
            if length == 0:
                return []
            elif length == 1:
                return [lst]

            result = []
            for i in range(length):
                result = result + [[lst[i]] + res for res in genList(lst[:i] + lst[i+1:])]

            return result
        
        results = genList(nums)
        return results

