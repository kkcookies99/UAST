 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        ans = []
        self.traverse(ans, root)

        return ans
    
    def traverse(self, seq, node):
        if node is None:
            return None
        
        self.traverse(seq, node.left)
        seq.append(node.val)
        self.traverse(seq, node.right)

