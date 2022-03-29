 class Solution(object):
    def XXX(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        count = 0
        n, m =len(a), len(b)
        ans = []
        for i in range(1, max(m, n)+1):
            pos_a = int(a[n-i]) if i <= n else 0
            pos_b = int(b[m-i]) if i <= m else 0
            if pos_a + pos_b + count == 0:
                ans.append('0')
                count = 0
            elif pos_a + pos_b + count == 1:
                ans.append('1')
                count = 0
            elif pos_a + pos_b + count == 2:
                ans.append('0')
                count = 1
            else:
                ans.append('1')
                count = 1
        if count == 1:
            ans.append('1')
        return "".join(ans[::-1])