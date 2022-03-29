 class Solution:
    def XXX(self, s: str) -> int:
        count=0
        for i in s[::-1]:
            if i!=' ':
                count+=1
            else:
                if count:
                    break
        return count

