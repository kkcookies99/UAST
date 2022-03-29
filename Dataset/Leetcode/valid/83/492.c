 struct ListNode* XXX(struct ListNode* head){
    struct ListNode *p=head, *temp=NULL;
    while( p && p->next )
    {
        if(p->val == p->next->val)
        {
            temp = p->next;
            p->next = p->next->next;
            free(temp);
        } else p = p->next;
    }
    return head;
}

