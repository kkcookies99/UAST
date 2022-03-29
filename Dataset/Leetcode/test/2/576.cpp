 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode *s, *p, *s1, *s2, *s3;
        s1 = l1;
        s2 = l2;
        int sum, num = 0;
        s = new ListNode(0);
        p = s;
        s3 = s;
        sum = s1 -> val + s2 -> val;
        s -> val = sum % 10;
        num = sum / 10;
        s1 = s1 -> next;
        s2 = s2 -> next;
        while (s1 != NULL && s2 != NULL){
            s = new ListNode(0);
            p -> next = s;
            p = s;
            sum = s1 -> val + s2 -> val;
            if (num)
                sum += num;
            s -> val = sum % 10;
            num = sum / 10;
            s1 = s1 -> next;
            s2 = s2 -> next;
        }
        if (s1) {
            while (num && s1){
                s = new ListNode(0);
                p -> next = s;
                p = s;
                sum = s1 -> val + num;
                s -> val = sum % 10;
                num = sum / 10;
                s1 = s1 -> next;
            }
            while (s1){
                s = new ListNode(0);
                p -> next = s;
                p = s;
                s -> val = s1 -> val;
                s1 = s1 -> next;
            }
            if (num) {
                s = new ListNode(0);
                s -> val = num;
                p -> next = s;
                p = s;
                p -> next = NULL; 
            }
            else {
                p -> next = NULL;
            }
        }
        else if (s2) {
            while (num && s2){
                s = new ListNode(0);
                p -> next = s;
                p = s;
                sum = s2 -> val + num;
                s -> val = sum % 10;
                num = sum / 10;
                s2 = s2 -> next;
            }
            while (s2){
                s = new ListNode(0);
                p -> next = s;
                p = s;
                s -> val = s2 -> val;
                s2 = s2 -> next;
            }
            if (num) {
                s = new ListNode(0);
                s -> val = num;
                p -> next = s;
                p = s;
                p -> next = NULL; 
            }
            else {
                p -> next = NULL;
            }
        }
        else {
            if (num) {
                s = new ListNode(0);
                s -> val = num;
                p -> next = s;
                p = s;
                p -> next = NULL; 
            }
        }
        return s3;
    }
};

