class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root: return 0        #如果root为空，则返回0
        queue = [root]               #在队列中加入root节点
        depth = 1                    #初始高度为1
        while queue:                 #判断队列是否为空，不为空则继续循环
            size = len(queue)        #计算队列中的数量，在i次循环中，该数量将是二叉树上第i层节点的数量
            for i in range(size):    
                target = queue.pop(0)    #在队首 弹出该层二叉树的节点
                if target.left == None and target.right == None:  #判断弹出的节点是否是叶子节点，如果是则返回高度
                    return depth
                if target.left:          #如果节点有左子树，则将其加入队尾
                    queue.append(target.left) 
                if target.right:         #如果节点有右子树，则将其加入队尾
                    queue.append(target.right)
            depth += 1                   #当二叉树上某一层的节点处理完后，高度加1
        return depth                     #如果二叉树只有root，则返回1

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


