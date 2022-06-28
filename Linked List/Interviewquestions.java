public class Interviewquestions {

    // Amazon, Facebook, Google
   //  https://leetcode.com/problems/reverse-linked-list-ii/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        // SKIP THE first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left-1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newend = current;
        
        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left +1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        if(last != null){
            last.next = prev;

        }
        else {
            head = prev;
        }
        newend.next = current;
        return head;
    }

    // linkedin, google, facebook, microsoft, amazon, apple
    // https://leetcode.com/problems/palindrome-linked-list/
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereversehead = headSecond;

        // compare both the halves
        while(head != null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereversehead);
        return head == null || headSecond == null;
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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;
        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev ;
    }

    // Google, Facebook
    // https://leetcode.com/problems/reorder-list/
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;
        // rearrange
        while(hf != null && hs != null){
            // for the first half
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            // for the second half
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        // next of tail to null
        if (hf != null){
            hf.next = null;
        }

    }

    // Google
    // https://leetcode.com/problems/reverse-nodes-in-k-group/

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        while(current != null){
            ListNode last = prev;
            ListNode newend = current;
            // reverse between left and right
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if(next != null){
                    next = next.next;
                }
            }
            if(last != null){
                last.next = prev;

            }
            else {
                head = prev;
            }
            newend.next = current;
            // skip k nodes
            for (int i = 0; i < k && current != null; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    // https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
    public ListNode reversealternateKGroup(ListNode head, int k) {
        if(k <= 1 || head == null){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        while(true){
            ListNode last = prev;
            ListNode newend = current;
            // reverse between left and right
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if(next != null){
                    next = next.next;
                }
            }
            if(last != null){
                last.next = prev;

            }
            else {
                head = prev;
            }
            newend.next = current;
            if(current == null){
                break;
            }
            prev = newend;
        }
        return head;
    }

    // Facebook, Twitter, Google
    //  https://leetcode.com/problems/rotate-list/
    public ListNode rotateRight(ListNode head, int k) {
        if( k <= 0 || head == null || head.next == null){
            return  head;
        }
        ListNode last = head;
        int length = 1;
        while (last.next != null){
            last = last.next;
            length++;
        }
        last.next = head;
        ListNode newlast = head;
        int rotation = k % length;
        int skip = length - rotation;
        for (int i = 0; i < skip - 1; i++) {
            newlast = newlast.next;
        }
        head = newlast.next;
        newlast.next = null;
        return head;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {

      }
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }
  }
}
