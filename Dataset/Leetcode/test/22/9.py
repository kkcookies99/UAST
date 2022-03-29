 class Solution:
    def XXX(self, n: int) -> List[str]:
        result = {''}
        for i in range(n):
            temp = set()
            for s in result:  # 在上一次的结果的所有字符串的各个位置上插入'()'
                for j in range(len(s) + 1):
                    temp.add(s[:j] + '()' + s[j:])
            result = temp
        return list(result)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

