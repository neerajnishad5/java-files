

public class BankAccountInhertance {
    public static class Account {
        private double balance;
        private long accNo;
        private String name;
        private String address;
        private String phoneNo;
        private String dob;

        public long getAccNo() {
            return accNo;
        }

        public String getAddress() {
            return address;
        }

        public double getBalance() {
            return balance;
        }

        public String getDob() {
            return dob;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }

        public Account() {
            this.accNo = 0;
            this.name = "0";
            this.address = "0";

        }

        public Account(long accNo, String name, String address) {
            this.accNo = accNo;
            this.name = name;
            this.address = address;

        }

        public static class SavingsAccount extends Account {

            public double deposit(int depostiAmt) {
                return getBalance() + depostiAmt;

            }

            public double withdraw(int withdrawAmt) {
                return getBalance() - withdrawAmt;
            }

        }

        public static class LoanAccount extends Account {
            long EMIAmt = 40000;

            public double payEMI(int EMIAmt) {
                return this.EMIAmt - EMIAmt;
            }

            public double topUpLoan(int topUpAmt) {
                return this.EMIAmt + topUpAmt;
            }

            public double repayment(int EMIAmt) {
                return (EMIAmt - EMIAmt);

            }

        }

    }

    public static void main(String[] args) {
        
        
    }
}
