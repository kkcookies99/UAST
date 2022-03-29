 class Solution:
    def XXX(self, n: int) -> str:
        def helper(num: str):
            count, me = 1, num[0]
            ret = []
            for c in num[1:]:
                if c == me:
                    count += 1
                else:
                    ret += [str(count), me]
                    count, me = 1, c
            ret += [str(count), me]
            return ''.join(ret)

        nums = ["1", "11"]
        for i in range(2, n):
            nums.append(helper(nums[-1]))
        return nums[n-1]

