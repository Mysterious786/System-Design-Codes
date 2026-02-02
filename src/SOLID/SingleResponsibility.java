package SOLID;

class Marker
{
    private String name;
    private String color;
    private int price;
    public Marker(String name,String color,int price)
    {
        this.color = color;
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


class InvoicePrint
{
    private Invoice invoice;
    public InvoicePrint(Invoice invoice)
    {
        this.invoice = invoice;
    }
    public void print()
    {
        System.out.println("The total Invoice Bill is :" + this.invoice.calculateTotal());
    }
}
public class SingleResponsibility {

    public static void main(String args[])
    {
        Marker marker = new Marker("Saqlain","red",30);
        Invoice invoice = new Invoice(marker,3);
        InvoicePrint print = new InvoicePrint(invoice);
        DatabaseInvoiceDao dao = new DatabaseInvoiceDao();
        FileInvoiceDao fdao = new FileInvoiceDao();
        dao.save(invoice);
        fdao.save(invoice);
        print.print();

    }
}
