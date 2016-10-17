/* Welcome to project Hotel management

  Code developed by
  Aswhin Geet D Sa
  Harshith Guru Prasad
  Robin Ankit
  Anurag Gupta

  ISC 2012 BATCH OF SJBHS

  The class forms the base of the project connecting various functions.

  Copyright protected :)

 */

// A program that displays a menu Offering a variety of Dishes and calculates the Bill

import java.io.*;
public class restaurant
{
	// creating an object
	static restaurant myobj = new restaurant();

	static BufferedReader keyin = new BufferedReader( new InputStreamReader(System.in));

	//declaration and initialization of variables
	static String instr;
	static int ch,ch_s,ch_mc;
	static int a,b,c,d,e,f,n,e1,e2,e3,f1,f2,g;
	static int bill=0;

	public void restaurant()// default constructor
	{

	}

	// a function that deals with the main menu of the restaurant
	public void menu() throws IOException
	{
		while(true)
		{
			System.out.println("---------------------------------------");
			System.out.println(" WELCOME to SOLITAIRE restaurant :) ");
			System.out.println("---------------------------------------");

			System.out.println(" Enter 1 for starters/appetizers/side dishes ");
			System.out.println(" Enter 2 for the main course ");
			System.out.println(" Enter 3 for drinks/beverages ");
			System.out.println(" Enter 4 for dessert ");
			System.out.println(" Enter 5 for International Cuisines ");
			System.out.println(" Enter 6 to receive Bill ");
			System.out.println(" Enter 0 to exit ");

			instr=keyin.readLine();

			try
			{
				ch=Integer.parseInt(instr);

				if(ch<0||ch>6)
				System.out.println("Invalid Entry");

				else
				{
					switch(ch)
					{

						case 1 : myobj.starters();
								 break;

						case 2 : myobj.mainCourse();
								 break;

						case 3 : myobj.drinks();
								 break;

						case 4 : myobj.desserts();
								 break;

						case 5 : myobj.cuisine();
								 break;

						case 6 : myobj.bill();
								 break;

						case 0 : System.out.println("Hope you enjoyed your meal");
								 System.out.println("GOOD BYE :) ");
								 System.exit(0);
					}
				}
			}

			catch(NumberFormatException x)
			{
				System.out.println("Invalid Entry");
			}
		}
	}//of menu()

	// a function that deals with the menu for the starters
	public void starters() throws IOException
	{
		while(true)
		{
			System.out.println("Enter 1 to view vegetarian starters");
			System.out.println("Enter 2 to view non vegetarian starters");
			System.out.println("Enter 0 to return to main menu");
			instr=keyin.readLine();

			try
			{
				ch_s=Integer.parseInt(instr);
				if(ch_s>2||ch_s<0)
				{
					System.out.println("Invalid Entry");
				}

				else
				{
					switch(ch_s)
					{
						case 1 : myobj.veg_starters();

						case 2 : myobj.nonveg_starters();

						case 0 : myobj.menu();
					}
				}
			}

			catch(NumberFormatException x)
			{
				System.out.println("Invalid Entry");
			}
		}
	}// end of starters()

	// a function that deals with the menu for the veg starters
	public void veg_starters()throws IOException
	{
		while(true)
		{
			System.out.println("Press 1 to order : Mixed vegetable soup  : Rs 50/- ");
			System.out.println("Press 2 to order : Gobi Manchurian 		 : Rs 75/- ");
			System.out.println("Press 3 to order : Baby Corn Fry 		 : Rs 100/- ");
			System.out.println("Press 4 to order : Mushroom Pepper Roast : Rs 50/- ");
			System.out.println("Press 5 to order : Aloo Cutlet 			 : Rs 50/- ");
			System.out.println("Press 6 to order : Salad 				 : Rs 50/- ");
			System.out.println("Press 0 to return to previous menu");
			System.out.println("*****************************************************");

			instr=keyin.readLine();
			a=Integer.parseInt(instr);

			if(a==0)
			myobj.starters();

			else
			if(a>=1&&a<=6)
			{
				System.out.println("Enter the quantity required");
				instr=keyin.readLine();
				n=Integer.parseInt(instr);

				if(a==1)
				bill=bill+n*50;
				if(a==2)
				bill=bill+n*75;
				if(a==3)
				bill=bill+n*100;
				if(a==4)
				bill=bill+n*50;
				if(a==5)
				bill=bill+n*50;
				if(a==6)
				bill=bill+n*50;
			}
			else
			{
				System.out.println("Invalid Entry : Enter again");
			}
		}
	}// end of veg starters()

	// a function that deals with the menu for the non veg starters
	public void nonveg_starters() throws IOException
	{
		while(true)
		{
			System.out.println("Press 1 to order : Chicken Kabab 		 : Rs 150/- ");
			System.out.println("Press 2 to order : Chicken pepper Fry 	 : Rs 100/- ");
			System.out.println("Press 3 to order : Pompret Fish Fry 	 : Rs 250/- ");
			System.out.println("Press 4 to order : Tandoor Chicken Tikka : Rs 150/- ");
			System.out.println("Press 5 to order : Mutton Fry 			 : Rs 200/- ");
			System.out.println("Press 6 to order : Prawn Fry 			 : Rs 250/- ");
			System.out.println("Press 0 to view previous menu");
			System.out.println("******************************************************");

			instr=keyin.readLine();
			b=Integer.parseInt(instr);

			if(b==0)
			myobj.starters();
			if(b>=1&&b<=6)
			{
				System.out.println("Enter the quantity required");
				instr=keyin.readLine();
				n=Integer.parseInt(instr);

				if(b==1)
				bill=bill+n*150;
				if(b==2)
				bill=bill+n*100;
				if(b==3)
				bill=bill+n*250;
				if(b==4)
				bill=bill+n*150;
				if(b==5)
				bill=bill+n*200;
				if(b==6)
				bill=bill+n*250;
			}
			else
			{
				System.out.println("Invalid Entry");
			}
		}

	}// end of nonveg_starters()

	// a function that deals with the menu for the main course
	public void mainCourse() throws IOException
	{
		while(true)
		{
			System.out.println("Enter 1 to view vegetarian main course");
			System.out.println("Enter 2 to view non vegetarian main course");
			System.out.println("Enter 0 to view main menu");
			instr=keyin.readLine();

			try
			{
				ch_mc=Integer.parseInt(instr);
				if(ch_mc>2||ch_mc<0)
				{
					System.out.println("Invalid Entry");
				}

				else
				{
					switch(ch_mc)
					{
						case 1 : myobj.veg_mainCourse();

						case 2 : myobj.nonveg_mainCourse();

						case 0 : myobj.menu();
					}
				}
			}

			catch(NumberFormatException x)
			{
				System.out.println("Invalid Entry");
			}
		}
	}// end of mainCourse()

	// a function that deals with the menu for the vegetarian main courses
	public void veg_mainCourse() throws IOException
	{
		while(true)
		{
			System.out.println("Press 1 to order  : Vegetable Biriyani 			 : Rs 100/- ");
			System.out.println("Press 2 to order  : Puneer Butter Masala 		 : Rs 150/- ");
			System.out.println("Press 3 to order  : Dum Aloo Biriyani/Fried Rice : Rs 150/- ");
			System.out.println("Press 4 to order  : Masala Dosa 				 : Rs 50/- ");
			System.out.println("Press 5 to order  : Idli / Vadas  				 : Rs 50/- ");
			System.out.println("Press 6 to order  : Bisibele Bath 				 : Rs 75/- ");
			System.out.println("Press 7 to order  : Lemon Rice 					 : Rs 75/- ");
			System.out.println("Press 8 to order  : Upma 						 : Rs 75/- ");
			System.out.println("Press 9 to order  : Plain rice with dal and curd : Rs 50/- ");
			System.out.println("Press 10 to order : Chapatti/Roti with Sabzi 	 : Rs 50/- ");
			System.out.println("Press 0 to view previous menu");
			System.out.println("***************************************************************");

			instr=keyin.readLine();
			c=Integer.parseInt(instr);

			if(c==0)
			myobj.mainCourse();

			else
			if(c>=1&&c<=10)
			{
				System.out.println("Enter the quantity required");
				instr=keyin.readLine();
				n=Integer.parseInt(instr);

				if(c==1)
				bill=bill+n*100;
				if(c==2)
				bill=bill+n*150;
				if(c==3)
				bill=bill+n*150;
				if(c==4)
				bill=bill+n*50;
				if(c==5)
				bill=bill+n*50;
				if(c==6)
				bill=bill+n*75;
				if(c==7)
				bill=bill+n*75;
				if(c==8)
				bill=bill+n*75;
				if(c==9)
				bill=bill+n*50;
				if(c==10)
				bill=bill+n*50;
			}
			else
			{
				System.out.println("Invalid Entry : Enter again");
			}
		}
	}// end of veg_mainCourse()

	// a function that deals with the menu for the non vegetarian main courses
	public void nonveg_mainCourse() throws IOException
	{
		while(true)
		{
			System.out.println("Press 1 to order  : Chicken Biriyani 		: Rs 150/- ");
			System.out.println("Press 2 to order  : Mutton Biriyani  		: Rs 200/- ");
			System.out.println("Press 3 to order  : Butter Chicken Masala   : Rs 150/- ");
			System.out.println("Press 4 to order  : Chicken 65 				: Rs 150/- ");
			System.out.println("Press 5 to order  : Mutton Gravy / Rice 	: Rs 200/- ");
			System.out.println("Press 6 to order  : Chilly Chicken 			: Rs 100/- ");
			System.out.println("Press 7 to order  : Prawn/Fish Curry 		: Rs 275/- ");
			System.out.println("Press 8 to order  : Chicken Fried Rice 		: Rs 175/- ");
			System.out.println("Press 9 to order  : Cheese Omelette 		: Rs 100/- ");
			System.out.println("Press 10 to order : Hyderabi Biriyani 		: Rs 200/- ");
			System.out.println("Press 0 to view previous menu");
			System.out.println("********************************************************");

			instr=keyin.readLine();
			d=Integer.parseInt(instr);

			if(d==0)
			myobj.mainCourse();

			else
			if(d>=1&&d<=10)
			{
				System.out.println("Enter the quantity required");
				instr=keyin.readLine();
				n=Integer.parseInt(instr);

				if(d==1)
				bill=bill+n*150;
				if(d==2)
				bill=bill+n*200;
				if(d==3)
				bill=bill+n*150;
				if(d==4)
				bill=bill+n*150;
				if(d==5)
				bill=bill+n*200;
				if(d==6)
				bill=bill+n*100;
				if(d==7)
				bill=bill+n*275;
				if(d==8)
				bill=bill+n*175;
				if(d==9)
				bill=bill+n*100;
				if(d==10)
				bill=bill+n*200;
			}
			else
			{
				System.out.println("Invalid Entry : Enter again");
			}
		}
	}// end of nonveg_mainCourse

	// a function that deals with the menu for the beverages and drinks
	public void drinks() throws IOException
	{

		while(true)
		{
			System.out.println(" Press 1 to order  : Fruit Juices ");
			System.out.println(" Press 2 to order  : Soft Drinks  ");
			System.out.println(" Press 3 to order  : Hard Liquor	 ");
			System.out.println("Press 0 to view main menu");
			System.out.println("*****************************************************");

			instr=keyin.readLine();
			e=Integer.parseInt(instr);

			if(e==0)
			myobj.menu();

			else
			if(e>=1&&e<=3)
			{
				switch(e)
				{
					case 1 : myobj.fruitJuice();
							 break;

					case 2 : myobj.soft_drinks();
							 break;

					case 3 : myobj.bar();
							 break;
				}
			}
			else
			System.out.println("Invalid Entry");
		}
	} // end of drinks()

	// a function that deals with the menu for the dessets
	public void desserts() throws IOException
	{
		while(true)
		{
			System.out.println("Press 1 to order  : IceCream 		: Rs 100/- ");
			System.out.println("Press 2 to order  : Cakes 			: Rs 150/- ");
			System.out.println("Press 3 to order  : Pastries 		: Rs 200/- ");
			System.out.println("Press 4 to order  : Fruit Salad 	: Rs 50/- ");
			System.out.println("Press 5 to order  : Apple Pie 		: Rs 100/- ");
			System.out.println("Press 6 to order  : Creme Burle 	: Rs 200/- ");
			System.out.println("Press 0 to view main menu");
			System.out.println("*****************************************************");

			instr=keyin.readLine();
			f=Integer.parseInt(instr);

			if(f==0)
			myobj.menu();

			else
			{
				switch(f)
				{
					case 1 : myobj.IceCream();
							 break;

					case 2 : myobj.cakes();
							 break;

					case 3 : bill=bill+n*200;break;

					case 4 : bill=bill+n*50;break;

					case 5 : bill=bill+n*100;break;

					case 6 : bill= bill+n*200;break;

					default : System.out.println("Invalid Entry");
				}
			}
		}
	}// end of desserts()

	// a function that deals with the calculation of the bill
	public void bill() throws IOException
	{
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("Bill : Rs " +bill);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println();
		System.out.println("Hope you enjoyed your meal");
		System.out.println("GOOD BYE :) ");
		System.exit(0);

	}// end of bill()

	// main function
	public static void main(String args[]) throws IOException
	{
		myobj.menu();
	}//end of main function()

	// a function that deals with the the menu for the soft drinks
	public void soft_drinks() throws IOException
	{
		while(true)
		{
			System.out.println("Press 1 to order  : Pepsi			: Rs 25/- ");
			System.out.println("Press 2 to order  : Coca Cola 		: Rs 25/- ");
			System.out.println("Press 3 to order  : Mirinda 		: Rs 25/- ");
			System.out.println("Press 4 to order  : Sprite			: Rs 25/- ");
			System.out.println("Press 5 to order  : Fanta			: Rs 25/- ");
			System.out.println("Press 6 to order  : Mountain Dew 	: Rs 25/- ");
			System.out.println("Press 0 to view the previous menu");
			System.out.println("*****************************************************");

			instr=keyin.readLine();
			e1=Integer.parseInt(instr);

			if(e1==0)
			myobj.drinks();
			else

			if(e1>=1&&e1<=6)
			{
				System.out.println("Enter the quantity");
				instr=keyin.readLine();
				n=Integer.parseInt(instr);

				if(e1==1||e1==2||e1==3||e1==4||e1==5||e1==6)
				bill=bill+n*25;
			}
			else
			System.out.println("Invalid Entry");
		}
	}// end of soft_drinks()

	// a function that deals with the the menu for the liquor
	public void bar() throws IOException
	{
		while(true)
		{
			System.out.println("Press 1 to order  : Wine			: Rs 200/- ");
			System.out.println("Press 2 to order  : Beer			: Rs 100/- ");
			System.out.println("Press 3 to order  : Whisky			: Rs 150/- ");
			System.out.println("Press 4 to order  : White Rum		: Rs 250/- ");
			System.out.println("Press 5 to order  : Scotch			: Rs 200/- ");
			System.out.println("Press 0 to view the previous menu");
			System.out.println("*****************************************************");

			instr=keyin.readLine();
			e2=Integer.parseInt(instr);

			if(e2==0)
			myobj.drinks();
			else

			if(e2>=1&&e2<=5)
			{
				System.out.println("Enter the quantity");
				instr=keyin.readLine();
				n=Integer.parseInt(instr);

				if(e==1)
				bill=bill+n*200;
				if(e==2)
				bill=bill+n*100;
				if(e==3)
				bill=bill+n*150;
				if(e==4)
				bill=bill+n*250;
				if(e==5)
				bill=bill+n*200;
			}
			else
			System.out.println("Invalid Entry");
		}
	}//end of bar()

	// a function that deals with the the menu for the fruit juices
	public void fruitJuice() throws IOException
	{
		while(true)
		{
			System.out.println("Press 1 to order  : Apple Juice			: Rs 50- ");
			System.out.println("Press 2 to order  : Mango Juice			: Rs 50 ");
			System.out.println("Press 3 to order  : Orange Juice		: Rs 50/- ");
			System.out.println("Press 4 to order  : Watermelon Juice	: Rs 50/- ");
			System.out.println("Press 5 to order  : Fruit Smoothie		: Rs 100/-");
			System.out.println("Press 6 to order  : Milkshake			: Rs 100/-");
			System.out.println("Press 0 to view the previous menu");
			System.out.println("*****************************************************");

			instr=keyin.readLine();
			e3=Integer.parseInt(instr);

			if(e3==0)
			myobj.drinks();
			else

			if(e3>=1&&e3<=6)
			{
				System.out.println("Enter the quantity");
				instr=keyin.readLine();
				n=Integer.parseInt(instr);

				if(e==1)
				bill=bill+n*50;
				if(e==2)
				bill=bill+n*50;
				if(e==3)
				bill=bill+n*50;
				if(e==4)
				bill=bill+n*50;
				if(e==5||e==6)
				bill=bill+n*100;
			}
			else
			System.out.println("Invalid Entry");
		}
	}// end of fruitJuice()

	// a function that deals with the the menu for the ice creams
	public void IceCream() throws IOException
	{
		while(true)
		{
			System.out.println("Press 1 to order  : BlackCurrent IceCream	: Rs 100-");
			System.out.println("Press 2 to order  : ButterScotch IceCream	: Rs 100 ");
			System.out.println("Press 3 to order  : Chocolate IceCream		: Rs 100/-");
			System.out.println("Press 4 to order  : Pista IceCream			: Rs 75/-");
			System.out.println("Press 5 to order  : Strawberry IceCream		: Rs 50/-");
			System.out.println("Press 6 to order  : Mango IceCream			: Rs 50/-");
			System.out.println("Press 7 to order  : Vanilla IceCream		: Rs 50/-");
			System.out.println("Press 8 to order  : Strawberry IceCream		: Rs 50/-");
			System.out.println("Press 9 to order  : Hot Chocolate Fudge		: Rs 150/-");
			System.out.println("Press 0 to view the previous menu");
			System.out.println("********************************************************");

			instr=keyin.readLine();
			f1=Integer.parseInt(instr);

			if(f1==0)
			myobj.desserts();

			else
			if(f1>=1&&f1<=9)
			{
				System.out.println("Enter the quantity");
				instr=keyin.readLine();
				n=Integer.parseInt(instr);

				if(f1==1||f1==2||f1==3)
				bill=bill+n*100;
				if(f1==4)
				bill=bill+n*75;
				if(f1==5||f1==6||f1==7||f1==8)
				bill=bill+n*50;
				if(f1==9)
				bill=bill+n*150;
			}
			else
			System.out.println("Invalid Entry");
		}
	}// end of IceCream()

	// a function that deals with the the menu for the cakes
	public void cakes()throws IOException
	{
		while(true)
		{
			System.out.println("Press 1 to order  : Chocolate Cake			: Rs 100-");
			System.out.println("Press 2 to order  : ChocoLava cake			: Rs 150 ");
			System.out.println("Press 3 to order  : Vanilla Cake			: Rs 50/-");
			System.out.println("Press 4 to order  : Black Forest Cake		: Rs 200/-");
			System.out.println("Press 0 to view the previous menu");
			System.out.println("*****************************************************");

			instr=keyin.readLine();
			f2=Integer.parseInt(instr);

			if(f2==0)
			myobj.desserts();

			else
			if(f2>=1&&f2<=4)
			{
				System.out.println("Enter the quantity");
				instr=keyin.readLine();
				n=Integer.parseInt(instr);

				if(f1==1)
				bill=bill+n*100;
				if(f1==2)
				bill=bill+n*150;
				if(f1==3)
				bill=bill+n*50;
				if(f1==4)
				bill=bill+n*200;
			}
			else
			System.out.println("Invalid Entry");
		}
	} // end of cakes()

	// a function that deals with the the menu for the international cuisines
	public void cuisine() throws IOException
	{
		while(true)
		{
			System.out.println("Press 1 to order  : Cheese Pizza			: Rs 200-");
			System.out.println("Press 2 to order  : Veg Extravaganza Pizza	: Rs 300 ");
			System.out.println("Press 3 to order  : Barbeque Chicken Pizza	: Rs 400/-");
			System.out.println("Press 4 to order  : Tomato Pasta			: Rs 200/-");
			System.out.println("Press 5 to order  : Chinese Noodles			: Rs 200/-");
			System.out.println("Press 6 to order  : Spanish Omelette		: Rs 250/-");
			System.out.println("Press 7 to order  : Mexican Chillies		: Rs 250/-");
			System.out.println("Press 8 to order  : Cheese Burger			: Rs 150/-");
			System.out.println("Press 9 to order  : Subway Sandwiches		: Rs 150/-");
			System.out.println("Press 0 to view the previous menu");
			System.out.println("********************************************************");

			instr=keyin.readLine();
			g=Integer.parseInt(instr);

			if(g==0)
			myobj.menu();

			else
			if(g>=1&&g<=9)
			{
				System.out.println("Enter the quantity");
				instr=keyin.readLine();
				n=Integer.parseInt(instr);

				if(g==1)
				bill=bill+n*200;
				if(g==2)
				bill=bill+n*300;
				if(g==3)
				bill=bill+n*400;
				if(g==4||g==5)
				bill=bill+n*200;
				if(g==6||g==7)
				bill=bill+n*250;
				if(g==8||g==9)
				bill=bill+n*150;
			}
			else
			System.out.println("Invalid Entry");
		}
	}// end of cuisine()
}

/* LIST OF VARIABLES USED

 instr :  value of input string
 ch,ch_s,ch_mc : integer variables that store the choice
 a,b,c,d,e,f,n,e1,e2,e3,f1,f2,g : integer varaibles that store values of choice and quantity of items
 bill : stores value of bill amount

*/