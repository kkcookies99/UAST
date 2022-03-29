struct ListNode* XXX(struct ListNode* head){
    struct ListNode* tmp;
    tmp=head;
    while(tmp->next!=NULL){
        if(tmp->val == tmp->next->val){
            tmp->next=tmp->next->next;
            tmp = tmp->next;
        }
    }
    return head;
}

