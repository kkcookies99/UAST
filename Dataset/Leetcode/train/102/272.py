class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if root is None: return []
        wai = []; nei = []
        nextQue = [root]; queue = []
        while True:
            if nextQue:
                root = nextQue.pop(0)
                nei.append(root.val)
                if root.left and root.right:
                    queue.append(root.left)
                    queue.append(root.right)
                elif root.left: queue.append(root.left)
                elif root.right: queue.append(root.right)
            else:
                wai.append(nei[:]); nei = []
                if len(queue) == 0: break
                else: nextQue = queue[:]; queue = []
        return wai

