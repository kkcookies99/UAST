struct ListNode* XXX(struct ListNode* head){
if(head == NULL) return head;
      struct ListNode* p = head;
      while(1){
          struct ListNode*q = p->next;
              while(q != NULL && p->val == q->val){
                  p->next = q->next;
                  q = q->next;
              } 
            if(q == NULL){
                 return head;
            }else{
                p = p->next;
            }
 }
}

