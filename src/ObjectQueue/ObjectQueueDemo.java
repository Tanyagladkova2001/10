package ObjectQueue;

import java.util.List;

public class ObjectQueueDemo {
    public static void main(String[] args) {
        List<String> students = new ObjectQueue<String>();
        students.add ("Karol");
        students.add ("Kim");
        students.add ("Tom");
        System.out.println(students.get(1));
    }
}
