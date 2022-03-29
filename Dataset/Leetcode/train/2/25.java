import java.math.BigInteger;
class Solution {
   
public ListNode XXX(ListNode l1, ListNode l2) {
    StringBuilder s1 = new StringBuilder(50),s2 = new StringBuilder(50);
    while(l1 != null){
        s1.append(l1.val);
        l1 = l1.next;
    }
    while(l2 != null){
        s2.append(l2.val);
        l2 = l2.next;
    }
    BigInteger result = change(s1.reverse()).add(change(s2.reverse()));
    char[] temp = new StringBuilder(result.toString()).reverse().toString().toCharArray();
    String[] strings = new String[temp.length];
    for (int j = 0; j < temp.length; j++) {
        strings[j] = temp[j] + "";
    }
    int len = temp.length;
    ListNode r0 = new ListNode(temp[0]);
    ListNode[] listNodes = new ListNode[len];
    for (int j = 0; j < len; j++) {
        listNodes[j] = new ListNode();
        listNodes[j].val = Integer.parseInt(strings[j]);
    }
    for (int j = 0; j < len-1; j++) {
        listNodes[j].next = listNodes[j+1];
    }
    return listNodes[0];
}
    public BigInteger change(StringBuilder str){
        return new BigInteger(str.toString());
    }
}

