package smallBanksim;


import java.util.*;

public class BankDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// added address info
		Address general = new Address();
		general.setStreet("Test ST");
		general.setCity("Randomville");
		general.setPostCode("11111");
		general.setCountry("Nowhere");
//added banks
		Bank bankA = new Bank();
		bankA.setName("ABank");
		bankA.setAddress(general);

		Bank bankC = new Bank();
		bankC.setName("CBank");
		bankC.setAddress(general);

		Bank bankB = new Bank();
		bankB.setName("BBank");
		bankB.setAddress(general);

//added accounts to an array because...I was instructed to do so..?
		ArrayList<BankAccount> accountholder = new ArrayList<BankAccount>();

		/*
		 * This is where the real code begins! Data is provided above, now to make use of
		 * the calculations, methods and the interface!
		 */
		// do-while loop is going to loop until it's been invalidated.
		// For loop is more straight forward, but keeping the track of looping back-up
		// is
		// problematic for me at the moment.
		// I thought of using cases but I really don'y know how to transfer data to
		// classes and actually making a loop out of cases :S

		boolean q = false;
		int n = 0;
		int m = 0;
		int definer = 5;
		Scanner Sc = new Scanner(System.in);
		/*
		 * USED FORMULA: used n for acc# receive account from arraylist and then use
		 * methods on that (think that the account wanted is received by replacing the
		 * "get account from array" command prompt. then spam that to go deeper in to
		 * the parts for example: 1st get acc,second get person, third get name| that's
		 * how we reach a name.
		 * To String method.... yeah...
		 * 
		 */
		int acquiredaccountnumber = 0;
		int acquiredmoney = 0;
		String middle = new String("hey");
		String end = new String("hi");
		String middlehelper = new String("he");

		do {
			System.out.println("Enter a command:");
			String inpoot = Sc.nextLine();

			if (inpoot.charAt(0) == 'q' || inpoot.charAt(0) == 'Q') {
				q = true;
				while (n <= m) {
					System.out
							.println("Account number: " + n + "\n" + "Bank: " + accountholder.get(n).getBank().getName()
									+ "\n" + "Money: " + accountholder.get(n).getBalance() + "$");
					System.out.println("Owner Information:" + "\n" + "Name:" + " "
							+ accountholder.get(n).getOwner().getFirstName() + " " 
							+ accountholder.get(n).getOwner().getLastName() + "\n" + "Address: "
							+ accountholder.get(n).getOwner().getAddress().getStreet() + "\n"
							+ accountholder.get(n).getOwner().getAddress().getCity() + " "
							+ accountholder.get(n).getOwner().getAddress().getPostCode() + "\n"
							+ accountholder.get(n).getOwner().getAddress().getCountry() + "\n");

					n++;
				}
			}
//now things get more complicated. the input example: w 1 2134
			// need to get 1 and then 2134
			// to get the second number, I started make a number from the first space until
			// the last space
			else if (inpoot.charAt(0) == 'w' || inpoot.charAt(0) == 'W') {
				middlehelper = inpoot.substring(2);
				middle = middlehelper.substring(0, middlehelper.indexOf(" "));
				acquiredaccountnumber = Integer.parseInt(middle);
				end = middlehelper.substring(middlehelper.indexOf(" ") + 1);
				acquiredmoney = Integer.parseInt(end);

				accountholder.get(acquiredaccountnumber).withdraw(acquiredmoney);

			}

			else if (inpoot.charAt(0) == 'd' || inpoot.charAt(0) == 'D') {
				middlehelper = inpoot.substring(2);
				middle = middlehelper.substring(0, middlehelper.indexOf(" "));
				acquiredaccountnumber = Integer.parseInt(middle);
				end = middlehelper.substring(middlehelper.indexOf(" ") + 1);
				acquiredmoney = Integer.parseInt(end);

				accountholder.get(acquiredaccountnumber).deposit(acquiredmoney);
			}
			if (inpoot.charAt(0) == 'i' || inpoot.charAt(0) == 'I') {

				for (int x = 0; x < accountholder.size(); x++) {
					accountholder.get(x).interest();
				}

			}
			if (inpoot.charAt(0) == 'c' || inpoot.charAt(0) == 'C') {
				System.out.println("Enter Name:");
				String firstnamme = Sc.nextLine();
				System.out.println("Enter Surname:");
				String lastnamme = Sc.nextLine();
				System.out.println("Select bank:" + "\n" + "[1] ABank" + "\n" + "[2] B Group" + "\n" + "[3] C Corp");
				String banknamer = Sc.nextLine();
				int banknamedefiner = Integer.parseInt(banknamer);

				Person any = new Person();
				any.setFirstName(firstnamme);
				any.setLastName(lastnamme);
				any.setAddress(general);

				if (banknamedefiner == 1) {
					// "ABank";
					BankAccount anyy = new BankAccount();
					anyy.setBank(bankA);
					anyy.setOwner(any);
					anyy.setBalance(0);
					anyy.setAccountNumber(m);
					accountholder.add(anyy);
					m++;
				} else if (banknamedefiner == 2) {
					// "B Group";
					BankAccount anyy = new BankAccount();
					anyy.setBank(bankB);
					anyy.setOwner(any);
					anyy.setBalance(0);
					anyy.setAccountNumber(m);
					accountholder.add(anyy);
				} else {
					// "C Corp";
					BankAccount anyy = new BankAccount();
					anyy.setBank(bankC);
					anyy.setOwner(any);
					anyy.setBalance(0);
					anyy.setAccountNumber(m);
					accountholder.add(anyy);
				}

			}
		} while (q == false);

	}
}
