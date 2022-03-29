class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []
        for i in range(2**len(nums)):
            s = bin(i)[2:].rjust(len(nums), '0')
            cur = []
            for j in range(len(s)):
                if s[j] == '1':
                    cur.append(nums[j])
            res.append(cur)
        return res