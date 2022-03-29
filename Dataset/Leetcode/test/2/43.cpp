class Solution {
public:
    ListNode *XXX(ListNode *l1, ListNode *l2) {
        ListNode *res = nullptr;
        ListNode *flag = nullptr;
        ListNode *ss = nullptr;
        int n;
        int go = 0;
        while (l1 != nullptr && l2 != nullptr) {
            n = l1->val + l2->val + go;
            go = n / 10;
            flag = new ListNode(n % 10);
            if (res == nullptr) {
                res = flag;
                ss = res;
            } else {
                ss->next = flag;
                ss = flag;
            }
            l1 = l1->next;
            l2 = l2->next;

        }

        flag = l1 == nullptr ? l2 : l1;
        while (flag != nullptr) {
            n = flag->val + go;
            flag->val = n % 10;
            go = n / 10;
            ss->next = flag;
            ss = ss->next;
            flag = flag->next;
        }
        if (go > 0) {
            flag = new ListNode(1);
            ss->next = flag;
        }
        return res;

    }
};

