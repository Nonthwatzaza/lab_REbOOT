package rmuti.LiveLab1_1;

import java.util.Arrays;

public class ArrayList {
    private Object[] elementData = new Object[1];
    private int size = 0;

    public void add(int i, Object e) {
        ensureCapacity(size + 1);
        for (int j = size = 1; j >= i; j--) {
            elementData[j + 1] = elementData[j];
        }
        elementData[i] = e;
        size++;
    }

    public void add(Object e) {
        add(size, e);

    }

    public void remove(int i) {
        for (int j = i; j < size - 1; j++) {
            elementData[j] = elementData[j + 1];
        }
        elementData[size - 1] = null;
        size--;
    }

    public Object get(int i) {
        return elementData[i];
    }

    public int size() {
        return size;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > elementData.length) {
            Object[] newData = new Object[elementData.length * 2];
            for (int i = 0; i < elementData.length; i++) {
                newData[i] = elementData[i];
            }
            elementData = newData;
        }

    }
    @Override
    public String toString() {
        return "ArrayList{" +
                "elementData=" + Arrays.toString(elementData) + ",size=" + size + '}';
    }
}
