class Solution:
    def XXX(self, root: TreeNode) -> int:
        if root is None:
            return 0
        queue = []
        queue.append(root)
        #计算层数
        count = 0
        while queue:
            i = 0
            num = len(queue)
            while i<num:
                point = queue.pop(0)
                if point.left:
                    queue.append(point.left)
                if point.right:
                    queue.append(point.right)
                i += 1
            count+=1
        return count

