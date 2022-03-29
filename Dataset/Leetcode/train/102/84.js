var XXX = function(root) {
    let ans = []
    if(root == null){
        return ans
    }
    let q = [root]
    while(q.length != 0){
        let i = 0
        let len = q.length
        let curLevel = []
        while(i < len){
            i++
            // 取出队列q的首个节点
            let tempNode = q.shift()
            curLevel.push(tempNode.val)

            if(tempNode.left == null && tempNode.right == null){
                continue
            }
            else if(tempNode.left == null && tempNode.right != null){
                q.push(tempNode.right)
                continue
            }
            else if(tempNode.left != null && tempNode.right == null){
                q.push(tempNode.left)
                continue
            }
            else{
                q.push(tempNode.left,tempNode.right)
            }
            
        }
        ans.push(curLevel)
    }
    return ans
};

