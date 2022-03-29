 class Solution:
    def dfs(self, left, right):
        if(left is None and right is None):return True
        if(left is None and  right is not None):return False
        if(left is not None  and right is  None):return False
        res1 = True
        res2 = True
        if(left.left is not  None and right.right is not  None):
            res1 = (left.left.val == right.right.val)  and self.dfs(left.left, right.right)
        elif(left.left is None and right.right is None):
            res1 = True
        else:
            res1 = False
        if(left.right is not  None and right.left is not  None):
            res2 = (left.right.val == right.left.val)  and self.dfs(left.right, right.left)  
        elif(left.right is None and right.left is None):
            res2 = True
        else:
            res2 = False
        return res1 and res2
    def XXX(self, root: TreeNode) -> bool:
        if(root is None): return True
        if(root.left is None and root.right is None): return True
        if(root.left is None and  root.right is not None):return False
        if(root.left is not None  and root.right is  None):return False
        if(root.left.val != root.right.val): return False
        return self.dfs(root.left, root.right)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


