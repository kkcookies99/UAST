 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode *H1 = new ListNode(0);
        H1->next = head;

        struct ListNode* a[31];
        int count = 1;
        a[0] = H1;
        while(head)
        {
            a[count] = head;
            count++;
            head = head->next;
        }
        int pos = count - n;
        a[pos-1]->next = a[pos-1]->next->next;
        return a[0]->next;
    }
};

