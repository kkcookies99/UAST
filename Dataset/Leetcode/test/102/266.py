class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        queue = deque((root,))
        res = []
        while queue:
            res.append(list(map(lambda x: x.val, queue)))
            newQueue = deque()
            while queue:
                node = queue.popleft()
                if node.left: newQueue.append(node.left)
                if node.right: newQueue.append(node.right)
            queue = newQueue

        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


