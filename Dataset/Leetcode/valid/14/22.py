 class Solution:
    def XXX(self, strs: List[str]) -> str:
        str = strs[0]
        for each in strs:
            if len(each) < len(str):
                str = each
        strs.remove(str)
        both = ''
        for each_char in range(len(str)):
            for each_str in strs:
                if each_str[each_char] != str[each_char]:
                    return both
            both += str[each_char]
        return both

