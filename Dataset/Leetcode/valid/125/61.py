 class Solution:
    def XXX(self, s: str) -> bool:
        sample = []
        k = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
        if s == " ":
            return True
        else:
            for i in range(0, len(s)):
                if s[i] in k:
                    s1 = s[i].lower()
                    sample.append(s1)
                elif s[i] in ["1","2","3","4","5","6","7","8","9","0"]:
                    sample.append(s[i])

                else:
                    continue
            i = 0
            j = len(sample)-1
            while(i < j):
                if sample[i] == sample[j]:
                    i = i + 1
                    j = j - 1
                else:
                    return False
            return True

