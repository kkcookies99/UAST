/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *l3 = (struct ListNode *)malloc(sizeof(struct ListNode));
    struct ListNode *pTail = NULL, *pNew = NULL;
    int num1 = 0, num2 = 0, sum = 0, flag = 0;
    
	pTail = l3;
	pTail->next = NULL;
	while (l1 != NULL || l2 != NULL || flag == 1)
	{
		num1 = (l1 != NULL) ? l1->val : 0;
		num2 = (l2 != NULL) ? l2->val : 0;
		sum = num1 + num2;
		
		if (sum >= 10)
		{
			sum = (sum % 10) + flag;
			flag = 1;
		}
		else if (sum == 9 && flag == 1)
		{
			sum = 0;
			flag = 1;
		}
        else
		{
			sum = (sum % 10) + flag;
			flag = 0;
		}
		
		pNew = (struct ListNode *)malloc(sizeof(struct ListNode));
		pNew->val = sum;
		pTail->next = pNew;
		pNew->next = NULL;
		pTail = pNew;
        
        l1 = (l1 != NULL) ? l1->next : l1;
        l2 = (l2 != NULL) ? l2->next : l2;
	} 
	
	l3 = l3->next;
	return l3;
}

