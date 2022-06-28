public class queuemain {
    public static void main(String[] args) throws Exception {
        circularqueue q = new circularqueue(6);
        q.insert(2);
        q.insert(4);
        q.insert(6);
        q.insert(8);
        q.insert(9);
        q.display();
        System.out.println(q.remove());
        q.insert(5);
        q.display();
    }
}
