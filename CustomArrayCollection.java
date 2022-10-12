public class CustomArrayCollection implements ArrayCollection {
    private int[] array;
    private int size;

    public CustomArrayCollection() {
        this.array = new int[10];
        this.size = 0;
    }

    @Override
    public void add(int element) {
        if (array.length == size) {
            int[] newArr = new int[(int) (array.length * 1.5)];
            System.arraycopy(array, 0, newArr, 0, array.length);
            array = newArr;
        }
        array[size] = element;
        size++;
    }

    @Override
    public int get(int index) {
        if (index >= size) throw new IndexOutOfBoundsException("index > size");
        return array[index];
    }

    @Override
    public void remove(int index) {
        if (index >= size) throw new IndexOutOfBoundsException("index > size");
        size--;
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }

    @Override
    public int findIndex(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) return i;
        }

        return -1;
    }

    @Override
    public boolean contains(int element) {
        return findIndex(element) != -1;
    }

    @Override
    public int size() {
        return size;
    }
}
