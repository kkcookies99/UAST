class Solution:
    def XXX(self, root: TreeNode) -> int:
        from collections import deque
        if not root: return 0
        queue = deque()
        queue.append(root)
        res = 0
        while queue:
            res += 1
            for _ in range(len(queue)):
                node = queue.popleft()
                if node.left: queue.append(node.left)
                if node.right: queue.append(node.right)
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


