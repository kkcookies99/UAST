var XXX = function(root) {
    if(!root) return [];

    // 维护一个队列，每一层的结点都会按顺序入队
    const queue = [root];
    const res = [];

    // 队列不为空，说明二叉树还没有遍历完
    while(queue.length > 0){
        // 用于存储每一层的结点的值
        const arr = [];
        // 保存每一层的结点数
        let len = queue.length;

        // len为0时，表示上一层的所有结点全部遍历完毕
        while(len--){
            // 取出队列头部的结点（按每一层顺序取出）
            const node = queue.shift();
            // 将头结点的值放入arr中
            arr.push(node.val);
            // 判断是否有左右结点，如果有，依次入队
            if(node.left){
                queue.push(node.left);
            }
            if(node.right){
                queue.push(node.right);
            }
        }
        // 每当len=0时，代表遍历完一层的结点，将arr放入结果数组中
        res.push(arr);
    }
    return res;
};

