class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        # BFS
        if not root: return 0
        queue = deque([(1,root)])   # from collections import deque
        while queue:
            depth,node = queue.popleft()  # 取队列中的第一个元素
            if node.left: queue.append((depth+1,node.left))
            if node.right: queue.append((depth+1,node.right))
        return depth

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


