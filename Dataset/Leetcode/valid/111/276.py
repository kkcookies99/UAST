class Solution:
    def XXX(self, root: TreeNode) -> int:
        stack = [root]
        count = 0
        if not root:
            return count
        while stack:
            count += 1
            temp = [ ]
            for node in stack:
                if node.left:
                    temp.append(node.left)
                if node.right:
                    temp.append(node.right)
                # if not node.left and not node.right: 
                if not (node.left or node.right): 
     #这个条件和上面的条件等价，当左右节点都是空的时候才返回count
                    return count
            stack = temp

