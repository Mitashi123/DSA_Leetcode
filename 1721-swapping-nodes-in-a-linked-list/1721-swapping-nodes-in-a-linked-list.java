class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp1 = head;
        int n=0;
        while(temp1!= null)
        {
            temp1 = temp1.next;
            n++;
        }
        ListNode cur = head;
        for(int i=0;i<k-1;i++)
        {
            cur = cur.next;
        }
        ListNode left =cur;
        ListNode cur1= head;
        for(int i=0;i<n-k;i++)
        {
            cur1 = cur1.next;
        }
        ListNode right = cur1;
        int temp = left.val;
        left.val = right.val;
        right.val = temp;

        return head;
    }
}