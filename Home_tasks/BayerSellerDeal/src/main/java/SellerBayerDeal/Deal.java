package SellerBayerDeal;

import java.util.Date;

/**
 * Created by Anna on 13.12.2015.
 */
public class Deal {
    private Date date;
    private Participant bayer;
    Participant seller;
    Product[] products;

    public Deal(Product[] products, Participant seller, Participant bayer){
        this.products = products;
        this.seller = seller;
        this.bayer = bayer;
    }
}
