 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode* head = l1 ? l1:l2;
        ListNode* other = l1 ? l2:l1;
        ListNode* p = head;
        auto inc = 0;
        while(p){
            int lv1 = l1?l1->val:0;
            int lv2 = l2?l2->val:0;
            p->val = lv1 + lv2 + inc;
            inc = p->val / 10;
            p->val = p->val % 10;
            l1 = l1?l1->next:nullptr;
            l2 = l2?l2->next:nullptr;
            p->next = l1 ? l1:l2;
            if(p->next == nullptr && inc)
            {
                other->val = inc;
                p->next = other;
                other->next = nullptr;
            }
            p = p->next;
        }
        return head;
    }
};

