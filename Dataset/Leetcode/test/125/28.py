 class Solution:
    def XXX(self, s: str) -> bool:
        word = ''
        for n in s:
            o = ord(n)
            if 48 <= o <= 57 or 65 <= o <= 90 or 97 <= o <= 122:
                word += n.lower()
        print(word)
        L, R = 0, len(word)-1
        while L < R:
            if word[L] != word[R]:
                return False
            else:
                L += 1
                R -= 1
        return True

