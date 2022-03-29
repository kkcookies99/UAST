class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        """
        Autox公司面试题：当时灭有做出来😭😭😭
        初始化res = []存放最终结果
        初始化ans = []存放每一层的结果
        思路：使用for循环逐层遍历，关键点是，在做每一层循环时
        必须使用循环次数方法实现
        唉，废物如我
        """
        if not root:
            return []
        queue = [root]
        res = []
        while queue:
            ans = []
            for _ in range(len(queue)):
                node = queue.pop(0)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
                ans.append(node.val)
            res.append(ans)
        return res

