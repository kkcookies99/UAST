 class Solution:
    s=[]
    def getList(self, root: TreeNode):
        if root:
            self.getList(root.left)
            self.s.append(root.val)
            self.getList(root.right)
        
    def XXX(self, root: TreeNode) -> bool:
        self.getList(root)
        s=self.s
       
        for i in range((len(s)//2)+1):
            print(s[i],s[len(s)-i-1])
            if s[i]!=s[len(s)-i-1]:
                return False
            else:
                return True

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


