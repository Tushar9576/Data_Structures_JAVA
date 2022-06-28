public class mergesort {

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return mergeLL(left,right);

    }



    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public static LL mergeLL(LL first, LL second){
        ListNode f = first.head;
        ListNode s = second.head;

        LL ans = new LL();
        while(f != null && s != null){
            if(f.val < s.val){
                ans.insertLast(f.val);
                f = f.next;
            }else{
                ans.insertLast(s.val);
                s = s.next;
            }

        }
        while( f != null){
            ans.insertLast(f.val);
            f = f.next;
        }
        while( s != null){
            ans.insertLast(s.val);
            s = s.next;
        }
        return ans;
    }
    class ListNode {
        int val;

        public ListNode() {

        }

        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
