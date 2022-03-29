/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2){
    struct ListNode* head = (struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode* start = head; // 保存头节点
    struct ListNode* next = NULL;
    int val1 = 0;
    int val2 = 0;
    while (1) {
        if (l1 != NULL) {
            val1 += l1->val;
        }
        if (l2 != NULL) {
            val2 += l2->val;
        } 
        // 处理大于 10 的情况
        head->val = val1 + val2 ;
        head->next = NULL;
        if (head->val >= 10) {
            head->val = head->val % 10;
            val1 = 1;
            val2 = 0;
        } else {
            val1 = val2 = 0;
        }

        // 下一次还需要计算吗？分两种：1. l1或者l2的next 还有数据 2. 有进位
        if (l1 != NULL && l1->next != NULL) {
            l1 = l1->next;
        } else {
            l1 = NULL;
        }
        if (l2 != NULL && l2->next != NULL) {
            l2 = l2->next;
        } else {
            l2 = NULL;
        }
        if (l1 == NULL && l2 == NULL && val1 == 0) {
            break;
        }
        next = malloc(sizeof(struct ListNode));
        head->next = next;
        head = next;
    }
    return start;
}```

