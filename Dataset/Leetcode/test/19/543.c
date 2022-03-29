 struct ListNode* XXX(struct ListNode* head, int n){
    if(head->next == NULL) {
        return NULL;
    }
    struct ListNode* temp = malloc(sizeof(struct ListNode));
    struct ListNode* ptr1 = temp;
    struct ListNode* ptr2 = temp;
    ptr1->next = head;

    for(int i = 0; ptr1 != NULL; i++) {
        if(i <= n) {
            ptr1 = ptr1->next;
        } else {
            ptr1 = ptr1->next;
            ptr2 = ptr2->next;
        }
    }
    ptr2->next = (ptr2->next)->next;
    return temp->next;
}

