package com.company;

public class User {

    private String uuid;
    private String name;
    private String surname;
    private String email;

    private User(Builder builder) {
        this.uuid = builder.uuid;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
    }

    @Override
    public String toString() {

        var sb = new StringBuilder();

        sb.append("\"User{\"");

        if (uuid != null) {
            sb.append("uuid='" + uuid + '\'');
        }
        if (name != null) {
            sb.append(", name='" + name + '\'');
        }
        if (surname != null) {
            sb.append(", surname='" + surname + '\'');
        }
        if (email != null) {
            sb.append(", email='" + email + '\'');
        }

        sb.append('}');

        return sb.toString();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static class Builder {
        private String uuid;
        private String name;
        private String surname;
        private String email;

        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

}
