 class Solution:
    def XXX(self, root: TreeNode) -> List[int]:
        result = []
        if not root:
            return result
        def test(result:List, Node:TreeNode) -> List[int]:
            if not Node:
                return None
            else:
                test(result, Node.left)
                result.append(Node.val)
                test(result, Node.right)
            return result
        return test(result, root)


