struct ListNode* XXX(struct ListNode* head){
    if(head)
    {
        struct ListNode *p = head->next, *pre = head, *t;
        while(p)
        {
            if(p->val == pre->val)
            {
                t = p;
                p = p->next;
                pre->next = p;
                free(t);
            }
            else{
                pre = p;
                p = p->next;
            }   
        }
    }
    return head;
}

