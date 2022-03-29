struct ListNode* XXX(struct ListNode* head){
    if(head==NULL)
        return head;

    struct ListNode* p=head;
    struct ListNode* current=p->next;
    while(current!=NULL){
        struct ListNode* temp= current ->next;
        if(current->val==p->val)
            p->next = temp;
        else p=current;
        current =temp;
    }
    return head;
}