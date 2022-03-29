var XXX = function(head) {
    let node = head;

    while (node) {
        let temp = node.next;

        while (temp && (temp.val === node.val)) {
            temp = temp.next;
        }
        node.next = temp;
        node = node.next;
    }
    return head;
};

