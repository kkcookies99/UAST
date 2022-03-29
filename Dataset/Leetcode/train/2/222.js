var XXX = function(l1, l2) {
    var result = null; // 结果，链表的头部指针，用于返回
    var overflow = false; // 是否进一
    var currentNode;

    while(l1 || l2 || overflow) {
        var node = new ListNode();
        if (currentNode) {
            currentNode.next = node;
        }
        currentNode = node;
        if (!result) {
            result = node;
        }
        var val1 = l1 ? l1.val : 0; // 节点可能是null
        var val2 = l2 ? l2.val : 0;
        var sum = val1 + val2;
        if (overflow) {
            sum += 1;
        }
        if (sum >= 10) {
            overflow = true;
            sum %= 10;
        } else {
            overflow = false;
        }
        currentNode.val = sum;
        l1 = l1 && l1.next;
        l2 = l2 && l2.next;
    }

    return result;
};

