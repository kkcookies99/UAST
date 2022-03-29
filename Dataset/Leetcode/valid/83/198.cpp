class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head == nullptr)
            return nullptr;

        ListNode *p1 = head;
        ListNode *p2 = head->next; 

        while(p2){
            if(p2->val == p1->val){
                p1->next = p2->next;
                p2 = p2->next;
            }

            if(p2 != nullptr && p1 != nullptr)
                if(p2->val != p1->val){
                    p1 = p1->next;
                    p2 = p2->next;
                }
            }
        return head;
    }
};

