 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        # 基于栈的遍历
        curr = root
        stack, res = [], []
        while stack or curr:
            while curr:
                stack.append(curr)
                curr = curr.left
            curr = stack.pop()
            res.append(curr.val)
            curr = curr.right
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


