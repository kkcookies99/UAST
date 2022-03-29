class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(!head)return head;
        ListNode *p =head;
        while(p && p->next){
            if(p->val == p->next->val)p->next = p->next->next;
            else p = p->next;
        }
        return head;
    }
};

