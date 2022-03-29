 class Solution {
public:
    int cur=0;
    ListNode* XXX(ListNode* head, int n) {
       if(!head) return NULL;
       head->next = XXX(head->next,n);
       cur++;
       if(n==cur) return head->next;
       return head;
    }
};

