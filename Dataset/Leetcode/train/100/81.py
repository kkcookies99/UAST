 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        if p==None and q==None:return True
        if p==None or q==None:return False
        if p.val!=q.val:return False
        return self.XXX(p.right,q.right) and self.XXX(p.left,q.left)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


