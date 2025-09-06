package com.example.EcommerceSpring.entity;

import jakarta.persistence.*; //importing JPA annotations like @Id, @Column, used for mapping class into a db structure
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.Instant; //instant class from java time API which represents the timestamp in UTC

//this file is just to remove duplication

@MappedSuperclass //used to define base class that contains common fields, which will be inherited and mapped to child entity tables. Unlike entity it does not gets it own table
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment this value
    private long id;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Instant createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private Instant updatedAt;

    @PrePersist //automatically called before the entity is saved for the first time
    public void onCreate(){
        Instant now = Instant.now();
        this.createdAt = now;
        this.updatedAt = now;
    }

    @PreUpdate
    public void onUpdate(){
        this.updatedAt = Instant.now();
    }


}
