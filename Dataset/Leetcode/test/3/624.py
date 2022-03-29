 class Solution:
    def XXX(self, s: str) -> int:
        if len(s) == 0 or len(s) > 5 * 10 ** 4:
            return 0
        else:
            longest = 0
            for i in range(len(s)):
                for j in range(len(s) - i):
                    o = s[i: i + j + 1]  # 子串
                    # 判断该字串内有无重复字符，有则break
                    if len(set(o)) != len(list(o)):
                        break
                    elif j + 1 > longest and len(set(o)) == len(list(o)):
                        longest = j + 1

        return longest

