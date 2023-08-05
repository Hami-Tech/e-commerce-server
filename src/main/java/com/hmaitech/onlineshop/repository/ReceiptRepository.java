package com.hmaitech.onlineshop.repository;

import com.hmaitech.onlineshop.model.entity.ReceiptEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("receiptRepository")
public interface ReceiptRepository extends JpaRepository<ReceiptEntity, Long> {
}
