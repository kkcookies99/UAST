class Solution:
    def XXX(self, root):
        if not root:
            return []
        from collections import deque
        result = []
        queue = deque()
        queue.append(root)
        while queue:
            level_size = len(queue)
            current_level = []    
            for _ in range(level_size):
                node = queue.popleft()
                current_level.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
            result.append(current_level)
        return result

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


