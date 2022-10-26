package shapeDrawer;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

//Draws simple shapes
public class Driver {

	public static void main(String[] args) {

		ArrayList<Shape> shapes = new ArrayList<Shape>();

		DrawingTool window = new DrawingTool(shapes);

		Scanner sc = new Scanner(System.in);
		String input = "null";

		while (!input.equalsIgnoreCase("exit")) {
			System.out.print("Enter the command: ");
			input = sc.nextLine();

			String[] parameters = input.split(" ");
			String command = parameters[0];
			if (command.equals("addR")) {
				String firstpartkiller = input.substring(input.indexOf(" ") + 1);
				String firstnumber = firstpartkiller.substring(0, firstpartkiller.indexOf(" "));
				int realfirstnumber = Integer.parseInt(firstnumber);
				String secondpartkiller = firstpartkiller.substring(firstpartkiller.indexOf(" ") + 1);
				String secondnumber = secondpartkiller.substring(0, secondpartkiller.indexOf(" "));
				int realsecondnumber = Integer.parseInt(firstnumber);
				String thirdpartkiller = secondpartkiller.substring(secondpartkiller.indexOf(" ") + 1);
				String thirdnumber = thirdpartkiller.substring(0, thirdpartkiller.indexOf(" "));
				int realthirdnumber = Integer.parseInt(thirdnumber);
				String fourthpartkiller = thirdpartkiller.substring(thirdpartkiller.indexOf(" ") + 1);
				String fourthnumber = fourthpartkiller;
				int realfourthnumber = Integer.parseInt(fourthnumber);
				Rectangle newR = new Rectangle(realfirstnumber, realsecondnumber, realthirdnumber, realfourthnumber);
				newR.calculatePoints(realfirstnumber, realsecondnumber);
				newR.calculateArea();
				newR.calculatePerimeter();
				shapes.add(newR);
				int shapegetter = shapes.indexOf(newR);

				System.out.println(shapes.get(shapegetter));
				window.repaint();

			} else if (command.equals("addS")) {

				String firstpartkiller = input.substring(input.indexOf(" ") + 1);
				String firstnumber = firstpartkiller.substring(0, firstpartkiller.indexOf(" "));
				int realfirstnumber = Integer.parseInt(firstnumber);
				String secondpartkiller = firstpartkiller.substring(firstpartkiller.indexOf(" ") + 1);
				String secondnumber = secondpartkiller.substring(0, secondpartkiller.indexOf(" "));
				int realsecondnumber = Integer.parseInt(secondnumber);
				String thirdpartkiller = secondpartkiller.substring(secondpartkiller.indexOf(" ") + 1);
				String thirdnumber = thirdpartkiller;
				int realthirdnumber = Integer.parseInt(thirdnumber);
				Square newS = new Square(realfirstnumber, realsecondnumber, realthirdnumber);
				newS.calculateArea();
				newS.calculatePerimeter();
				newS.calculatePoints(realfirstnumber, realsecondnumber);
				shapes.add(newS);
				System.out.println(newS);
				window.repaint();

			} else if (command.equals("addC")) {

				String firstpartkiller = input.substring(input.indexOf(" ") + 1);
				String firstnumber = firstpartkiller.substring(0, firstpartkiller.indexOf(" "));
				int realfirstnumber = Integer.parseInt(firstnumber);
				String secondpartkiller = firstpartkiller.substring(firstpartkiller.indexOf(" ") + 1);
				String secondnumber = secondpartkiller.substring(0, secondpartkiller.indexOf(" "));
				int realsecondnumber = Integer.parseInt(secondnumber);
				String thirdpartkiller = secondpartkiller.substring(secondpartkiller.indexOf(" ") + 1);
				String thirdnumber = thirdpartkiller;
				int realthirdnumber = Integer.parseInt(thirdnumber);
				Circle newC = new Circle(realfirstnumber, realsecondnumber, realthirdnumber);
				newC.calculateArea();
				newC.calculatePerimeter();
				newC.calculatePoints(realfirstnumber, realsecondnumber);
				shapes.add(newC);
				System.out.println(newC);
				window.repaint();

			} else if (command.equals("move")) {

				int shapeNo = Integer.parseInt(parameters[1]);
				int c1 = Integer.parseInt(parameters[2]);
				int c2 = Integer.parseInt(parameters[3]);

				Movable sm = shapes.get(shapeNo - 1);
				sm.move(c1, c2);

				System.out.println(sm);

			}

			window.repaint();

		}
		sc.close();
		System.exit(0);
	}

}