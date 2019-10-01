package lpmms.your_quadrigram.mysimplestack;

public class Item {

    public static final int MAX_VALUE = 25;
    public static final int MIN_VALUE = -25;

    private String name;
    private int value;

    public void add(int value) throws Exception {
        if (this.value + value > MAX_VALUE) {
            throw new Exception("The item has reached its max value.");
        }
        this.value += value;
    }

    public void decrement(int value) throws  Exception{
        if (this.value - value < MIN_VALUE) {
            throw new Exception("The item has reached its min value.");
        }
        this.value -= value;
    }

    public boolean equals(Item item) {
        return this.name.equals(item.getName())
                && item.getValue() == this.value;
    }

    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) throws Exception {
        if (value > MAX_VALUE) {
            throw new Exception("The item's value can't be higher than " + MAX_VALUE);
        } else if (value < MIN_VALUE) {
            throw new Exception("The item's value can't be lower than " + MIN_VALUE);
        }

        this.value = value;
    }

}
