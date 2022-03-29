 class Solution:
    def XXX(self, num: int) -> str:
        nums = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        roma = ['M', 'CM', 'D', 'CD', 'C', 'XC',
                'L', 'XL', 'X', 'IX', 'V', 'IV', 'I']
        ans = []
        for i, x in enumerate(nums):
            if num >= x:
                ans.append(roma[i]*(num//x))
                num %= x
        return ''.join(ans)

