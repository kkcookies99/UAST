 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        if p == None and q == None:
            return True
        if p == None or q == None:
            return False
        return p.val == q.val and self.XXX(p.left, q.left) and self.XXX(p.right, q.right)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


