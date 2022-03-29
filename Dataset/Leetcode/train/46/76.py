class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        if (n==1):
            return [nums]

        prev = self.XXX(nums[:-1])

        last = nums[-1]
        r = []

        for p in prev:
            for i in range(n):
                p.insert(i, last)
                r.append(p)
                # 不要直接用del，否则r中的值也会改变
                p = p[:i] +p[i+1:]
        return r

