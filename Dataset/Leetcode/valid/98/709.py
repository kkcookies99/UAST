 class Solution:
    def look(self, root, ret):
    	if root is None: return
    	self.look(root.left, ret)
    	ret.append(root.val)
    	self.look(root.right, ret)

    def XXX(self, root: TreeNode) -> bool:
        if not root: return True
        ret = []
        self.look(root, ret)
        pre = ret[0]
        for i in ret[1:]:
            if i <= pre:
                return False
            pre = i
        return True

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


