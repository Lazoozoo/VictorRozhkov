package net.site.trn;

import java.util.Objects;

public final class Egar {

    private String name;
    private String phone;
    private int size;

    public Egar() {}

    public Egar(String name, String phone, int size) {
        this.name = name;
        this.phone = phone;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Egar egar = (Egar) o;
        return size == egar.size &&
                name.equals(egar.name) &&
                phone.equals(egar.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, size);
    }

    @Override
    public String toString() {
        return "Egar{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", size=" + size +
                '}';
    }
}
