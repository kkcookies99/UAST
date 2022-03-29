 class Solution:
    def XXX(self, s: str) -> int:
        symbol = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
        nums = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        ans = 0
        p = 0
        for i in range(len(symbol)):
            symbolLen = len(symbol[i])
            while p<len(s) and s[p:p+symbolLen]==symbol[i]:
                ans += nums[i]
                p += symbolLen
        return ans

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


