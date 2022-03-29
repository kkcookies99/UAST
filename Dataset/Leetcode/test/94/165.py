 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        result = []
        def travel(node: TreeNode):
            nonlocal result
            if node != None:
                travel(node.left)
                result.append(node.val)
                travel(node.right)
        travel(root)
        return result

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


