package ie.atu.productv4;

public class ProductDB {

    public static Product getProduct(String productCode) {

        Product myProduct = null;

        productCode = productCode.toLowerCase();

        if (productCode.equals("java")) {
            Book b = new Book();
            b.setCode(productCode);
            b.setDescription("ATU Java Programming");
            b.setPrice(57.50);
            b.setAuthor("Joe Brown");
            myProduct = b;
        }
        else if (productCode.equals("jsp")) {
            Book b = new Book();
            b.setCode(productCode);
            b.setDescription("Java Servlets and JSP");
            b.setPrice(57.50);
            b.setAuthor("Mike White");
            myProduct = b;
        }
        else if (productCode.equals("mysql")) {
            Book b = new Book();
            b.setCode(productCode);
            b.setDescription("Lennon's MySQL");
            b.setPrice(54.50);
            b.setAuthor("Jim Lennon");
            myProduct = b;
        }

        else if (productCode.equals("studios")) {
            Software s = new Software();
            s.setCode(productCode);
            s.setDescription("Visual Studios");
            s.setPrice(57.50);
            s.setVersion("Microsoft 1.1");
            myProduct = s;
        }
        else if (productCode.equals("eclipse")) {
            Software s = new Software();
            s.setCode(productCode);
            s.setDescription("Build Java apps");
            s.setPrice(57.50);
            s.setVersion("Eclipse Neon");
            myProduct = s;
        }
        else if (productCode.equals("oracle")) {
            Software s = new Software();
            s.setCode(productCode);
            s.setDescription("Latest MySQL");
            s.setPrice(54.50);
            s.setVersion("Oracle 3.0");
            myProduct = s;
        }

        else if (productCode.equals("youtube")) {
            Music m = new Music();
            m.setCode(productCode);
            m.setDescription("Classic vibes");
            m.setPrice(7.50);
            m.setArtist("Abba");
            m.setLabel("Thank you for the music");
            myProduct = m;
        }
        else if (productCode.equals("applemusic")) {
            Music m = new Music();
            m.setCode(productCode);
            m.setDescription("Essentials");
            m.setPrice(10.99);
            m.setArtist("Taylor Swift");
            m.setLabel("Midnights");
            myProduct = m;
        }
        else if (productCode.equals("deezer")) {
            Music m = new Music();
            m.setCode(productCode);
            m.setDescription("Top Charts");
            m.setPrice(7.99);
            m.setArtist("Billie Eilish");
            m.setLabel("Happier Than Ever");
            myProduct = m;
        }

        else if (productCode.equals("samsung")) {
            TV tv = new TV();
            tv.setCode(productCode);
            tv.setDescription("4K Smart TV");
            tv.setPrice(799.99);
            tv.setScreenSize(55);
            tv.setManufacture("Samsung");
            myProduct = tv;
        }
        else if (productCode.equals("lg")) {
            TV tv = new TV();
            tv.setCode(productCode);
            tv.setDescription("Smart TV");
            tv.setPrice(699.99);
            tv.setScreenSize(50);
            tv.setManufacture("LG");
            myProduct = tv;
        }
        else if (productCode.equals("sony")) {
            TV tv = new TV();
            tv.setCode(productCode);
            tv.setDescription("OLED TV");
            tv.setPrice(999.99);
            tv.setScreenSize(65);
            tv.setManufacture("Sony");
            myProduct = tv;
        }

        return myProduct;
    }
}
