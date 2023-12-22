/*Anza Malik	FA21-BCS-037		A2*/
package carsale;
import java.util.Scanner;
public class CarSale {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        //prices index arranged according to the menu
        long []toyota={20000,30000,40000};
        long []tesla={50000,70000,80000};
        long []honda={60000,60000,20000};     
        String []colors={"red","white","black","grey"};
        
//=============================Displaying menu=============================
        System.out.println("\n\t\t\t_CAR COMPANIES AVAILABLE\t_");
        System.out.print("\t\t     ||\tToyota\t||\tTesla\t||\tHonda\t||");
        toyota_menu(toyota,colors);  tesla_menu(tesla,colors);   honda_menu(honda,colors);   line(); System.out.println();
        
//==============================Getting inputs====================================
        String companey; 
        System.out.println("\n\n\t**Please keep all alphabests small**");
        //Asking Companey Name
        while (true) {
            System.out.print("\tPlease enter the Name of the Companey you would like to purchase from: ");
            companey=sc.next();
            if ("honda".equals(companey)||"tesla".equals(companey)||"toyota".equals(companey)) {
                break;
            }
            else {
                System.out.println("Not available...Please refer to the above Menu");
            }
        }
        
//==============================INVOICE====================================
        switch (companey) {
            case "honda" -> honda(honda,colors);
            case "tesla" -> tesla(tesla,colors);
            case "toyota" -> toyota(toyota,colors);
        }
        System.out.println("\n\t**Your car will be available 7 months after the Payment**\n");
    }
//==============================END==============================    
//==============================FUNCTIONS==============================
    public static void line() {
        System.out.print("\n\t\t");
        for (int i=0;i<=90;i++) {
            System.out.print("_");
        }
        System.out.println();
    }
    public static void tesla_menu(long price[], String colors[]) {
        System.out.println();line();
        System.out.println("\n \t\t\t_TESLA CAR AVAILABLE\t_");
        System.out.print("\t\t     ||\tName          \t||\tModles\t||\tprice\t||\tColors\n");
        System.out.print("\t\t     ||\tModel X      \t||\t2018\t||\t"+price[0]+"\t||\t"+colors[1]+","+colors[2]+","+colors[3]+"\n");
        System.out.print("\t\t     ||\tModel Y      \t||\t2018\t||\t"+price[1]+"\t||\t"+colors[1]+","+colors[2]+","+colors[3]+"\n");
        System.out.print("\t\t     ||\tModel S      \t||\t2018\t||\t"+price[2]+"\t||\t"+colors[1]+","+colors[2]+","+colors[3]+"\n");
    }
    public static void toyota_menu(long price[], String colors[]) {
        System.out.println();line();
        System.out.println("\n \t\t\t_TOYOTA CAR AVAILABLE\t_");
        System.out.print("\t\t     ||\tName         \t||\tModles\t||\tprice\t||\tColors\n");
        System.out.print("\t\t     ||\tCamry        \t||\t2022\t||\t"+price[0]+"\t||\t"+colors[0]+","+colors[3]+"\n");
        System.out.print("\t\t     ||\tVitz        \t||\t2022\t||\t"+price[1]+"\t||\t"+colors[0]+","+colors[3]+"\n");
        System.out.print("\t\t     ||\tHightlander \t||\t2022\t||\t"+price[2]+"\t||\t"+colors[0]+","+colors[3]+"\n");
    }
    public static void honda_menu(long price[], String colors[]) {
        System.out.println();line();
        System.out.println("\n \t\t\t_HONDA CAR AVAILABLE\t_");
        System.out.print("\t\t     ||\tName         \t||\tModles\t||\tprice\t||\tColors\n");
        System.out.print("\t\t     ||\tInsight        \t||\t2022\t||\t"+price[0]+"\t||\t"+colors[0]+","+colors[2]+"\n");
        System.out.print("\t\t     ||\tAccord       \t||\t2022\t||\t"+price[1]+"\t||\t"+colors[0]+","+colors[2]+"\n");
        System.out.print("\t\t     ||\tCivic       \t||\t2022\t||\t"+price[2]+"\t||\t"+colors[0]+","+colors[2]+"\n");
    }
    public static void invoice(String color,String companey,String car,int model,long price) {    //INVOICE
        Scanner sc=new Scanner(System.in);        
        System.out.print("Please enter the name of the person registering the car: ");
        String name=sc.nextLine();
        line();
        System.out.println("\t\t|\tOrder No. : "+(int)(Math.random()*100)+"\t|\tName: "+name);
        System.out.println("\t\t||\tColor:"+color);
        System.out.println("\t\t||\tCompaney: "+companey+"\n\t\t||\tCar:"+car+"\n\t\t||\tModel:"+model);
        System.out.print("\t\t||\tPrice: "+price);
        line();
    }
    public static void tesla(long tesla_prices[],String colors[]) {
        Scanner sc=new Scanner(System.in);
        long price = 0;
        String car;
        int model;
        while (true) {
            System.out.print("  Please ente the car name:");
            car=sc.nextLine();
            if ("model x".equals(car)||"model y".equals(car)||"model s".equals(car)) {
                switch (car) {
                    case "model x" -> price=tesla_prices[0];
                    case "model y" -> price=tesla_prices[1];
                    case "model s" -> price=tesla_prices[2];
                }
                break;
            }
            else {
                System.out.print("Not available...Please refer to the above Menu\n");
            }
        }
        while (true) {
            System.out.print("  Please ente the model:");
            model=sc.nextInt();
            if (model==2018) {
                break;
            }
            else {
                System.out.print("Not available...Please refer to the above Menu\n");
            }
        }
        String Color;
        while (true) {
            System.out.print("  Please chose color from the menu:");
            Color=sc.next();
            if(Color.equals(colors[1])||Color.equals(colors[2])||Color.equals(colors[3])) {
                break;
            }
            else {
                System.out.print("Not available...Please refer to the above Menu\n");
            }
        }
        String companey="Tesla";
        invoice(Color,companey,car,model,price);
    }
/*Anza Malik	FA21-BCS-037		A2*/
    public static void toyota(long toyota_prices[],String colors[]) {
        Scanner sc=new Scanner(System.in);
        long price = 0;
        String car;
        int model;        
        
        while (true) {
            System.out.print("  Please ente the car name:");
            car=sc.next();
            if ("camry".equals(car)||"hightlander".equals(car)||"vitz".equals(car)) {
                switch (car) {
                    case "camry" -> price=toyota_prices[0];
                    case "hightlander" -> price=toyota_prices[1];
                    case "vitz" -> price=toyota_prices[2];
                }
                break;
            }
            else {
                System.out.print("Not available...Please refer to the above Menu\n");
            }
        }
        while (true) {
            System.out.print("  Please ente the model:");
            model=sc.nextInt();
            if (model==2022) {
                break;
            }
            else {
                System.out.print("Not available...Please refer to the above Menu\n");
            }
        }
        String Color;
        while (true) {
            System.out.print("  Please chose color from the menu:");
            Color=sc.next();
            if(Color.equals(colors[0])||Color.equals(colors[3])) {
                break;
            }
            else {
                System.out.print("Not available...Please refer to the above Menu\n");
            }
        }
        String companey="Toyota";
        invoice(Color,companey,car,model,price);
    }

    public static void honda(long honda_prices[],String colors[]) {
        Scanner sc=new Scanner(System.in);
        String car;
        int model;
        long price = 0;
        while (true) {
            System.out.print("  Please ente the car name:");
            car=sc.next();
            if ("insight".equals(car)||"accord".equals(car)||"civic".equals(car)) {
                switch (car) {
                    case "insight" -> price=honda_prices[0];
                    case "accord" -> price=honda_prices[1];
                    case "civic" -> price=honda_prices[2];
                }
                break;
            }
            else {
                System.out.print("Not available...Please refer to the above Menu\n");
            }
        }
        while (true) {
            System.out.print("  Please ente the model:");
            model=sc.nextInt();
            if (model==2022) {
                break;
            }
            else {
                System.out.print("Not available...Please refer to the above Menu\n");
            }
        }
        String Color;
        while (true) {
            System.out.print("  Please chose color from the menu:");
            Color=sc.next();
            if(Color.equals(colors[2])||Color.equals(colors[0])) {
                break;
            }
            else {
                System.out.print("Not available...Please refer to the above Menu\n");
            }
        }
        String companey="Honda";
        invoice(Color,companey,car,model,price);
    }    
}