 struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2)
{
	struct ListNode* head;
	struct ListNode* p;
	struct ListNode* q;
	head = NULL;

	int s1, s2, temp, sum;
	s1 = s2 = temp = sum = 0;

	while (1)
	{
		if (!s1 && !s2)
		{
			sum = l1->val + l2->val + temp;
			if (sum > 9)
			{
				sum -= 10;
				temp = 1;
			}
			else
				temp = 0;
		}
		else if (s1 && !s2)
		{
			sum = l2->val + temp;
			if (sum > 9)
			{
				sum -= 10;
				temp = 1;
			}
			else
				temp = 0;
		}
		else if (!s1 && s2)
		{
			sum = l1->val + temp;
			if (sum > 9)
			{
				sum -= 10;
				temp = 1;
			}
			else
				temp = 0;
		}
		else if (s1 && s2 && temp != 0)
        {
			sum = temp;
            temp = 0;
        }
        else
            break;

		p = (struct ListNode*)malloc(sizeof(struct ListNode));
		p->val = sum;
		p->next = NULL;

		if (head == NULL)
			head = p;
		else
			q->next = p;
		q = p;

		if (l1->next == NULL)
			s1 = 1;
		else
			l1 = l1->next;

		if (l2->next == NULL)
			s2 = 1;
		else
			l2 = l2->next;
	}

	return head;
}

