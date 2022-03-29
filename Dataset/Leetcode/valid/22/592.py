 class Solution:
    def XXX(self, n: int) -> List[str]:
        def dfs(result, state, left_num, right_num):
            if left_num == right_num == 0:
                result.append(state)
                return
            if 0 <= left_num <=  right_num:
                dfs(result, state + '(', left_num-1, right_num)
                dfs(result, state + ')', left_num, right_num-1)

        result = []
        # 第一个肯定是左括号
        dfs(result, '(', n-1, n)
        return result

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


