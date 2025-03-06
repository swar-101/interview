package invoice;

import invoice.registry.InvoiceRegistry;
import invoice.registry.InvoiceRegistryImpl;

public class Application {
    public static void main(String[] args) {
        InvoiceRegistry registry = new InvoiceRegistryImpl();

        // Let's create a few prototypes 🧑‍🔬⚗️🧪
        Invoice adamsInvoice =
                new Invoice(134L, "Adam Frimpong", 134.0, "Debit Card", InvoiceType.PURCHASE);

        Invoice rafisInvoice =
                new Invoice(1343L, "Raphinha", 13412.0, "Credit Card", InvoiceType.SERVICE);

        Invoice laminesInvoice =
                new Invoice(1345L, "Lamine Yamal", 12342.0, "Gift Card", InvoiceType.SALES);

        // "These invoice are going to come handy while testing our APIs" Hmmm... neat!
        registry.addPrototype(adamsInvoice);
        registry.addPrototype(rafisInvoice);
        registry.addPrototype(laminesInvoice);


        // Let's say, I want to fetch a type where the invoice is a sale
        Invoice aSalesInvoice = registry.getPrototype(InvoiceType.SALES);
        // You see? A standard prototype is ready for testing already. We don't need to fetch it from DB and test it.
        // This saves time!

        String salesCustomerName = aSalesInvoice.getCustomerName();
        System.out.println(salesCustomerName);
    }
}
