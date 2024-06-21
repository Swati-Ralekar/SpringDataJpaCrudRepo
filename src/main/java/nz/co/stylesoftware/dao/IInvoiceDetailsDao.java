package nz.co.stylesoftware.dao;

import org.springframework.data.repository.CrudRepository;

import nz.co.stylesoftware.entity.InvoiceDetails;

public interface IInvoiceDetailsDao extends CrudRepository<InvoiceDetails, Long>{

}
