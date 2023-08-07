package com.hmaitech.onlineshop.model.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Entity(name = "receiptEntity")
@Table(name = "Receipt")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Component
public class ReceiptEntity extends BaseEntity{

        public static enum Status {
            InProgress, Sent, Received
        }

        @NotNull
        private Integer invoiceNumber;

        @ManyToOne
        private Contact to;

        @ManyToOne
        private UserEntity lastEditor;

        @NotNull
        private LocalDate lastEdited;

        @NotNull
        private LocalDate invoiceDate;

        @NotNull
        private LocalDate dueDate;



}
