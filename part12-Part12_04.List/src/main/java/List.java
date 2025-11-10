public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;

    @SuppressWarnings("unchecked")
    public List() {
        this.values = (Type[]) new Object[10]; // Correct generic array workaround
        this.firstFreeIndex = 0;
    }

    public void add(Type value) {
        if (this.firstFreeIndex == this.values.length) {
            grow();
        }
        this.values[this.firstFreeIndex++] = value;
    }

    @SuppressWarnings("unchecked")
    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.firstFreeIndex; i++) {
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }

    public boolean contains(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    private int indexOfValue(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Type value) {
        int index = indexOfValue(value);
        if (index == -1) return;

        for (int i = index; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
        this.values[--this.firstFreeIndex] = null;
    }

    public Type value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        return this.values[index];
    }

    public int size() {
        return this.firstFreeIndex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.firstFreeIndex; i++) {
            sb.append(this.values[i]);
            if (i < this.firstFreeIndex - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
