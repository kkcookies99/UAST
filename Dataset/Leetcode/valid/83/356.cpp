class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode* p = head;
        while (p != nullptr && p->next != nullptr){
            if (p->val == p->next->val){
                ListNode* q = p->next;
                p->next = p->next->next;
                delete q;
            }
            else{
                p = p->next;
            }
        }
        return head;
    }
};

