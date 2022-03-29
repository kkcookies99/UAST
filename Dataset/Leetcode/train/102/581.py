class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root: return []
        queue = [root]
        res = []
        while queue:
            res.append([node.val for node in queue])
            queue = [sub_node for node in queue for sub_node in (node.left, node.right) if sub_node]
            
        return res

