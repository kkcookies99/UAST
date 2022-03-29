 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:      
        if p and q:
            if p.val != q.val:
                return False
            if self.XXX(p.left, q.left):
                if self.XXX(p.right, q.right):
                    return True
            return False
        elif not p and not q:
            return True
        return False

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


