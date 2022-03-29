 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:    return True
        return eq(self.preOrder(root, list()), self.postOrder(root, list())[::-1])
    def preOrder(self, root, arr) -> list:
        if not root:    
            arr.append(float('inf'))
            return
        arr.append(root.val)
        self.preOrder(root.left, arr)
        self.preOrder(root.right, arr)
        return arr
    def postOrder(self, root, arr) -> list:
        if not root:    
            arr.append(float('inf'))
            return
        self.postOrder(root.left, arr)
        self.postOrder(root.right, arr)
        arr.append(root.val)
        return arr

