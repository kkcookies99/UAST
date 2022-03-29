 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        if not root:
            return []
        res = []
        lastRoot = []
        currentRoot = root
        while True:
            if currentRoot.left:
                lastRoot.append(currentRoot)
                currentRoot = currentRoot.left
                lastRoot[-1].left = None
            else:
                if not currentRoot.val:
                    try:
                        currentRoot = lastRoot.pop()
                        continue
                    except:
                        break
                res.append(currentRoot.val)
                currentRoot.val = None
                if currentRoot.right:
                    lastRoot.append(currentRoot)
                    currentRoot = currentRoot.right
                    lastRoot[-1].right = None
                else:
                    try:
                        currentRoot = lastRoot.pop()
                    except:
                        break
        return res


