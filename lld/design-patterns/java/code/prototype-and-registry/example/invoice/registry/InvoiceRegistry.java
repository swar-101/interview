package invoice.registry;

import invoice.Invoice;
import invoice.InvoiceType;

public interface InvoiceRegistry {
    void addPrototype(Invoice invoice);
    Invoice getPrototype(InvoiceType invoiceType);
    Invoice clone(InvoiceType invoiceType);
}
