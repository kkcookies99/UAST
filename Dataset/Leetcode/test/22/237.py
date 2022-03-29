 class Solution:
    def XXX(self, n: int) -> List[str]:
        combination = list()
        combinations = list()

        def dfs(left, right):
            if left==n and right==n:
                combinations.append(''.join(combination))
                return

            if left<n:
                combination.append('(')
                dfs(left+1, right)
                combination.pop()
            if left>right:
                combination.append(')')
                dfs(left, right+1)
                combination.pop()

        dfs(0,0)
        
        return combinations

