package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.Instant;


@MappedSuperclass
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
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
//
//    public Long getId() {
//        return id;
//    }
//
//    public Date getCreateDate() {
//        return createDate;
//    }
//
//    public void setCreateDate(Date createDate) {
//        this.createDate = createDate;
//    }
//
//    public Date getUpdateDate() {
//        return updateDate;
//    }
//
//    public void setUpdateDate(Date updateDate) {
//        this.updateDate = updateDate;
//    }
//
//    public Boolean getDeleted() {
//        return deleted;
//    }
//
//    public void setDeleted(Boolean deleted) {
//        this.deleted = deleted;
//    }
//
//    public Integer getVersion() {
//        return version;
//    }
}
