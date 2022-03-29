class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def fun(node):
            if not node:
                return 0
            nl,nr=fun(node.left),fun(node.right)
            assert abs(nl-nr)<=1
            return max(nl,nr)+1
        try:
            fun(root)
            return True
        except AssertionError:
            return False

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


