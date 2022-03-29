 class Solution {
public:
    ListNode* XXX(ListNode* head) {      
        ListNode* node = head;
        while(node && node->next ) {
            while(node->next && node->val == node->next->val){
                node->next = node->next->next;                 
            }      
            node = node->next;
        }
        return head;
    }
};

