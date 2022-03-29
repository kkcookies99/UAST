class Solution(object):
    def __init__(self):
        self.__queue = deque()
        self.__li = []
        self.__sub_li = []
    
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        dummy = TreeNode(-1)   # 不同层次之间的分界符
        if not root:
            return self.__li
        p = root
        self.__queue.append(p)
        self.__queue.append(dummy)
        while self.__queue:
            p = self.__queue.popleft()
            if p == dummy:  # 遍历到分界符说明上一层结束
                self.__li.append(self.__sub_li)
                self.__sub_li = []
                if self.__queue:
                    self.__queue.append(dummy)
            else:  # 没有遍历到分界符
                self.__sub_li.append(p.val)
            if p.left:
                self.__queue.append(p.left)
            if p.right:
                self.__queue.append(p.right)

        return self.__li

