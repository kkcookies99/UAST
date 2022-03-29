 struct ListNode* XXX(struct ListNode* head){
    int index;
    struct ListNode *obj;
    struct ListNode *front;
    if (head == NULL)
        return NULL;
    obj = head;
    index = obj->val;
    front = obj;
    obj = obj->next;
    while (obj != NULL){
        if (index == obj->val){
            front->next = obj->next;
            obj = obj->next;
        } else {
            front = obj;
            index = obj->val;
            obj = obj->next;
        }
    }
    return head;
}

