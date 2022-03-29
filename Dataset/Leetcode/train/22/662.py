 class Solution(object):
    def XXX(self, n):
        
        def poss(str, balance):

            # 条件1未满足，直接抬走
            if balance < 0: return []

            # 字符串未长度达到 n*2 ，在其后面放 （ 或 ） 并且对 balance 进行修改，开始递归
            if len(str)!=n*2: return poss(str+"(", balance+1) + poss(str+")", balance-1)

            # 到最后 len(str) == n*2 ，满足条件2便返回结果
            return [str] * (balance == 0)

        return poss("", 0)

