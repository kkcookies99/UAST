 class Solution {
    public ListNode XXX(ListNode head, int n) {
    	if(head == null) {
    		return head;
    	}
    	ListNode leader = head;
    	ListNode follower = head;
    	//领导先行n步
    	for (int i = 0; i < n + 1; i++) {
    		if(leader == null) {
    			return head.next;
    		}
			leader = leader.next;	
		}
    	//同步前进直到领导到末尾
    	while (leader != null) {
			leader = leader.next;
			follower = follower.next;
		}
    	//删除追随者处的节点
    	follower.next = follower.next.next;
    	return head;
    }
}

