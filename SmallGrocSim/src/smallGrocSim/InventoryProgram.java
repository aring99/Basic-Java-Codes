package smallGrocSim;

import java.util.*;

public class InventoryProgram {

	public static void main(String[] args) {
		int checker = 1;
		int productnumberer = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a command:");
		// TODO Auto-generated method stub
		ArrayList<Product> Productholder = new ArrayList<Product>();
		ArrayList<StockInterface> Stockholder = new ArrayList<StockInterface>();
		while (checker == 1) {
			String input = sc.nextLine();
			if (input.charAt(0) == 'q') {
				checker = 2;
			} else if (input.equals("lp")) {
				for (int looper = 0; looper < Productholder.size(); looper++) {
					System.out.println(Productholder.get(looper));
				}
			}else if (input.equals("ls")) {
				for (int looper2 = 0; looper2 < Stockholder.size(); looper2++) {
					System.out.println(Stockholder.get(looper2));
				}
			} else if (input.substring(0, input.indexOf(" ")).equals("ns")) {
				String middlehelper2 = input.substring(input.indexOf(" ") + 1);
				String middle2 = middlehelper2.substring(0, middlehelper2.indexOf(" "));
				int stockitemgetter = Integer.parseInt(middle2);
				Product stockitem = Productholder.get(stockitemgetter - 1);
				String othermiddlehelper2 = middlehelper2.substring(middlehelper2.indexOf(" ") + 1);
				String othermiddle2 = othermiddlehelper2.substring(0, othermiddlehelper2.indexOf(" "));
				int stockamount = Integer.parseInt(othermiddle2);
				String eNd2 = othermiddlehelper2.substring(othermiddlehelper2.indexOf(" ") + 1);
				eNd2 = eNd2.trim();
				int stockprice = Integer.parseInt(eNd2);
				if (stockprice < stockitem.getCost()) {
					System.out.println("Warning, sale price is lower than product cost");
				}
				Grocery newstock = new Grocery(stockitem, stockamount, stockprice);
				Stockholder.add(newstock);
				System.out.println("Now selling "+newstock);

			} else if (input.substring(0, input.indexOf(" ")).equals("np")) {
				String middlehelper = input.substring(input.indexOf(" ") + 1);
				String middle = middlehelper.substring(0, middlehelper.indexOf(" "));
				String othermiddlehelper = middlehelper.substring(middlehelper.indexOf(" ") + 1);
				String othermiddle = othermiddlehelper.substring(0, othermiddlehelper.indexOf(" "));
				String eNd = othermiddlehelper.substring(othermiddlehelper.indexOf(" ") + 1);
				eNd = eNd.trim();
				int cosT = Integer.parseInt(eNd);
				Product newproduct = new Product(middle, othermiddle, cosT, productnumberer);
				productnumberer++;
				Productholder.add(newproduct);
				System.out.println("Created "+ newproduct);
			}

		}
		for (int typer = 0; typer < Stockholder.size(); typer++)
			System.out.println(Stockholder.get(typer));
	}

}