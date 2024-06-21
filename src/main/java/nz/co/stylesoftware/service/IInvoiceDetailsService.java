package nz.co.stylesoftware.service;

import java.util.List;

import nz.co.stylesoftware.entity.InvoiceDetails;

public interface IInvoiceDetailsService {
	public String addInvoiceDetails(InvoiceDetails invoiceDetails);
	public String addInvoicesInBulk(List<InvoiceDetails> invoiceList);
	public InvoiceDetails findInvoiceById(Long id);
	public List<InvoiceDetails> findInvoicesByIds(List<Long> idList);
	public List<InvoiceDetails> findAllInvoices();
	public String deleteInvoiceById(Long id);
}
