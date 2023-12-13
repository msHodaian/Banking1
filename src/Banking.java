import java.util.LinkedList;
import java.util.Queue;

public class Banking {
    private static final int bankServicingTime = 240;
    private static int time = 0;
    private static int i = 1;

    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();
        while (time <= bankServicingTime) {
            int serviceTime = (int) (Math.random() * 6 + 5);
            queue.add(new Customer(i, time, serviceTime, (time + serviceTime)));
            time += 5;
            i++;
        }
        Teller teller1 = new Teller(1);
        Teller teller2 = new Teller(2);
        Teller teller3 = new Teller(3);

        while (!queue.isEmpty()) {
            if (teller1.isFree()) {
                teller1.serve(queue.poll());
                teller1.tick();
            }
            if (teller2.isFree()&&!queue.isEmpty()) {
                teller2.serve(queue.poll());
                teller2.tick();
            }
            if (teller3.isFree()&&!queue.isEmpty()) {
                teller3.serve(queue.poll());
                teller3.tick();
            }
        }
    }

}
