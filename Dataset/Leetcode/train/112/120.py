def XXX(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if not root:
            return False
        path = []
        res = [False]
        def traverse(node):
            path.append(node.val)
            # 判断到了根节点
            if not node.left and not node.right:
                if sum(path) == targetSum:
                    res[0] = True
            if node.left:
                traverse(node.left)
                path.pop()
            if node.right:
                traverse(node.right)
                path.pop()
        traverse(root)
        return res[0]
        

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


