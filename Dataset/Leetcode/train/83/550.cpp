 class Solution {
public:
   ListNode* XXX(ListNode* head) {
       ListNode *prev = head;  
       ListNode *cur = head ? head->next : nullptr;

       while (cur != nullptr) {
           if (prev->val == cur->val) {
               prev->next = cur->next;
           } else {
               prev = cur;
           }
           cur = cur->next;
       }
       return head;
   }
};

