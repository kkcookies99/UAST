struct ListNode* XXX(struct ListNode* head){
    if (!head)
        return NULL;
    struct ListNode *tmp = head;
    struct ListNode *ptr = head->next;
    while (ptr != NULL) {
        while (ptr != NULL && tmp->val == ptr->val) {  // 释放重复的节点
            struct ListNode *node = ptr;
            ptr = ptr->next;
            free(node);
        }
        tmp->next = ptr;
        tmp = tmp->next;
        if (ptr)
            ptr = ptr->next;
    }
    return head;
}


