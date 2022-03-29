struct ListNode* XXX(struct ListNode* head){
    if (head == NULL) {
        return NULL;
    }
    struct ListNode* pHead = (struct ListNode*)malloc(sizeof(struct ListNode));
    pHead->next = head;

    struct ListNode* pLow = pHead;
    pLow->next = NULL;
    struct ListNode* pFast = head;

    while (pFast->next != NULL) {
        if (pFast->val == pFast->next->val) {
            pFast = pFast->next;
        } else {
            pLow->next = pFast;
            pLow = pFast;
            pFast = pFast->next;
            pLow->next = NULL;
        }
    }
    if (pLow != pFast) {
        pLow->next = pFast;
        pLow = pFast;
        pLow->next = NULL;
    }

    return pHead->next;
}

