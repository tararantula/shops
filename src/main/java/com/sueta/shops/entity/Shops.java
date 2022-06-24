package com.sueta.shops.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder


public class Shops {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String address;
    private String phoneNumber;
    @OneToMany(mappedBy = "shopsId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Products> receiptSet;
}
