public class Chain<T> {
    private T[] cylinder;
    private int location;

    public Chain(int size) {
        if (size < 0)
            throw new IllegalArgumentException("Size can't be less than zero");

        cylinder = (T[]) new Object[size];
        location = 0;
    }

    public void add(T value) {
        if (location >= cylinder.length)
            throw new ArrayStoreException("Out of space");

        cylinder[location] = value;
        location++;
    }
    public T get(int location){
        if(location < 0 || location >= cylinder.length)
            throw new ArrayIndexOutOfBoundsException("Out of bounds");

        return cylinder[location];
    }
}