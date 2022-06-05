
public class ProductCustomer {

    public static class Product {

        private int itemNo;
        private String name;
        private double price;
        private int qty;

        public int getItemNo() {
            return itemNo;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;

        }

        public int getQty() {
            return qty;
        }

        public void setPrice(double p) {
            if (p > 0)
                price = p;

            else
                price = 0;
        }

        public void setQty(int q) {
            if (q > 0)
                qty = q;
            else
                qty = 0;
        }

        public Product(int itemNo, String name) {
            itemNo = getItemNo();
            name = getName();

        }

        public Product(int itemNo, String name, double price, int qty) {
            itemNo = getItemNo();
            name = getName();
            price = getPrice();
            qty = getQty();

        }

        public static class Customer {
            private String custId;
            private String custname;
            private String address;
            private String phoneNo;

            public Customer(String cid) {
                custId = cid;

            }

            public String getCustId() {
                return custId;

            }

            public String getCustName() {
                return custname;

            }

            public String getCustAddress() {
                return address;

            }

            public String getPhoneno() {
                return phoneNo;
            }

            public void setCustAdd() {
                address = getCustAddress();
            }

            public Customer(String cid, String n, String add, String phNo) {
                custId = cid;
                custname = n;
                address = add;
                phoneNo = phNo;

            }

        }

        public static void main(String[] args) {

            Product p = new Product(1, "hello");
        }
    }
}
