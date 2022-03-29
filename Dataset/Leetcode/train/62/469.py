class Solution:
    def XXX(self, m: int, n: int) -> int:
        
        curr = 1
        
        prev_col_vec = [1] * m
        for col in range(1, n):

            prev_row = 1
            for row in range(1, m):
                curr = prev_col_vec[row] + prev_row
                prev_col_vec[row] = curr
                prev_row = curr

        return curr

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


