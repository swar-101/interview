package invoice;

public class Invoice implements CloneableObject<Invoice> {

    private Long invoiceId;
    private String customerName;
    private Double amount;
    private String paymentMethod;
    private InvoiceType invoiceType;

    public InvoiceType getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(InvoiceType invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Invoice(Long invoiceId, String customerName, Double amount, String paymentMethod, InvoiceType invoiceType) {
        this.invoiceId = invoiceId;
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.invoiceType = invoiceType;
    }

    public Invoice() {}

    public Long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public Invoice cloneObject() {
        return new Invoice(invoiceId, customerName, amount, paymentMethod, invoiceType);
    }
}