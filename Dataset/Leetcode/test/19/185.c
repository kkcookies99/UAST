 struct ListNode* XXX(struct ListNode* head, int n){
    struct ListNode tmp = {0,head};
    struct ListNode *p1 = &tmp;
    struct ListNode *p2 = head;
    int i = 0;
    while(p2) {
        i++;
        if(i>n) {
            p1 = p1->next;
        }
        p2 = p2->next;
    }
    p1->next = p1->next->next;
    return tmp.next;
}

