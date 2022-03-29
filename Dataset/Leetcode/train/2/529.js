 var XXX = function(l1, l2) {
    function add(a, b, carry = 0) {
        const t = (a && a.val || 0) + (b && b.val || 0) + carry;
        const tempCarry = Number.parseInt(t / 10);
        const result = new ListNode( t % 10);
        if (a.next || b.next || tempCarry) {
            result.next = add((a.next || {}), (b.next || {}), tempCarry);
        }
        return result;
    }
    return add(l1, l2);
};

