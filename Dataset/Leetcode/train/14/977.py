 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if len(strs) == 0:
            return ''

        # 排序后，只需要比较第一个和最后一个序列
        strs.sort()

        com_str = ''
        for i, c in enumerate(strs[0]):
            if strs[0][i] == strs[-1][i]:
                com_str += c
            else:
                break
        return com_str

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


