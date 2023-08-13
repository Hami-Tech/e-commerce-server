package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.Instant;


@MappedSuperclass
@ToString
@AllArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@Component
@EntityListeners(AuditingEntityListener.class)
@Audited
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @CreatedDate
    private Instant createDate;

    @LastModifiedDate
    private Instant updateDate;


    @Column(columnDefinition = "integer", length = 1)
    private Boolean deleted = false;


    @Version
    private Integer version;

}
