var XXX = function(root) {
    let node = []; // 二叉树不存在子节点到父节点的指针，不需要visited
    node.push(root); // 添加起点
    let step = 1; // 记录步数
    while (node.length) {
        let len = node.length;
        // 将当前队列中的所有节点向四周扩散
        for (let i = 0; i < len; i++) {
            let cur = node.shift(); // 移除头部节点元素
            // 判断是否到达重点(即左右子节点是否都为空)
            if (!cur.left && !cur.right) {
                return step;
            }
            // 将cur的相邻节点加入队列
            if (cur.left) {
                node.push(cur.left);
            }
            if (cur.right) {
                node.push(cur.right);
            }
        }
        // 更新步数
        step++;
    }
};

