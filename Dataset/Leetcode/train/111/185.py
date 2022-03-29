class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        res=0
        queue = [root]
        while queue:
            # 获取当前队列的长度，这个长度相当于 当前这一层的节点个数
            size = len(queue)
            # 如果节点的左/右子树不为空，也放入队列中
            for _ in range(size):
                r = queue.pop(0)
                #第一个访问到的叶子结点所在层数就是答案~
                if not r.left and not r.right:
                    return res+1
                if r.left:
                    queue.append(r.left)
                if r.right:
                    queue.append(r.right)
            res+=1

