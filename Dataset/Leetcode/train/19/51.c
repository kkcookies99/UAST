 struct ListNode* XXX(struct ListNode* head, int n){
    if (head == NULL || head->next == NULL) {
        return NULL;
    }
    struct ListNode* p1  = head; //慢指针
    struct ListNode* p2  = head; //快指针
    struct ListNode* pre = NULL; //指向删除节点的前一个节点指针
    
    int i = 0;
    while (i < n) {
        p2 = p2->next;  //快指针先走n步
        ++i;
    }
    /* 找到被删除节点p1和它的前一个节点pre */
    while (p2) {
        pre = p1;
        p1 = p1->next;
        p2 = p2->next;
    }
    if (pre) {  
        // pre节点存在
        pre->next = p1->next;
        free(p1);
        p1 = NULL;
    } else { 
        // pre节点不存在，即删除倒数第n个节点是头节点
        head = p1->next;
        free(p1);
        p1 = NULL;
    }
    return head;
}

