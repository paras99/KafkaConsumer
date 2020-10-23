package com.PODownload.Consumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "PO")
public class POModel {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   int PO_number;
   @Column(name="PO_date")
   String PO_date;
   @Column(name="PO_address")
   String PO_address;
   @Column(name="PO_line_number")
   int PO_line_number;
   @Column(name="UPC_number")
   int UPC_number;
   @Column(name="UPC_name")
   String UPC_name;
   @Column(name="ordered_quantity")
   int ordered_quantity;

}

