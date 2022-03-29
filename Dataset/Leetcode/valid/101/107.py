 class Solution:
    binary_tree = []

    def XXX(self, root: TreeNode) -> bool:
        def issymmetry(l: list) -> bool:
            if len(l) <= 1:
                return True
            else:
                if l[0] != l[-1]:
                    return False
                else:
                    return issymmetry(l[1:len(l)-1])

        def recurse(self, root: TreeNode):
            if root != None:
                if root.left != None:
                    recurse(self, root.left)
                else:
                    self.binary_tree.append('')
                self.binary_tree.append(root.val)
                if root.right != None:
                    recurse(self, root.right)
                else:
                    self.binary_tree.append('')
        recurse(self, root)
        return issymmetry(self.binary_tree)

