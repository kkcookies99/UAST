 class Solution:
    def XXX(self, n: int) -> List[str]:
        def gen_tree(str_parent, left_n, right_n):
            if left_n == 0:
                for i in range(right_n):
                    str_parent += ')'
                self.ans.append(str_parent)
            else:
                gen_tree(str_parent+'(', left_n - 1, right_n)
                if right_n > left_n:
                    gen_tree(str_parent+')', left_n, right_n - 1)
        
        self.ans = []
        gen_tree('(', n-1, n)

        return self.ans

