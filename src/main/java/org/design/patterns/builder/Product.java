package org.design.patterns.builder;

public class Product {
    private String name;
    private String description;
    private Long price;

    public Product(String name, String description, Long price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    public static class ProductBuilder {
        private String name;
        private String description;
        private Long price;

        ProductBuilder() {
        }

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder description(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder price(Long price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(name, description, price);
        }
    }
}
