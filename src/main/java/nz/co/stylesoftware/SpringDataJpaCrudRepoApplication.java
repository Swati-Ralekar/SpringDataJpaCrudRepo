package nz.co.stylesoftware;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import nz.co.stylesoftware.entity.InvoiceDetails;
import nz.co.stylesoftware.service.IInvoiceDetailsService;

@SpringBootApplication
public class SpringDataJpaCrudRepoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringDataJpaCrudRepoApplication.class, args);
		
		IInvoiceDetailsService service = context.getBean(IInvoiceDetailsService.class);
		
		//System.out.println(service.addInvoiceDetails(new InvoiceDetails("JKK","Auckland")));
		
		//----------------------------------------------------------------------------------------
//		
//		  List<InvoiceDetails> invoiceList = new ArrayList<InvoiceDetails>();
//		  invoiceList.add(new InvoiceDetails("Vimal", "Auckland")); 
//		  invoiceList.add(new InvoiceDetails("Great Flavours", "Auckland")); 
//		  invoiceList.add(new InvoiceDetails("SH", "Tauranga"));
//		  System.out.println(service.addInvoicesInBulk(invoiceList));
		 
		//----------------------------------------------------------------------------------------
		
		//System.out.println(service.findInvoiceById(1L));
		
		//----------------------------------------------------------------------------------------
//		List<Long> idList = new ArrayList<Long>();
//		idList.add(1L);
//		idList.add(2L);
//		idList.add(6L);
//		service.findInvoicesByIds(idList).forEach((c)->System.out.println(c));
		//----------------------------------------------------------------------------------------
		
		service.findAllInvoices().forEach((c)->System.out.println(c));
		
		System.out.println(service.deleteInvoiceById(1L));
	}

}
