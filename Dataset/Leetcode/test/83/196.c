struct ListNode* XXX(struct ListNode* head){
    if(!head)
        return head;
    //t用来保存不同的结点
    struct ListNode* t,*p,*pre;
    t = head;
    t->next = NULL;
    pre = t;
    while(head->next)
    {
        p = head->next;
        if(head->val != p->val)
        {
            pre->next = p;
            pre = pre->next;
        }
        head = head->next;
    }
    return t;
}

