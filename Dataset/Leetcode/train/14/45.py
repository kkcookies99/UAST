 class Solution:
    def XXX(self, strs: List[str]) -> str:
        result = ""
        for tmp in zip(*strs):
        	# 对所有的相同位置的元素进行去重，如果长度是1则代表全是一样的
            if len(set(tmp)) == 1:
                result += tmp[0]
            else:
                break
        return result

