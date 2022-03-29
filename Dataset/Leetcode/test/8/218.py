class Solution:
    def XXX(self, str: str) -> int:
        list(str)
        if len(str) == 0 or str == '+' or str == '-':
            return 0
        mark = 0
        nums = []
        stand = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
        for i in str:
            if i == ' ':
                pass
            if i == '-':
                mark = 1
            if i in stand:
                nums.append(i)
        restr = "".join(nums)
        nums = int(restr)
        if mark == 1:
            nums = 0 - nums
        return nums

