package invoice.registry;

import invoice.Invoice;
import invoice.InvoiceType;

import java.util.HashMap;
import java.util.Map;

public class InvoiceRegistryImpl implements InvoiceRegistry {

    public static Map<InvoiceType, Invoice> registry = new HashMap<>();

    @Override
    public void addPrototype(Invoice invoice) {
        registry.put(invoice.getInvoiceType(), invoice);
    }

    @Override
    public Invoice getPrototype(InvoiceType invoiceType) {
        return registry.get(invoiceType);
    }

    @Override
    public Invoice clone(InvoiceType invoiceType) {
        Invoice invoice = registry.get(invoiceType);
        if (invoice == null) {
            throw new IllegalArgumentException();
        }

        return invoice;
    }
}