class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        ans = []
        if not root:
            return ans
        stack = [(root,0)]
        while stack:
            node,i = stack.pop()
            if len(ans) == i:
                ans.append([])
            ans[i].append(node.val)
            #需要先pop左边, 因此先添加右边,再添加左边
            if node.right:
                stack.append((node.right,i+1))
            if node.left:  
                stack.append((node.left,i+1))
            i+=1
        return ans

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


