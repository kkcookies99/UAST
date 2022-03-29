 class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        #非递归解法
        if not root:
            return []
        q=[]
        res=[]
        level=[]
        q.append(root)
        #cur_count,next_count分别是当前层节点数和下一层节点数
        cur_count,next_count=1,0
        
        while q:
            node=q.pop(0)
            level.append(node.val)
            #每输出一个当前层的节点,则把当前层节点数减去1
            cur_count-=1
            #对当前输出节点的左孩子的处理
            if node.left:
                q.append(node.left)
                #每添加一个下一层节点,则把下一层节点数加1,对于当前输出节点的右孩子处理,下同
                next_count+=1
            if node.right:
                q.append(node.right)
                next_count+=1
            #当当前层节点数量为0的时候,说明当前层已经输出完毕,则需要对下一层进行访问了
            #则把当前层节点数置为下一层节点数:因为即将对下一层进行访问
            #把存储每层节点的list结构level置为空list
            #把下一层节点数置为0,等待重新计数
            if cur_count==0:
                res.append(level)
                level=[]
                cur_count=next_count
                next_count=0
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


