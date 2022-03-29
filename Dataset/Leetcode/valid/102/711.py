 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        # 使用队列，先进先出
        if not root:
            return []
        ans = []
        layers = []
        l = [0] # 用于记录入队列的每个节点的层数。入队和出队和queue保持一致
        queue = [root]
        while queue:
            tem = queue.pop(0)
            ans.append(tem.val)
            tem2 = l.pop(0)
            layers.append(tem2)
            if tem.left:
                queue.append(tem.left)
                l.append(tem2+1)
            if tem.right:
                queue.append(tem.right)
                l.append(tem2+1)
        ans_ = []
        flag = 0
        tem = []
        for i, v in enumerate(layers):
            if v != flag:
                flag = v
                ans_.append(tem)
                tem = []
            tem.append(ans[i])
        ans_.append(tem)
        return ans_

