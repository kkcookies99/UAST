 class Solution:
    def XXX(self, num: int) -> str:
        chars = ['I', 'IV', 'V', 'IX', 'X', 'XL', 'L', 'XC', 'C', 'CD', 'D', 'CM', 'M']
        nums = [1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000]
        i = len(chars) - 1
        res = ''
        while num:
            if num >= nums[i]:
                res += chars[i]
                num -= nums[i]
            else:
                i -= 1

        return res```

