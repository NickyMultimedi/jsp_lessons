package be.multimedi.jsp.guestbook;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class GuestBookEntry implements Serializable {
    int id;
    String name;
    String message;
    LocalDateTime date;

    public GuestBookEntry() {
    }

    public GuestBookEntry(int id, String name, String message, LocalDateTime date) {
        this(name, message, date);
        this.id = id;
    }

    public GuestBookEntry(String name, String message, LocalDateTime date) {
        this.name = name;
        this.message = message;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "GuestBookEntry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuestBookEntry that = (GuestBookEntry) o;
        return getId() == that.getId() &&
                getName().equals(that.getName()) &&
                getMessage().equals(that.getMessage()) &&
                getDate().equals(that.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getMessage(), getDate());
    }
}
