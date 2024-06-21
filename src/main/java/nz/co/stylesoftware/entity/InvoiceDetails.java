package nz.co.stylesoftware.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="invoice_details")
@Data
@NoArgsConstructor
public class InvoiceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long invoiceno;
	private String custname;
	private String custcity;
	
	public InvoiceDetails(String custname, String custcity) {
		super();
		this.custname = custname;
		this.custcity = custcity;
	}
	
	
}
