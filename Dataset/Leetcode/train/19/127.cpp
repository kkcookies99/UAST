 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        int count = 0;
        ListNode* FastPoint = head;
        ListNode* SlowPoint = head;
        
        while (FastPoint != nullptr)
        {
            FastPoint = FastPoint->next;

            count++;
            if (count > n + 1)
            {
                SlowPoint = SlowPoint->next;
            }
        }
        if(count < n+1)
        {
            return head->next;
        }
     
        if (SlowPoint->next == nullptr)
        {
            head = nullptr;
        }
        else if (SlowPoint->next != nullptr && SlowPoint->next->next != nullptr)
        {
            SlowPoint->next = SlowPoint->next->next;
        }
        else
        {
            SlowPoint->next = nullptr;
        }
        return head;
    }
};

