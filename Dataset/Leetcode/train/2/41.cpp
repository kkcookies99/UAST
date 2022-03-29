/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2) {
    /*
     中规中矩, 小学数式, 从低位向高位逐位相加, 满10进位:

         l1           5 6 7 8    ->    [8, 7, 6, 5]
         l2     +   9 7 8 6 4    ->    [4, 6, 8. 7, 9]
                -------------
         ret      1 0 3 5 4 2    ->    [2, 4, 5, 3, 0, 1]
     */
    struct ListNode* headNode = NULL;   // 头部节点
    struct ListNode* lastNode = NULL;   // 尾部节点
    struct ListNode* tempNode = NULL;
    int n = 0;
    int carryBit = 0;                   // 每一位相加后的进位, 0 或 1

    while (l1 || l2 || carryBit) {
        // 从低位向高位逐位相加（并加上进位）, n 的范围: [0, 19]
        n = (l1 ? l1->val : 0) + (l2 ? l2->val : 0) + carryBit;
        
        // 创建新的节点
        tempNode = (struct ListNode*) malloc(sizeof(struct ListNode));        
        tempNode->val = n % 10;         // 数位相加的值的个位, 范围: [0, 9]
        tempNode->next = NULL;          // 下一个节点的指针也要置为 NULL
        
        carryBit = n / 10;              // 是否满10进位, 值为 0 或 1

        if (headNode == NULL) {         // 第一次没有头尾节点
            headNode = tempNode;
            lastNode = headNode;
        } else {
            lastNode->next = tempNode;  // 新节点接到链表尾部
            lastNode = tempNode;        // 指向新的尾节点
        }

        // 下次计算下一个节点（数字的更高一位）
        if (l1) {
            l1 = l1->next;
        }
        if (l2) {
            l2 = l2->next;
        }
    }

    return headNode;
}

