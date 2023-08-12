package com.hmaitech.onlineshop.service;

import com.hmaitech.onlineshop.model.dto.ReceiptDto;
import com.hmaitech.onlineshop.model.entity.ReceiptEntity;
import com.hmaitech.onlineshop.repository.ReceiptRepository;
import org.springframework.stereotype.Service;

@Service
public class ReceiptService extends BaseAbstractService<ReceiptEntity, ReceiptRepository, ReceiptDto> {


}
