struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode* newList = (struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode* listHead = newList;
    int num = 0;
    int add = 0;
    
    while (l1 || l2 || add) {
        num = (l1 ? l1->val : 0) + (l2 ? l2->val : 0) + add;
        add = 0;
        
        while (num >= 10) {
            num = num - 10;
            add++;
        }
        
        newList->val = num;
        
        l1 = l1 && l1->next ? l1->next : NULL;
        l2 = l2 && l2->next ? l2->next : NULL;
        
        if (l1 || l2 || add) {
            newList->next = (struct ListNode*)malloc(sizeof(struct ListNode));
            newList = newList->next;
        }
        else {
            newList->next = NULL;
        }
    }
    
    return listHead;
}

