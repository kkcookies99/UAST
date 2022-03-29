class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        ans, level = [], [root]
        while level:
            ans.append([node.val for node in level])    #将level中的结点压入ans中
            temp = []                                   #初始化temp用以表示当前层
            for layer in level:                         #level表示当前层的结点数
                temp.extend([layer.left, layer.right])  #将左右孩子压入，以[]区分结点
            level = [i for i in temp if i]              #去除temp中的null数存入level
        return ans

