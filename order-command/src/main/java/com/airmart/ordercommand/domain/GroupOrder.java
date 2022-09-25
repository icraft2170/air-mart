package com.airmart.ordercommand.domain;

import java.time.LocalDateTime;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class GroupOrder extends BaseAuditor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "groupOrder")
    private List<Order> orders = new ArrayList<>();

    private Integer minimumQuantity;

    private LocalDateTime startDate;

    private LocalDateTime endDate;
}
