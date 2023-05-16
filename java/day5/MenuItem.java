package day5;

public class MenuItem {
    private final String name;
    private final String description;
    private final double price;

    public static class Builder {
        // Bắt buộc phải khai báo tối thiểu các thuộc tính name và price trong builder
        private final String name;
        private final double price;

        private String description = "";

        public Builder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public MenuItem build() {
            return new MenuItem(this);
        }
    }

    private MenuItem(Builder builder) {
        name = builder.name;
        description = builder.description;
        price = builder.price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}

