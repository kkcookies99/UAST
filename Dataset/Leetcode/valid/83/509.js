 var XXX = function(head) {
    let help = head;
    while(help && help.next) {
        if(help.val === help.next.val) {
            help.next = help.next.next
        } else {
            help = help.next;
        }
    }
    return head;
};

