 class Solution:
    def XXX(self, strs: List[str]) -> str:
        def find(str1, str2):
            s = []
            for i in range(min(len(str1),len(str2))):
                if str1[i] == str2[i]:
                    s.append(str1[i])
                else:
                    break
            return "".join(s)
        if not strs:
            return ""
        common_str = strs[0]
        for i in range(len(strs)-1):
            common_str = find(common_str,strs[i+1])
        return common_str

