var XXX = function(root) {
    if (!root) {
        return [];
    }
    
    var results = []; 
    
    // 方法1: 递归
    var getNodes = (nodes) => {
        var valueArr = [];
        var nodeArr = [];
        for (let n of nodes) {
            if (n) {
                valueArr.push(n.val);
                if (n.left) {
                    nodeArr.push(n.left);
                }
                if (n.right) {
                    nodeArr.push(n.right);
                }
            }
        }
        if (valueArr.length) {
            results.push(valueArr);
            if (nodeArr.length) {
                getNodes(nodeArr);
            }
        }
    };
    // getNodes([root]);

    // 方法2: 迭代
    var que = [root];

    while (que.length) {
        var nextQue = [];
        var valueArr = [];
        for (let n of que) {
            valueArr.push(n.val);
            if (n.left) {
                nextQue.push(n.left);
            }
            if (n.right) {
                nextQue.push(n.right);
            }
        }
        if (valueArr.length) {
            results.push(valueArr);
        }
        que = nextQue;
    };

    return results;
};

