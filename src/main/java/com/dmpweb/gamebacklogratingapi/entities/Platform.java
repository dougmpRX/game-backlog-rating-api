package com.dmpweb.gamebacklogratingapi.entities;

import com.dmpweb.gamebacklogratingapi.enums.BrandEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_platform")
@NoArgsConstructor
@Getter
@Setter
public class Platform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "brand")
    @Enumerated(EnumType.STRING)
    private BrandEnum brand;

    @Builder
    public Platform(String name, BrandEnum brand) {
        this.name = name;
        this.brand = brand;
    }
}
