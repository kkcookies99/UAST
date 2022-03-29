 struct ListNode* XXX(struct ListNode* head, int n){
    int count = 0;
    struct ListNode *temp = head;
    while (temp != NULL) {
        count++;
        temp = temp->next;
    }
    temp = head;
    for(int i = 0; i < (count - n - 1); i++) {
        temp = temp->next;
    }
    if(count == n) {
        head = head->next;
        return head;
    } else {
        temp->next = temp->next->next;
    }
    return head;
}

