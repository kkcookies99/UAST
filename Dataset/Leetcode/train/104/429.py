class Solution:
    def XXX(self, root: TreeNode) -> int:
        def find(root,depth):
            if root:
                depth+=1
                return max(find(root.left,depth),find(root.right,depth))
            else:
                return depth
        return find(root,0)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


