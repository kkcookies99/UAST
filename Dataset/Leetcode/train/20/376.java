 public boolean XXX(String s) {
    ListNode head = new ListNode();
    ListNode tail = head;
    char lChar='0';

    for(int i=0;i<s.length();i++){
        char charAt = s.charAt(i);
        
        //入栈
        if(charAt=='['||charAt=='('||charAt=='{'){
            ListNode listNode = new ListNode(charAt);
            listNode.pre = tail;
            tail.next = listNode;
            tail = tail.next;
        }
        
        //出栈
        if(')'==charAt||'}'==charAt||']'==charAt){
            if(')'==charAt){
                lChar = '(';
            }
            if(']'==charAt){
                lChar = '[';
            }
            if('}'==charAt){
                lChar = '{';
            }
            if(lChar!=tail.val){
                return false;
            }else{
                tail.pre.next = null;
                tail = tail.pre;
            }
        }  
    }

    return head.next == null;
}    

