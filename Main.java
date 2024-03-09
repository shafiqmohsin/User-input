import java.util.Scanner;
class Main {
  
  public static void main(String[] args) {
  int weight; 
  int miles;
  double price = 0.0;
  double totalCost;
  int response;
  do{
  Scanner input = new Scanner(System.in);
  System.out.println("Enter the weight of your package in KG:");
  weight = input.nextInt();
  while(weight <= 0 || weight > 20){
    System.out.println("Invalid weight entered");
    System.out.println("Enter the weight of your package in KG:");
    weight = input.nextInt();
    }
  System.out.println("Enter the number of miles:");
  miles = input.nextInt();
  while(miles < 10 || miles > 3000){
    System.out.println("Please enter a value more than 10 or less than 3000 miles:");
  System.out.println("Enter the number of miles:");
  miles = input.nextInt();
    }
    

    
    if(weight<= 2){
    price = 1.10;}
    else if (weight>2 && weight <= 6){
      price = 2.20;}
    else if(weight > 6 && weight <=10){
      price = 3.70;}
    else if (weight > 10 && weight <= 20 ){
      price = 4.80;}
    else
    {}

    totalCost = (miles / 500.0) * price;
            
    System.out.printf("The total cost to ship this package is: $%.2f\n", totalCost);
    System.out.println("\nEnter 1 if you want to repeat the program:");
    System.out.println("Enter any other number for no:");
    response = input.nextInt();
        } while (response == 1);
  
  
    }
  }
