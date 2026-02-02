package SOLID;

public class FileInvoiceDao implements InvoiceDao {

    @Override
    public void save(Invoice invoice)
    {
        System.out.println("Saving to File System");
    }
}
