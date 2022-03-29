class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return [] 
        #思想就是使用队列辅助，首先根节点入队，然后开始循环，当队列不为空，不停的出队并将出队节点的左右节点入队
        res=[]
        q=[root]
        count1,count2=1,0
        #主要问题就是这个输出格式有点脑瘫，非得一层一起输出，所以这里定义两个变量count1，count2，为什么定两个，可以理解成一个用来统计下一层有多少节点，一个用来在输出这一层的时候遍历，这一层输出完要进入下一层的时候更新一下变量值
        while q:
            temp=[] #临时数组，用来储存这一层的所有节点
            for _ in range(count1): #遍历这一层的所有节点
                p=q.pop(0)
                temp.append(p.val)
                if p.left:
                    q.append(p.left)
                    count2+=1 #统计下一层的节点数
                if p.right:
                    q.append(p.right)
                    count2+=1 #统计下一层的节点数
            res.append(temp)
            count1,count2=count2,0 #进入下一层，更新变量值
        return res

