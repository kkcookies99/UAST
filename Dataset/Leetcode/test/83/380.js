var XXX = function(head) {
   let map = {};
    function changeList(list) {
        if (list == null) return list;
        if (!map[list.val]) {
            map[list.val] = true;
            list.next = changeList(list.next);
            return list;
        } else {
            list.next = changeList(list.next);
            return list.next;
        }
    }
    changeList(head);
    return head;
};

