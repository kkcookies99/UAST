 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if root==None:return True

        one_level = [root]
        while(one_level):
            # 判断当前层是否对称
            n = len(one_level)
            s, t = 0, n-1
            if n % 2 != 0 and n!=1:return False #奇数不对称

            while (s < t):
                if (one_level[s]==None and one_level[t]==None):
                    pass
                elif one_level[s]==None or one_level[t]==None or one_level[s].val != one_level[t].val :
                    return False
                s, t = s + 1, t - 1

            next_level = []  #下一层的所有节点
            flag = False         #用于标记下一层是否是空 false代表空
            while(one_level):
                p = one_level.pop(0)
                if p==None:continue
                if p.left!=None:
                    flag = True
                    next_level.append(p.left)
                else:
                    next_level.append(None)

                if p.right!=None:
                    flag = True
                    next_level.append(p.right)
                else:
                    next_level.append(None)

            if flag==False:return True
            one_level = next_level

        return True

