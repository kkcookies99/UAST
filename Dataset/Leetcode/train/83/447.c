 struct ListNode* XXX(struct ListNode* head){
    if(head==NULL)return NULL;
    struct ListNode* temp=head;
    while(temp!=NULL&&temp->next!=NULL)
        if(temp->val==temp->next->val)
            temp->next=temp->next->next;
        else temp=temp->next;
    return head;
}

