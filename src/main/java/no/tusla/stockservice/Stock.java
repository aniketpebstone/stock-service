package no.tusla.stockservice;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "stock")
public class Stock {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
 	@Column(name = "company", nullable = false)
 	private String company;
 	@Column(name = "model", nullable = false)
	private String model;
	@Column(name = "quantity", nullable = false)
	private int quantity;

	@Override
	public String toString()
	{
		return "| Company:"+getCompany()+"  | Model:"+getModel()+"  | Quantity:"+getQuantity()+" |";
	}

}