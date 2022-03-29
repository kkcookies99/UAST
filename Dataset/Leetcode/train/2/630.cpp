 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode* hair  = new ListNode(0),*pre1;
        hair->next = l1;
        int s = 0;
        while(l1 && l2){
            int m = l1->val+l2->val +s;
            l1->val = m%10;
            s = m/10;
            pre1=l1;
            l1 = l1->next;
            l2 = l2->next;
        }
        if(l2) {
            l1 = l2;
            pre1->next = l1;
        }
        while(l1){
            int m = l1->val + s;
            l1->val = m%10;
            s = m/10;
            pre1 = l1;
            l1 = l1->next;
        }
        if(s){
            ListNode* l = new ListNode(s);
            pre1->next = l;
        }
        return hair->next;

    }
};

