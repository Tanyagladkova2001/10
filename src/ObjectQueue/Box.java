package ObjectQueue;

public class Box<T> {

    private int  index;
    private  Box <T> nextObject;
    private T Object;

    public Box<T> getNextObject() {
        return nextObject;
    }

    public T getObject() {
        return Object;
    }

    public void setObject(T object) {
        Object = object;
    }

    public Box(T object) {
        Object = object;
    }

    public Box(int index) {
        this.index = index;
    }
    public Box(Box<T> nextObject) {
        this.nextObject = nextObject;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Box<T> next () {
        return nextObject;
    }

    public void setNextObject(Box<T> nextObject) {
        this.nextObject = nextObject;
    }
}
