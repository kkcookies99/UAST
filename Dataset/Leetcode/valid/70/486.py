class Solution(object):
    def factorial(self, n):
        o = 1
        for i in range(1, n+1):
            o = o * i 
        return o

    def XXX(self, n):
        """
        :type n: int
        :rtype: int
        """
        count_2 = n // 2
        count_1 = n % 2
        ans = 0
        for i in range(0, count_2*2 + 1, 2):
            _2 = count_2 - i // 2
            _1 = count_1 + i
            n = _1 + _2
            m = _1
            
            ans += self.factorial(n) / (self.factorial(m) * self.factorial(n-m))

        return ans```

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


