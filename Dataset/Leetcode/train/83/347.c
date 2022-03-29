struct ListNode* XXX(struct ListNode* head){
    struct ListNode* p = head;
    while(p)
    {
        struct ListNode* pNext = p->next;
        while(pNext && pNext->val == p->val)
        {
            struct ListNode* fre = pNext;
            pNext = pNext->next;
            free(fre);
        }
        p->next = pNext;
        p = pNext;        
    }
    return head;
}

