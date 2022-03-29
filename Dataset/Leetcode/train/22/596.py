 class Solution:
    def XXX(self, n: int) -> List[str]:
        if n == 0:
            return []
        if n == 1:
            return ["()"]
        left = n-1
        right = n
        combination = ['(']
        result = []

        def backtrace(combination, cursum, left, right):
            if left == 0 and right == 0 and cursum==0:
                result.append(''.join(combination))
                return
            if right < left or cursum < 0:
                return # wrong combination
            
            # go right
            combination.append(')')
            backtrace(combination, cursum-1, left, right-1)
            combination.pop()
            if left != 0:
                # go left
                combination.append('(')
                backtrace(combination, cursum+1, left-1, right)
                combination.pop()
            return

        backtrace(combination,1,left,right)
        return result



