package nz.co.stylesoftware.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nz.co.stylesoftware.dao.IInvoiceDetailsDao;
import nz.co.stylesoftware.entity.InvoiceDetails;

@Service
public class InvoiceDetailsServiceImpl implements IInvoiceDetailsService{

	@Autowired
	IInvoiceDetailsDao repo;
	
	public String addInvoiceDetails(InvoiceDetails invoiceDetails) {
		repo.save(invoiceDetails);
		return invoiceDetails+" Details has been recorded succefully!";
	}

	@Override
	public String addInvoicesInBulk(List<InvoiceDetails> invoiceList) {
		repo.saveAll(invoiceList);
		return "All invoices details has been recorded succefully!";
	}

	@Override
	public InvoiceDetails findInvoiceById(Long id) {
		Optional<InvoiceDetails> invoiceDetails = repo.findById(id);
		if(invoiceDetails.isPresent()) {
			return invoiceDetails.get();
		}
		return new InvoiceDetails();
	}

	@Override
	public List<InvoiceDetails> findInvoicesByIds(List<Long> idList) {
		List<InvoiceDetails> detailsByIds = (List<InvoiceDetails>) repo.findAllById(idList);
		return detailsByIds;
	}

	@Override
	public List<InvoiceDetails> findAllInvoices() {
		List<InvoiceDetails> allInvoices = (List<InvoiceDetails>) repo.findAll();
		return allInvoices;
	}

	@Override
	public String deleteInvoiceById(Long id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Record for id "+id+" has been deleted successfully!";
		}
		return "Record for id "+id+" does not exists.";
	}
}
