struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2) {
    int flag=0;
    struct ListNode *ret = (struct ListNode *)malloc(sizeof(struct ListNode));
    ret->next = NULL;
    struct ListNode *p = ret;
    struct ListNode *pNew = NULL;
    while(l1 || l2){
        pNew = (struct ListNode *)malloc(sizeof(struct ListNode));
        pNew->next = NULL;
        int x = l1 ? l1->val : 0;
        int y = l2 ? l2->val : 0;
        pNew->val = x + y + flag;
        p->next = pNew;
        flag = 0;
        if(pNew->val >=10){
            pNew->val = pNew->val - 10;
            flag = 1;
        }
        p = p->next;
        if(l1)
            l1 = l1->next;
        if(l2)
            l2 = l2->next;
    }
	if(flag){
		pNew = (struct ListNode *)malloc(sizeof(struct ListNode));
        pNew->next = NULL;
        pNew->val = flag;
        p->next = pNew;
	}
    return ret->next;
}

