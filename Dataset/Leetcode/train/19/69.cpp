 class Solution {
public:
    int num=0;
    ListNode* XXX(ListNode* head, int n) {
        if(!head)return nullptr;
        head->next=XXX(head->next,n);
        return ++num==n?head->next:head;
    }
};

