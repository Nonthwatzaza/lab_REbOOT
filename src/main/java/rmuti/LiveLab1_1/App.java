package rmuti.LiveLab1_1;

public class App {
    public static void main(String[] args) {
        ArrayListPQ pq = new ArrayListPQ();
        Student s1 = new Student();
        s1.setName("1");
        s1.setGrade(2.0);

        Student s2 = new Student();
        s2.setName("2");
        s2.setGrade(3.5);

        Student s3 = new Student();
        s3.setName("3");
        s3.setGrade(0.5);


        pq.enqueue(s1);
        pq.enqueue(s2);
        pq.enqueue(s3);

        Object s = pq.peek();
        System.out.println(s);

/*
        Student maxObj = arr[0];
        int maxindex =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(maxObj) > 0) {
                maxindex = i;
            }
            }
        System.out.println(arr[maxindex]);
                //  lst.add(100);
                // lst.add(2);
                // lst.add(10_000_000);
                // System.out.println(lst);
                // lst.remove(1);
                // lst.add(10_000);
                // System.out.println(lst);
                /*
 */
            }
        }
