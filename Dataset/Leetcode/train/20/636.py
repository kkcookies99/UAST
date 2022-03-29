 class Solution:
    def XXX(self, s: str) -> bool:
        # 俄罗斯方块
        result = ['0']
        if len(s) % 2 == 1:
            return False
        else:
            for string in s:
                if result[-1] + string == '()' or result[-1] + string == '{}' or result[-1] + string == '[]':
                    result.pop(-1)
                else:
                    result.append(string)
            if result == ['0']:
                return True
            else:
                return False

