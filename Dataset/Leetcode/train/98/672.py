 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True
        stack = [root]
        cur = root
        res = []
        while stack != []:
            while cur.left:
                stack.append(cur.left)
                cur = cur.left
            pop_node = stack.pop() 
            if res != []:
                if pop_node.val  <= res[-1]:
                    return False
            res.append(pop_node.val)
            if pop_node.right:
                stack.append(pop_node.right)
                cur = pop_node.right
        return True

