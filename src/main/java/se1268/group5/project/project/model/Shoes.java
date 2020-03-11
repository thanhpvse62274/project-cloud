package se1268.group5.project.project.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Entity
@Table(name = "shoes")
public class Shoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Double price;

    @NotNull
    private Instant createDate;

    @NotNull
    private String sex;

    @NotNull
    private Integer size;

    @ManyToOne
    @JoinColumn(name = "shoes_category_id", nullable = false)
    private ShoesCategory shoesCategory;

    public Shoes(@NotNull String name, @NotNull Double price, @NotNull Instant createDate, @NotNull String sex,
                 @NotNull Integer size, ShoesCategory shoesCategory) {
        this.name = name;
        this.price = price;
        this.createDate = createDate;
        this.sex = sex;
        this.size = size;
        this.shoesCategory = shoesCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Instant getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Instant createDate) {
        this.createDate = createDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ShoesCategory getShoesCategory() {
        return shoesCategory;
    }

    public void setShoesCategory(ShoesCategory shoesCategory) {
        this.shoesCategory = shoesCategory;
    }
}
