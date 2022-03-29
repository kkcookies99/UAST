 var XXX = function(head) {
    if(head == null || head.next == null){
        return head;
    }
    head.next = XXX(head.next);
    if(head.val == head.next.val) head = head.next;
    return head;
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


