class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        vector<ListNode*> result;
        result.reserve(100);
        int x = 0, n = 0;
        while (l1 || l2) {
            if (l1 == nullptr) {
                n = l2->val + x;
                x = 0;
                if (n >= 10) {
                    n = n%10;
                    x = 1;
                }
                result.push_back(new ListNode(n));
                l2 = l2->next;
            } else if (l2 == nullptr) {
                n = l1->val + x;
                x = 0;
                if (n >= 10) {
                    n = n%10;
                    x = 1;
                }
                result.push_back(new ListNode(n));
                l1 = l1->next;
            } else {
                n = l1->val + l2->val + x;
                x = 0;
                if (n >= 10) {
                    n = n%10;
                    x = 1;
                }
                result.push_back(new ListNode(n));
                l1 = l1->next;
                l2 = l2->next;
            }
        }

        if (x == 1) {
            result.push_back(new ListNode(1));
        }
        for (int i = 0; i != result.size()-1; i++) {
            result[i]->next = result[i+1];
        }
        return result[0];
    }```

