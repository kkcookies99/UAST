 class Solution:
    def XXX(self, p, q):
        """
        定义： 返回以p, q为根节点的二叉树是否相同
        则返回类型是布尔型
        """
        if p == None and q == None:
            return True

        if (p == None and q != None) or (p != None and q == None) or (p.val != q.val):
            return False

        return (self.XXX(p.left, q.left) and self.XXX(p.right, q.right))

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


