 class Solution:
    def XXX(self, n: int) -> List[str]:
        res = []
        # 括号合法性判断
        # 1. 左括号数量 = 右边括号数量
        # 2. 如果字符串长度为p, 则在[0..,i] (0 < i < p)区间里，左括号数量 >= 右括号数量
        # left = 剩余左括号数量， right = 剩余右括号数量, track = 生成的字符串
        def backtrack(left, right, track):
            # 剩余的左括号比右括号多，说明 track 里的右括号比左括号多，不符合规则2
            if left > right:
                return
            # 括号数字不够
            if left < 0 or right < 0:
                return
            # 括号正好消耗完符合合法性 1
            if left == 0 and right == 0:
                res.append(track)
            
            # 选择左括号
            backtrack(left - 1, right,  track + '(')
            # 选择右括号
            backtrack(left, right - 1,  track + ')')

        # n 对 括号，所以 left = n, right = n
        backtrack(n, n, '')
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

