 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        deque = [root]
        
        while deque:
            nums = []
            nextDuque = []
            for node in deque:
                if node:
                    nextDuque.append(node.left)
                    nextDuque.append(node.right)
                    nums.append(node.val)
                else:
                    nums.append(None)
            if nums != nums[::-1]:return False
            deque = nextDuque
        return True

