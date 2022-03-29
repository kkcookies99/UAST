 struct ListNode* XXX(struct ListNode* head, int n){
    struct ListNode* tmp = head;
    struct ListNode* pre;
    struct ListNode* nodeN = head;
    while (n != 0)
    {
        tmp = tmp->next;
        n--;
    }
    while (tmp != NULL)
    {
        tmp = tmp->next;
        pre = nodeN;
        nodeN = nodeN->next;
    }
    if (nodeN == head) return nodeN->next;
    pre->next = nodeN->next;
    free(nodeN);
    return head;
}

