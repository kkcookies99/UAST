public ListNode XXX(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
    	ListNode curBit = head;
    	int carry = 0;
        int bitSum = 0;
    	
    	while(l1 != null || l2 != null || carry != 0) {
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;
    	    bitSum = num1 + num2 + carry;
            curBit.val = bitSum % 10;
            carry = bitSum / 10;
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
            if(l1 != null || l2 != null || carry != 0) {
        	curBit.next = new ListNode();
        	curBit = curBit.next;
            }
    	}
    	
	return head;
}

undefined
document.getElementsByTagName("code");

HTMLCollection(12) [code, code.language-java, code, code, code.language-kotlin, code.language-ocaml, code.language-reasonml, code.language-python, code.language-scala, code, code, code]
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

