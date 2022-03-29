 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def height(a):
            if not a:
                return 0
            return max(height(a.left)+1,height(a.right)+1)
        
        def f(a):
            if not a:
                return True
            return f(a.left) and f(a.right) and abs(height(a.left)-height(a.right))<2
        
        return f(root)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


