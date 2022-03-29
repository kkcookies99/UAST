 struct ListNode* XXX(struct ListNode* head, int n){
    struct ListNode* fast, *slow;
    //申请一个空的头结点
    struct ListNode* Fakehead = (struct ListNode*)malloc(sizeof(struct ListNode));
    Fakehead->val = 0; Fakehead->next = head;
    fast = head;  //fast指向真头结点
    slow = Fakehead; //slow指向假头结点
    //快指针先走n步
    while (n--){
        fast = fast->next;
    }
    //快慢指针齐步走
    while (fast){
        fast = fast->next;
        slow = slow->next;
    }
    slow->next = slow->next->next;
    //卸磨杀驴
    head = Fakehead->next; //不太明白为什么要把head指针重新指向FAKEHAED->next,head指针不是一直没动吗？
    Fakehead->next = NULL;
    free(Fakehead);
    return head;
}

