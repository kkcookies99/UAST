 def XXX(self, root: TreeNode) -> int:
        if root is None:
            return 0
        queue = [root]
        level = 0
        while queue:
            level += 1
            count = len(queue)
            while count > 0:
                tmp = queue.pop(0)
                if not tmp.left and not tmp.right:
                    return level
                if tmp.left:
                    queue.append(tmp.left)
                if tmp.right:
                    queue.append(tmp.right)
                count -= 1

