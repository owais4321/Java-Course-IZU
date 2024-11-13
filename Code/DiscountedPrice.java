class DiscountedPrice {
    public static void main(String arg[]){
        double indprice = 200;
        int qty = 3;
        double discount = 0.1;

        double price = indprice*qty;

        price-=indprice*qty*discount;

        System.out.println(price);







    }

}