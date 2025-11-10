public class Container {
    private int content;

    public Container() {
        this.content = 0;
    }

    public int contains() {
        return this.content;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        if (this.content + amount > 100) {
            this.content = 100;
        } else {
            this.content += amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        if (this.content - amount < 0) {
            this.content = 0;
        } else {
            this.content -= amount;
        }
    }

    public String toString() {
        return this.content + "/100";
    }
}
