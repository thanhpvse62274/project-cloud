package se1268.group5.project.project.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "bill")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Instant date;

    private String note;

    @NotNull
    private Double totalPrice;

    @ManyToOne
    @JoinColumn(name = "bill_user", nullable = false)
    private User user;

    @ManyToMany
    @JoinTable(name = "bill_detail",
            joinColumns = @JoinColumn(name = "bill_id"),
            inverseJoinColumns = @JoinColumn(name = "shoes_id"))
    private Set<Shoes> shoes = new HashSet<>();

    public Bill(@NotNull Instant date, String note, @NotNull Double totalPrice, User user, Set<Shoes> shoes) {
        this.date = date;
        this.note = note;
        this.totalPrice = totalPrice;
        this.user = user;
        this.shoes = shoes;
    }

    public Set<Shoes> getShoes() {
        return shoes;
    }

    public void setShoes(Set<Shoes> shoes) {
        this.shoes = shoes;
    }

    public Bill(@NotNull Instant date, String note, @NotNull Double totalPrice, User user) {
        this.date = date;
        this.note = note;
        this.totalPrice = totalPrice;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
