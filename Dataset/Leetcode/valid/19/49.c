 struct ListNode* XXX(struct ListNode* head, int n){
    struct ListNode *p = head, *fp = head;
    while (fp -> next != NULL) {
        if (n == 0) {
            p = p -> next;
        }else {
            n--;
         }
        fp = fp -> next;
    }
    if (n > 0) {
        head = head -> next;
    }else {
        p -> next = p -> next -> next;
    }
    return head;
}

