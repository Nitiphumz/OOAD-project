import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class StaffSys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // instance of the class

        Staff staff = new Staff();
        Customer customer = new Customer();
        Chef chef = new Chef(null, null, null, null);
        Manager manager = new Manager(null,null,null);
        Bill bill = new Bill();
        Menu menu = new Menu();
        Table table = new Table(0, null);
        Order order = new Order();

        /* Example Customer */
        customer.addCusID(12);
        customer.addCusName("Patipol kaeomuang");
        customer.addCusPhoneNum("012");
        customer.addPointEarned(12);

        // Example Staff
        staff.addID("1");
        staff.addName("nitiphum");
        staff.addPassword("1234");

        // Example Chef
        chef.addChefID("2");
        chef.addChefName("sarawut");
        chef.addChefPassword("1234");
        chef.addExpertise("ThaiFood");

        // Example Manager
        manager.addManagerID("3");
        manager.addManagerName("pasit");
        manager.addManagerPassword("1234");
        manager.addOtPayment(1500);

        menu.setMenuId(12);
        menu.setMenuName("ผัดกระเพราหมูกรอบ");
        Detail[] Meats = new Detail[1];
        Meats[0] = new Detail(1, "หมูยอทอด", 10);
        menu.setMenuPrice(40);

        order.addorderID(1);
        order.addStatus("กำลังปรุง");
        table.setTableNum(1);
        table.setTableName("1");

        //Code Login User
        while (true) {
            // Interface Login User
            System.out.println("=============================");
            System.out.println("| AomNgoen Restaurant User |");
            System.out.println("=============================");
            System.out.println("1. Chef");
            System.out.println("2. Staff");
            System.out.println("3. Manager");
            System.out.println("0. Exit");
            System.out.println("-----------------------");
            System.out.print("Your option: ");

            // Get user choice type staff
            int choice = scanner.nextInt();

            //Login Chef
            if (choice == 1) {
            System.out.print("Username : ");
            String username = scanner.next();
            System.out.print("Password : ");
            String password = scanner.next();
            System.out.println();

            boolean x = chef.login(username, password);
            if (x == true) {

                //Interface Chef
                while (true) {
                    System.out.println("=============================");
                    System.out.println("|   Welcome    " + chef.getChefName() + "      |");
                    System.out.println("=============================");
                    System.out.println("\n1. AcceptOrdering" + "\n0. Logout");
                    System.out.println("What will you do?");
                    int chef_do = scanner.nextInt();

                    if (chef_do == 0) {
                        break;
                    } else if (chef_do == 1) {
                            //Show order
                            System.out.println("--------------------------------------------------------------------\n");
                            System.out.println("Table number " + table.getTableName());
                            System.out.println("Ordered by " + customer.getCusName(12));
                            System.out.println(menu.getMenuName());
                            System.out.println(Meats[0].getMenuOptionName());
                            System.out.println("Price : " + "50" );
                            System.out.println("--------------------------------------------------------------------\n");

                            System.out.println("\nHave you accept this order (Y/N) ?");
                            String AcceptOrder = scanner.next();

                    if (AcceptOrder.equalsIgnoreCase("y")) {

                            //Show Status Order
                            System.out.println("___________________________________________________________________\n");
                            System.out.println("Table number " + table.getTableName());
                            System.out.println("Ordered by " + customer.getCusName(12));
                            System.out.println(menu.getMenuName());
                            System.out.println(Meats[0].getMenuOptionName());
                            System.out.println("Price : " + "50" + " Bath");
                            System.out.println("__________________________________________________________________\n");
                            System.out.println(order.getStatus());
                            System.out.println("__________________________________________________________________\n");

                        System.out.println("\nHave you ready for send this order (Y/N) ?");

                        String EndOrder = scanner.next();
                        if (EndOrder.equalsIgnoreCase("y")){
                                System.out.println("Order sended");
                                System.out.println();
                            } else {
                                System.out.println("Order not send");
                                System.out.println();
                            }
                    } else  {
                                System.out.println();
                            }
                        }

                    }
                }

          //Login Staff 
        } else if (choice == 2) {
            System.out.print("Username : ");
            String username = scanner.next();
            System.out.print("Password : ");
            String password = scanner.next();
            System.out.println();

            boolean x = staff.login(username, password);
            if (x == true) {

                //Interface Staff
                while (true) {
                    System.out.println("=============================");
                    System.out.println("|   Welcome    " + staff.getUsername()+ "     |");
                    System.out.println("=============================");
                    System.out.println("\n1. AcceptOrdering" + "\n0. Logout");
                    System.out.println("What will you do?");
                    int staff_do = scanner.nextInt();

                    if (staff_do == 0) {
                        break;
                    } else if (staff_do == 1) {

                        //ShowOrder 
                        System.out.println("--------------------------------------------------------------------\n");
                        System.out.println("Table number " + table.getTableName());
                        System.out.println("Ordered by " + customer.getCusName(12));
                        System.out.println(menu.getMenuName());
                        System.out.println(Meats[0].getMenuOptionName());
                        System.out.println("Price : " + "50" + " Bath");
                        System.out.println("--------------------------------------------------------------------\n");

                        System.out.println("\nHave you completed this order (Y/N) ?");
                        String CheckOrderPreparing = scanner.next();

                    if (CheckOrderPreparing.equalsIgnoreCase("y")) {

                        //ShowBill
                        String timeStamp = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss").format(Calendar.getInstance().getTime());
                        bill.setBillDate(timeStamp);
                        System.out.println("\n----------------------------- AomNgoen Restaurant Bill -------------------------");
                        System.out.println(bill.getBillDate() + "                                            (VAT Include)");
                        System.out.println();
                        System.out.println(menu.getMenuName() + "                                                   " + menu.getMenuPrice() + " Bath");
                        System.out.println(Meats[0].getMenuOptionName() + "                                                             " + Meats[0].getMenuOptionPrice() + " Bath " );
                        System.out.println();
                        System.out.println();
                        System.out.println("________________________________________________________________________________\n");
                        System.out.println("Total price " + "                                  " + "                      50 Bath");
                        System.out.println("________________________________________________________________________________\n");
                        System.out.println("--------------------------------------------------------------------------------\n");

                        System.out.println("You want to print bill ? (Y/N) ?");
                        String choose = scanner.next();
                        if (choose.equalsIgnoreCase("y")) {
                            System.out.println("Bill printed");
                            System.out.println();
                        } else if (choose.equalsIgnoreCase("n")) {
                            System.out.println("Bill not print");
                            System.out.println();
                        } else {
                            System.out.println();
                        }

            } else {
                System.out.println("Please try again");
            }
          }
        }
      }

            //Login Manager
     }  else if (choice == 3) {
            System.out.print("Username : ");
            String username = scanner.next();
            System.out.print("Password : ");
            String password = scanner.next();
            System.out.println();

            boolean x = manager.login(username, password);
            if (x == true) {

                //Interface Manager
                while (true) {
                    System.out.println("=============================");
                    System.out.println("|   Welcome    " + manager.getManagerName()+ "        |");
                    System.out.println("=============================");
                    System.out.println("\n1. ConfirmOrdering" + "\n0. Logout");
                    System.out.println("What will you do?");
                    int manager_do = scanner.nextInt();

                    if (manager_do == 0) {
                        break;
                    } else if (manager_do == 1) {

                        System.out.println(
                                    "--------------------------------------------------------------------");
                        System.out.println("Table number " + table.getTableName());
                        System.out.println("Ordered by " + customer.getCusName(12));
                        System.out.println(menu.getMenuName());
                        System.out.println(Meats[0].getMenuOptionName());
                        System.out.println("Price : " + "50" );
                        System.out.println(
                                    "--------------------------------------------------------------------\n");

                        System.out.println("\nHave you success this order (Y/N) ?");
                        String SuccessOrder = scanner.next();

                    if (SuccessOrder.equalsIgnoreCase("y")) {
                        System.out.println("Order successfully ");
                        System.out.println();
                    } else  {
                        System.out.println("Order not success");
                        System.out.println();
                    }
                  }
                }
              }
        } else if (choice == 0) {
                System.out.println("============================");
                System.out.println("| Thanks for your efforts. |");
                System.out.println("============================");
                break;
            }

        }


        }
    }
