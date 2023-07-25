public class Person {
    private String name;
    private String email;
    private String address;
    private String phone;

    private Person(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
    }

    public static class Builder {
        private String name;
        private String email;
        private String address;
        private String phone;

        public Builder(String name) {
            this.name = name;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", email=" + email + ", address=" + address + ", phone=" + phone + "]";
    }
}

/**
 * Usage:
 * Person john = new Person.Builder("John Doe")
                        .withEmail("john@example.com")
                        .withAddress("1234 Elm St")
                        .withPhone("123-456-7890")
                        .build();
 */