 class Solution:
    def XXX(self, strs: List[str]) -> str:
        s = ''
        max_len = []
        for i in range(min([len(w) for w in strs])):
            word_set = set()
            for word in strs:
                word_set.add(word[i])
            for j in word_set:
                max_len.append(j)
            if(len(max_len)>i+1):
                break
            s += word[i]

        return s

