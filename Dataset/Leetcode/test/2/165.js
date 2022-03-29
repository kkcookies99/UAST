var XXX = function (l1, l2) {
    let result = new ListNode();
    let current = result;
    let cl1 = l1;
    let cl2 = l2;
    let carry = 0;
    while (cl1 || cl2) {
        let sum = ((cl1 && cl1.val) || 0) + ((cl2 && cl2.val) || 0) + carry
        carry = Number(sum >= 10);

        current.val = carry ? sum % 10 : sum;

        cl1 = cl1 && cl1.next || null
        cl2 = cl2 && cl2.next || null
        if (cl1 || cl2 || carry) {
            current.next = new ListNode(carry);
            current = current.next
        }
    }
    return result
};

