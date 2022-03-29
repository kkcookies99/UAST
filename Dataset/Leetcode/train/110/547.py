class Solution(object):
    def XXX(self, root):
        if not root:
            return True
        return self.help(root, 0) != -1
        
    def help(self, root, lvl): #返回lvl层数
        if not root:
            return lvl
        lvl += 1
        left = self.help(root.left, lvl)
        right = self.help(root.right, lvl)
        if abs(left - right) > 1:
            return -1
        return max(left, right)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


