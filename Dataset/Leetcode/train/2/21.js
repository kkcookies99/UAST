/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var XXX = function(l1, l2) {
    const dummyNode = new ListNode();
    let cur = dummyNode;
    let extra = 0;
    while (l1 || l2) {
        let sum = extra;
        if (l1) {
            sum += l1.val;
            l1 = l1.next;
        }
        if (l2) {
            sum += l2.val;
            l2 = l2.next;
        }
        extra = Math.floor(sum / 10);
        cur.next = new ListNode(sum % 10);
        cur = cur.next;
    }
    if (extra) cur.next = new ListNode(extra);
    return dummyNode.next;
};

