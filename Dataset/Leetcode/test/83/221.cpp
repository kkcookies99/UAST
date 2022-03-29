class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode* pre=head;
        while(pre){
            ListNode* cur=pre->next;
            while(cur && cur->val==pre->val){
                cur=cur->next;
            }
            pre->next=cur;
            pre=cur;
        }
        return head;
    }
};

