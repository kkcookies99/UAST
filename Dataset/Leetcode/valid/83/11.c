struct ListNode* XXX(struct ListNode* head){
struct ListNode *p=head,*q=head;
while(p){
    while(q && q->val==p->val) q=q->next;
    p->next=q;
    p=q;
}
return head;
}

