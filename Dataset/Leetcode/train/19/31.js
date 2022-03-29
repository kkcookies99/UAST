 var XXX = function(head, n) {
	/*
	
	84 ms
	, 在所有 JavaScript 提交中击败了
	42.37%
	的用户
	内存消耗：
	39.1 MB
	, 在所有 JavaScript 提交中击败了
	62.68%
	的用户*/
    var node_head=new ListNode(0,head);
    function getLength(node){
        var length=0;
        while(node){
            length++;
            node=node.next;
        }
        return length;
    }
    var len=getLength(head);
	// 边界情况 只有一个元素 和  删除第一个元素（倒数第n个）
    if(len==1||len==n){
        return head.next;
    }
    var number=len-n+1;
    var flag=0;
    var node=node_head;
    while(node){
        flag++;
        if(flag==number){
            // console.log(node.next.val);
            node.next=node.next.next;
            return head;
        }
        node=node.next;
    }
};
/*
执行用时：
72 ms
, 在所有 JavaScript 提交中击败了
83.02%
的用户
内存消耗：
39.1 MB
, 在所有 JavaScript 提交中击败了
79.93%
的用户*/
	var XXX2 = function(head, n) {
		// 设置头节点  避免上述边界情况
	    var pre=new ListNode(0);
	    pre.next=head;
	    var slow=pre;
	    var fast=pre;
	    var flag=0;
	    while(flag<n){
	        fast=fast.next;
	        flag++;
	    }
	    while(fast.next){
	        fast=fast.next;
	        slow=slow.next;
	    }
	    slow.next=slow.next.next;
	    return pre.next;
	};

