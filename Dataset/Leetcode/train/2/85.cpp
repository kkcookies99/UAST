/**
     * 选择最长的链表作为最终结果链表，不新建链表，空间复杂度O(1)
     * 时间复杂度O(n)
     * @param l1
     * @param l2
     * @return
     */
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        int size1=0,size2=0;
        ListNode *p=l1,*pre=l1,*q=l2,*qre=l2;
        // 得到两个链表长度
        while(p) {
            p=p->next;
            size1++;
        }
        while(q) {
            q=q->next;
            size2++;
        }
        p=l1,q=l2;
        int flag=0;
        int tmp;
        while(l1&&l2) {
            if(size1>size2) {
                //由于会修改l1->val，所以需要提前保存，后面一样的道理
                tmp=l1->val;
                l1->val = (l1->val+l2->val+flag)%10;
                flag = (tmp+l2->val+flag)/10;        //进位
            }
            else {
                tmp=l2->val;
                l2->val = (l1->val + l2->val + flag) % 10;
                flag = (l1->val+tmp+flag)/10;        //进位
            }
            // 由于最终l1/l2指向了尾节点NULL，此时如果flag不为0,也就是进位了，需要知道链表前一节点来链接,不能直接对l1/l2进行指向！
            pre=l1;
            l1=l1->next;
            qre=l2;
            l2=l2->next;
        }
        // l2不为空，l1空
        while(!l1&&l2) {
            int tmp = l2->val;
            l2->val = (flag+l2->val)%10;
            flag = (flag+tmp)/10;        //进位
            qre=l2;
            l2=l2->next;
        }

        // l1不为空，l2空
        while(!l2&&l1) {
            int tmp = l1->val;
            l1->val = (flag+l1->val)%10;
            flag = (flag+tmp)/10;        //进位
            pre=l1;
            l1=l1->next;
        }
        // 是否进位
        if(flag) {
            // 得到最大链表的NULL之前的节点,并进行链接
            if(size1>size2) {
                pre->next = new ListNode(flag);
                pre->next->next=NULL ;
                return p;
            } else {
                qre->next = new ListNode(flag);
                qre->next->next=NULL ;
                return q;
            }
        }
        // flag不进位
        if(size1>size2)
            return p;
        return q;
    }

