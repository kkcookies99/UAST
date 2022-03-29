 class Solution:
    def IsBalanced_Solution(self, pRoot):
        # write code here
        if not pRoot:
            return True
        def func(node):
            if node is None:
                return 0
            return max(func(node.left),func(node.right))+1
        return abs(func(pRoot.left)-func(pRoot.right))<=1 and self.IsBalanced_Solution(pRoot.left) and self.IsBalanced_Solution(pRoot.right)

