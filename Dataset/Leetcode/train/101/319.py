 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        stack = [root]
        while stack:
            level_node = [ ]
            temp = [ ]
            for node in stack:
                if not node:
                    temp.append(None)
                else:
                    temp.append(node.val)
            i = 0
            j = len(temp)-1
            while i < j:
                if temp[i] != temp[j]:
                    return False
                i += 1
                j -= 1
            for node in stack:
                if node:
                    level_node.append(node.left)
                    level_node.append(node.right)
            stack = level_node
        return True

