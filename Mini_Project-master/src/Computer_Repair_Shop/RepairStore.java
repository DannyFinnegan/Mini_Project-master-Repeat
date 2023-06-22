package Computer_Repair_Shop;

import java.util.ArrayList;

public class RepairStore {
    private ArrayList<Repair> repairs;

    public RepairStore() {
        repairs = new ArrayList<>();
    }

    public void addRepair(int repairID, String customerEmail, String repairDetail, double price, String repairStatus) {
        Repair repair = new Repair(repairID, customerEmail, repairDetail, price, repairStatus);
        repairs.add(repair);
    }


    public void displayRepairs() {
        System.out.println("Repair ID\tCustomer Email\tRepair Details\tPrice\t\tRepair Status");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < repairs.size(); i++) {
            Repair repair = repairs.get(i);
            System.out.printf("%d\t\t%s\t\t%s\t\t$%.2f\t\t%s\n",
                    repair.getRepairID(), repair.getCustomerEmail(), repair.getRepairDetail(),
                    repair.getPrice(), repair.getRepairStatus());
        }
        System.out.println("-----------------------------------------------------------");
    }


    private class Repair {
        private int repairID;
        private String customerEmail;
        private String repairDetail;
        private double price;
        private String repairStatus;

        public Repair(int repairID, String customerEmail, String repairDetail, double price, String repairStatus) {
            this.repairID = repairID;
            this.customerEmail = customerEmail;
            this.repairDetail = repairDetail;
            this.price = price;
            this.repairStatus = repairStatus;
        }

        public int getRepairID() {
            return repairID;
        }

        public String getCustomerEmail() {
            return customerEmail;
        }

        public String getRepairDetail() {
            return repairDetail;
        }

        public double getPrice() {
            return price;
        }

        public String getRepairStatus() {
            return repairStatus;
        }

        public void setRepairStatus(String repairStatus) {
            this.repairStatus = repairStatus;
        }
    }
}
