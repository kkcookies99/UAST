 class Solution:
    def __init__(self):
        self.res = []

    def mid_traverse(self, node):
        if not node:
            return self.res
            
        self.mid_traverse(node.left)
        self.res.append(node.val)
        self.mid_traverse(node.right)

    def XXX(self, root: TreeNode) -> bool:
        self.mid_traverse(root)

        for i in range(len(self.res)-1):
            if self.res[i] >= self.res[i+1]:
                return False

        return True       

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


