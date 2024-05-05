package lk.ijse.gdse66.spring.entity;

import jakarta.persistence.*;
import lk.ijse.gdse66.spring.enums.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sales {
    @Id
    private String oId;
    private String purchaseDate;
    private Double total;
    @Enumerated(EnumType.STRING)
    private Payment paymentMethod;
    private Integer totalPoints;
    private String cashier;
    @ManyToOne
    @JoinColumn(name = "customer_name", nullable = false)
    private Customer customerName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "oId")
    private List<SaleDetails> saleDetails = new ArrayList<>();


}
