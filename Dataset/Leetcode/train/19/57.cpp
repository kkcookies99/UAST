 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* pSlow = head, *pFast = head;
        int dis = 0;
        if (head->next == nullptr) {
            return head->next;
        }
        if (head->next->next == nullptr) {
            if (1 == n) {
                head->next = nullptr;
                return head;
            } else {
                return head->next;
            }
        }
        while (pFast->next != nullptr) {
            pFast = pFast->next;
            dis++;
            if (dis >= n) {
                if (pFast->next == nullptr) {
                    pSlow->next = pSlow->next->next;
                    return head;
                }
                pSlow = pSlow->next;
            }
            
        }
        if (dis < n) {
            return head->next;
        }
        return head;
    }
};

