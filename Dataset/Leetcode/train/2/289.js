var XXX = function(l1, l2) {
    var l1node = l1,
        l2node = l2,
        initNode = new ListNode(0),
        sum = initNode,
        l1Value,
        l2Value,
        tempSum,
        // 两数相加的和不会大于 20，所以直接用 1 来表示和大于 10 即可
        overten = 0;

    while (true) {
        // 节点会有长度不同的情况，每次循环要判断对应的节点是否存在
        l1Value = l1node ? l1node.val : 0;
        l2Value = l2node ? l2node.val : 0;
        tempSum = l1Value + l2Value + overten;
        if (tempSum >= 10) {
            tempSum -= 10;
            overten = 1;
        } else {
            overten = 0;
        }
        
        sum.next = new ListNode(tempSum);
        sum = sum.next;
        // 不能确定下个节点是否存在，所以两个节点也要做判断
        l1node = l1node ? l1node.next : null;
        l2node = l2node ? l2node.next : null;
        if (!(l1node || l2node)) {
            break;
        }
    }

    // 判断最后一位相加有没有大于 10，有则创建个值为 1 的节点
    if (overten) {
        sum.next = new ListNode(1);
    }
    
    return initNode.next;
};

