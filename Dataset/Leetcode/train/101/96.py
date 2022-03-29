 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        parentList = [root]
        while parentList:
            childList = []
            # 把下一层的孩子节点都加入
            for node in parentList:
                if node:
                    childList +=[node.left, node.right]
            # 看孩子节点的值是否对称相等
            for i in range(len(childList)//2):
                # childList有一个为None; childList都不为None但值不相等
                if (childList[i]==None and childList[-i-1]!=None) or (childList[i]!=None and childList[-i-1]==None):
                    return False
                if childList[i] and childList[-i-1] \
                        and childList[i].val != childList[-i-1].val:
                    return False
            parentList = childList
        return True

