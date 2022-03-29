 class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:

            return []

        result = []
            #创建一个双端队列
        queue = collections.deque()
        queue.append(root)

        while queue:
        #'''
        #    ！！！！！！很重要！判断每层结束的条件！
        #'''
            level_size = len(queue)
            #第一层只有一个root，然后之后queue的队列长度来源于以下存入，很巧妙！！！
            cur_level = []
            for i in range (level_size):
                cur_root = queue.popleft()
                cur_level.append(cur_root.val)
                if cur_root.left: queue.append(cur_root.left) 
                if cur_root.right: queue.append(cur_root.right)
            result.append(cur_level)
        return result
         #'''
         #使用双端队列
         #队头将前面的root pop出去,存入该层数组，直到该层结束，做出判断
         #队尾存入root的下一层的left和right结点
         #'''

