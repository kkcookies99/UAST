 class Solution(object):
    def XXX(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        isNeedCarry=0#是否存在进位，不存在为0，存在为1
        addedListHead=None
        newNode=None
        while l1!=None or l2!=None:
            if l1==None:
                tempVal=l2.val+isNeedCarry
                if tempVal>=10:
                    isNeedCarry=1
                    tempVal=tempVal%10
                else:
                    isNeedCarry=0
                if addedListHead==None:
                    newNode=ListNode(tempVal)
                    addedListHead=newNode
                else:
                    newNode.next=ListNode(tempVal)
                    newNode=newNode.next
                l2=l2.next
            elif l2==None:
                tempVal=l1.val+isNeedCarry
                if tempVal>=10:
                    isNeedCarry=1
                    tempVal=tempVal%10
                else:
                    isNeedCarry=0
                if addedListHead==None:
                    newNode=ListNode(tempVal)
                    addedListHead=newNode
                else:
                    newNode.next=ListNode(tempVal)
                    newNode=newNode.next
                l1=l1.next
            else:
                tempVal=l1.val+l2.val+isNeedCarry
                if tempVal>=10:
                    isNeedCarry=1
                    tempVal=tempVal%10
                else:
                    isNeedCarry=0
                if addedListHead==None:
                    newNode=ListNode(tempVal)
                    addedListHead=newNode
                else:
                    newNode.next=ListNode(tempVal)
                    newNode=newNode.next
                l1=l1.next
                l2=l2.next
        if isNeedCarry==1:
            newNode.next=ListNode(1)
            newNode=newNode.next
        return addedListHead

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


