package SOLID;

public class DatabaseInvoiceDao implements  InvoiceDao
{


    @Override
    public void save(Invoice invoice)
    {
        System.out.println("Saving to DB");
    }
}
