 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if not strs[0] or len(strs)==1:
            return strs[0]
        length = 0
        stop = False
        for i in range(200):
            if i>=len(strs[0]):
                break
            if not stop:
                pivot = strs[0][i]
                for j in range(1,len(strs)):
                    if not strs[j]:
                        length = 0
                        stop = True
                    elif i>=len(strs[j]):
                        stop = True
                    elif strs[j][i]!=pivot:
                        stop = True
                if not stop:
                    length += 1
            else:
                break
        return strs[0][:length]

