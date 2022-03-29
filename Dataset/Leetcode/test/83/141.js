var XXX = function(head) {   
    let last = head;
    let current = head;
    while(current) {
        if (last.val != current.val) {
            last.next = current;
            last = current;
        }
        current = current.next;   
    }
    last.next = null;//他说last 没有 next 属性，输出last 为 链， 而不是单个的节点
    return head;
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


