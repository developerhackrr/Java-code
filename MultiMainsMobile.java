class SIM { }
class SDCard { }

class Mobile {
    static void numberofSIMs(int sims){ }
    void numberofSDCards(int cards) { }
    
    static void insertSIM(SIM sim) { }
    void insertSDCard(SDCard card) { }
}

class Customer {
    public static void main(String[] args) {
        Mobile.numberofSIMs(5);
        Mobile.insertSIM(new SIM());
        
        Mobile mobile = new Mobile();
        mobile.numberofSDCards(1);
        mobile.insertSDCard(new SDCard());
    }
}