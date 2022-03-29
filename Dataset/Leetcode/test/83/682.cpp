 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(!head || !head->next)return head;
        ListNode *p = head;
        while(p->next)
        {
            if(p->val == p->next->val){
                p->next = p->next->next;
                continue;
            }
            if(p->next)p = p->next;
            else return head;
        }
        
        return head;
    }
};

