package rmuti.LiveLab1_1;

import java.security.PublicKey;

public class ArrayListPQ {
    private ArrayList lst;


    public void enqueue(Object e) {
        lst.add(e);
    }
    public Object peek(){
        int max = maxObj();
        return lst.get(max);
    }

    public Object dequeue() {
        int max = maxObj();
        Object obj = lst.get(max);
        lst.remove(max);
        return  obj;
    }

    private int maxObj(){
    {
        int maxIndex = 0;
        for (int i = 0; i < lst.size(); i++) {
            Student maxObj = (Student) lst.get(i);
            Student studentI = (Student) lst.get(maxIndex);
            if(studentI.compareTo(maxObj)>0){
                maxIndex = 1;
            }
        }
        return maxIndex;
        }
    }
}
