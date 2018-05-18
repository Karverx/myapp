package ru.levelp.myapp.model;

import javax.persistence.*;
import java.util.Objects;

import static ru.levelp.myapp.model.Part.SEARCH_BY_PART_ID;

@Entity
@NamedQueries({
        @NamedQuery(name = SEARCH_BY_PART_ID, query = "from Part where partId =:partId")
})
public class Part {
    public static final String SEARCH_BY_PART_ID = "MyQuery";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "part_id", unique = true, nullable = false)
    private String partId;

    @Column
    private String title;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Supplier supplier;

    @Column
    private boolean legacy;

    public Part(){}



    public Part(String partId, String title){
        if (partId == null) throw new IllegalArgumentException("partId shouldn't be null");

        this.partId = partId;
        this.title = title;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public boolean isLegacy() {
        return legacy;
    }

    public void setLegacy(boolean legacy) {
        this.legacy = legacy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Part part = (Part) o;
        return id == part.id &&
                legacy == part.legacy &&
                Objects.equals(partId, part.partId) &&
                Objects.equals(title, part.title) &&
                Objects.equals(supplier, part.supplier);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, partId, title, supplier, legacy);
    }

}
