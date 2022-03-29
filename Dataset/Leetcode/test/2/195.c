struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2){
    struct ListNode* pre = (struct ListNode*)malloc(sizeof(struct ListNode));
    pre->val = 0;
    pre->next = NULL;
    struct ListNode* cur = pre;
    int carry = 0;
    while(l1 != NULL || l2 != NULL) {
        int a = l1 == NULL ? 0 : l1->val;
        int b = l2 == NULL ? 0 : l2->val;
        int sum = a + b + carry;
        carry = sum/10;
        sum = sum%10;
        
        cur->next = (struct ListNode*)malloc(sizeof(struct ListNode));
        cur->next->val = sum;
        cur->next->next = NULL;

        cur = cur->next;
        
        if(l1 != NULL)
            l1 = l1->next;
        if(l2 != NULL)
            l2 = l2->next;
    }
    if(carry==1) {
        cur->next = (struct ListNode*)malloc(sizeof(struct ListNode));
        cur->next->val = carry;
        cur->next->next = NULL;
    }
    return pre->next;
}

