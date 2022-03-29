 var XXX = function(head, n) {
    //先定义一个虚拟节点
    var dummyHead=new ListNode(0,head)
    //定义两个快慢指针
    var fast=dummyHead
    var slow=dummyHead

    //让快指针先走n步
    while(n-- && fast)
    {
        fast=fast.next
    }
    //在走一步，即n+1步，这样可以使slow指针指向被删除指针的上一个节点
    fast=fast.next

    //当fast指针不指向空
    while(fast)
    {
        //快慢指针一起移动
        slow=slow.next
        fast=fast.next
    }
    //这个时候慢指针就指向了被删除节点的前一个节点，切断指向即删除节点
    slow.next=slow.next.next

    return dummyHead.next

};

