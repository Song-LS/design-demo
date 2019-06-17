package com.sls.builder;

/**
 * @author sls
 **/
public class Custom {

    private Integer age;
    private String name;
    private String address;

    static Custom.Builder builder() {
        return new Custom.Builder();
    }

    private Custom(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {

        private Integer age;
        private String name;
        private String address;

        Builder() {}

        Builder age(Integer age) {
            this.age = age;
            return this;
        }

        Builder name(String name) {
            this.name = name;
            return this;
        }

        Builder address(String address) {
            this.address = address;
            return this;
        }

        Custom build() {
            return new Custom(this);
        }
    }
}
