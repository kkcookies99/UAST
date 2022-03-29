 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        if(head == NULL)return NULL;
        ListNode* cur = head;
        ListNode* pre = new ListNode();
        pre->next = head;
        while(cur){
            if(n == 0)pre = pre->next;
            cur = cur->next;
            if(n != 0) n--;
        }
        pre->next = pre->next->next;
        return pre->next != head ? head : pre->next;
    }
};

