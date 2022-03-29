class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = [[nums[0]]]
        for i in range(1, len(nums)):
            temp = []
            cur = [nums[i]]
            for j in range(len(res)):
                arr = res[j]
                for k in range(len(arr)+1):
                    temp.append(arr[0:k]+cur+arr[k:])
            res = temp
        return res

