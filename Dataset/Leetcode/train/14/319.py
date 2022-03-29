 class Solution(object):
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        def compare_tow_str(str1="", str2=""):
            min_len = min(len(str1), len(str2))
            for i in range(min_len):
                if str1[i] != str2[i]:
                    return str1[:i]
            return str1[:min_len]

        if len(strs) == 0:
            return ""

        if len(strs) == 1:
            return strs[0]

        current_prefix = strs[0]
        for idx in range(1, len(strs)):
            current_prefix = compare_tow_str(current_prefix, strs[idx])
            if not current_prefix:
                break
        return current_prefix

