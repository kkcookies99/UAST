class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        if (!l1 || !l2) return NULL;
        int sum = 0;
        ListNode* ans = new ListNode(0);
        ListNode* p = ans;
        int carry = 0;
        while(l1 || l2 || carry){
            if(l1) sum += l1->val;
            if(l2) sum += l2->val;
            p->next = new ListNode((sum + carry) % 10);            
            p = p->next;
            if(sum + carry >= 10) carry = 1;
            else carry = 0;
            if(l1) l1 = l1->next;
            if(l2) l2 = l2->next;
            sum = 0;
        }
        return ans->next;
    }
};

