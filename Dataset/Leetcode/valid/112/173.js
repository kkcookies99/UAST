var XXX = function(root, targetSum) {
    var res = []
    if (! root) return false
    var search = function(node, target, nowsum){
        let nowNode = nowsum + node.val
        if (nowNode === target && (haveSon(node))) {
            res.push(true)
            return
        }
        if (node.left){
            search(node.left, target, nowNode)
        }
        if (node.right){
            search(node.right, target, nowNode)
        }
    }
    function haveSon(node){
        if (! node.left){
            if (! node.right){
                return true
            }
        }
        return false
    }
    search(root, targetSum, 0)
    return res[0] ? true : false
};

