package ie.atu.productv3;

public class ProductDB {
    public static Product getProduct(String productCode) {

        Software mySoftware = null;
        Book myBook = null;
        Product myProduct = null;
        Music myMusic = null;



        //Book products by code
        if (productCode.equalsIgnoreCase("java")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct = myBook;
        }


        //Software products by code
        if (productCode.equalsIgnoreCase("studios")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        }
        else if (productCode.equalsIgnoreCase("eclipse")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        }
        else if (productCode.equalsIgnoreCase("oracle")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }


        //Music products by code
        if (productCode.equalsIgnoreCase("YouTube")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Classic vibes");
            myMusic.setPrice(7.50);
            myMusic.setArtist("Abba");
            myMusic.setLabel("Thank you for the music");
            myProduct = myMusic;
        }
        else if (productCode.equalsIgnoreCase("applemusic")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Essentials");
            myMusic.setPrice(10.99);
            myMusic.setArtist("Taylor Swift");
            myMusic.setLabel("Midnights");
            myProduct = myMusic;
        }
        if (productCode.equalsIgnoreCase("deezer")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Top Charts");
            myMusic.setPrice(7.99);
            myMusic.setArtist("Billie Eilish");
            myMusic.setLabel("Happier Than Ever");
            myProduct = myMusic;
        }

        return myProduct;

    }
}


