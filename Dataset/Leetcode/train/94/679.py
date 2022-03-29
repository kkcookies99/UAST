 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        stack=[(None,root)]
        result=[]
        while stack:
            val,node=stack.pop()
            if val!=None:
                result.append(val)
            if node:
                stack.append([node.val,node.right])
                if node.left:
                    stack.append([None,node.left])
        return result

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


