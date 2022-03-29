struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2) 
{
	//初始化空头
	struct ListNode* head = (struct ListNode*)malloc(sizeof(struct ListNode));
	head->next =NULL;
	struct ListNode* tail;
	tail = head;
	struct ListNode* p1 = l1;
	struct ListNode* p2 = l2;

	int carry = 0; //进位

	//循环，直到跳出两个链表
	//当两条链表一样长时只需这一次处理，但是当不一样长时，只能处理一样长的大小
	while (p1 != NULL && p2 != NULL)
	{
		//当前结点的和，注意加上进位
		int sum = p1->val + p2->val + carry;
		//当前结点和大于等于10时
		if (sum >= 10)
		{
			sum -= 10;   //当前结点的值-10，变为个位
			carry = 1;     //大于10，进位1
		}
		else
		{
			carry = 0;
		}

		//初始化结点,尾添加, 必须先将尾指针移动到新的尾结点上再赋值，因为不这么做的话，第一个结点无法正确赋值(因为这时候尾指针还没有真正移到第一个结点上，此时指向的还是头结点)
		tail->next = (struct ListNode*)malloc(sizeof(struct ListNode));
		tail = tail->next;
		tail->val = sum;
		

		p1 = p1->next;
		p2 = p2->next;
	}

	//当两条链表不一样长时，其中一者为NULL了，另一者还没完，这时候用p1指向没完的那一条链表，继续遍历
	if (p1 == NULL)
	{
		p1 = p2;
	}
	else if (p2 = NULL)
	{
		p1 = p1;
	}

	//遍历剩余部分
	while (p1 != NULL)
	{
		int sum = p1->val + carry; //带上进制计算当前结点和

		if (sum >= 10)
		{
			sum -= 10;
			carry = 1;
		}
		else
		{
			carry = 0;
		}
		//继续朝合并的链表中添加结点
		tail->next = (struct ListNode*)malloc(sizeof(struct ListNode));
		tail = tail->next;
		tail->val = sum;
		

		p1 = p1->next;

	}

	//如果最后一位还有进制，再申请一个结点存1
	if (carry == 1)
	{
		tail->next = (struct ListNode*)malloc(sizeof(struct ListNode));
		tail = tail->next;
		tail->val = 1;
		
	}
	
	tail->next = NULL; //尾指针赋空，结尾

	//因为我们不能返回头结点，所以要把头结点释放了，但是要头指针移到第一个结点
	struct ListNode* pTemp = head;
	head = head->next;
	free(pTemp);

	return head;
}

