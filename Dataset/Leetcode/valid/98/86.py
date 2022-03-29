 class Solution:
    def for_each(self, root):
        if not root:
            return 
        # 中序遍历
        self.for_each(root.left)
        self.l.append(root.val)
        self.for_each(root.right)


    def XXX(self, root: TreeNode) -> bool:
        self.l = []
        self.for_each(root)
        return sorted(list(set(self.l))) == self.l # 验证是否有重复元素，并且是否是有序的

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


