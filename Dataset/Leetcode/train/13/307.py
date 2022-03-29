class Solution:
    map = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}

    def XXX(self, s: str) -> int:
        if len(s) == 0 : return 0

        result = self.map[s[-1]]
        for i in range(len(s) - 2, -1, -1):
            now = self.map[s[i]]
            # 判断前一个是不是比当前大，大的话就减掉，否则就 加。
            if now < self.map[s[i + 1]]:
                result -= now
            else:
                result += now

        return result

