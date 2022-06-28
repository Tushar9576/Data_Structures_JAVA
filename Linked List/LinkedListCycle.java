// https://leetcode.com/problems/linked-list-cycle/
// Amazon and Microsoft

public class LinkedListCycle {

        public boolean hasCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow){
                    return true;
                }
            }
            return false;
        }
    public int LengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                // calculate the length
                ListNode temp = slow;
                int len = 0;
               do{
                  temp = temp.next;
                  len++;
                } while(temp != fast);
                return len;
            }
        }
        return 0;
    }

    //  https://leetcode.com/problems/linked-list-cycle-ii/

    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = LengthCycle(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        // find the start node
        ListNode first = head;
        ListNode second = head;
        while(length > 0){
            second = second.next;
            length--;
        }
        // keep moving both forward and they will meet at cycle start
        while(first !=second){
            first = first.next;
            second = second.next;
        }
        return second;
    }
    // https://leetcode.com/problems/happy-number/
    // Google

    public boolean isHappy(int n) {
            int slow = n;
            int fast = n;
            do {
                slow = findsquare(slow);
                fast = findsquare(findsquare(fast));
            }while (slow != fast);
            if( slow == 1){
                return true;
            }
            return false;
    }
    private int findsquare(int n){
            int ans = 0;
            while(n > 0){
                int rem = n % 10;
                ans += rem * rem;
                n = n / 10;
            }
        return ans;
    }
    // https://leetcode.com/problems/middle-of-the-linked-list/

    public ListNode middleNode(ListNode head) {
            ListNode s = head;
            ListNode f = head;
            while(f != null && f.next != null){
                s = s.next;
                f = f.next.next;
            }
            return s;
    }
    class ListNode {
    int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}

