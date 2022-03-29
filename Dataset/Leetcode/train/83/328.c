struct ListNode* XXX(struct ListNode* head){
    if(head==NULL||head->next==NULL)
    {
        return head;
    }
    struct ListNode *cur=head,*behind=head->next,*q;
    while(behind!=NULL)
    {
        if(behind->val==cur->val)
        {
            q=behind;
            cur->next=behind->next;
            behind=cur->next;
            free(q);
        }else
        {
            cur=cur->next;
            behind=behind->next;
        }
    }
    return head;
}

