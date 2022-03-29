 var XXX = function(head, n) {
    const dummyHead = new ListNode()
    dummyHead.next = head
    let prev = dummyHead
    let target = -1

    removeTargetNode(prev.next, 0)

    return dummyHead.next
    
    function removeTargetNode(listNode, index) {
        if(!listNode) {
            return target = index - n
        }
        removeTargetNode(listNode.next, index + 1)
        if(target == 0 && index == 0) { // 如果检测到是删除首位
            return dummyHead.next = dummyHead.next?.next
        }
        if((target - 1) == index) { // 如果是删除非首位则找到它的上一个节点
                listNode.next = listNode.next.next
        }
    }
};
执行用时：72 ms, 在所有 JavaScript 提交中击败了95.55%的用户
内存消耗：38.7 MB, 在所有 JavaScript 提交中击败了98.23%的用户

