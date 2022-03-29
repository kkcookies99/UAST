 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode * node = head;
        while(node != nullptr && node->next != nullptr){
            if(node->val == node->next->val){
                ListNode * tmp = node->next;
                node->next = tmp->next;
                delete tmp;
            }
            else{
                node = node->next;
            }
        }
        return head;
    }
};

