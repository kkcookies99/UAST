var XXX = function(root) {
    let queue = [];
    let res = [];
    let tmp = [];
    let floor = 1;//记录当前层的节点总数
    let cnt = 0; //记录当前层遍历的第几个节点
    queue.push(root);
    while(queue.length>0){
        root = queue.pop();
        if(root!=null){
            tmp.push(root.val);
            queue.unshift(root.left);
            queue.unshift(root.right);
            cnt++;
        }else{
            floor--;
        }
        if(cnt==floor){
            floor=cnt*2;
            cnt = 0;
            if(tmp.length>0){
                res.push(tmp);
            }
            tmp = [];
        }
        
    }
    return res;
};

