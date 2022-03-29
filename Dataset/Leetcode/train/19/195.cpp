 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        if(head ==NULL)
        return head;
        int lenth =1;
        ListNode * first;
        ListNode * second;
        first =head;
        second = head;
        while(first->next!=NULL)
        {
            first=first->next;
            lenth++;
        }
        for(int i=1;i<lenth-n;i++)
        {
              second=second->next;
        }
        second->next = second->next->next;
        return head;
    }
};

