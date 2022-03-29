struct ListNode* XXX(struct ListNode* head){
    if (!head || !head->next) return head;

    head->next = XXX(head->next);
    return head->next->val == head->val ? head->next : head;
}

