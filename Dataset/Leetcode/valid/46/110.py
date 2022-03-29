class Solution:
    result = []
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def traceback(li, res):
            if li==[]:
                self.result.append(res)
            for i in range(len(li)):
                traceback(li[:i]+li[i+1:], [li[i]]+res)
        traceback(nums, [])
        return self.result

