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

import java.io.*;
public class club
{
	// creating objects and calling objects from other classes
	static club myobj1 = new club();
	static restaurant myobj = new restaurant();

	static BufferedReader keyin = new BufferedReader( new InputStreamReader(System.in));

	//declaration and initialization of variables
	static String instr,day;
	static int ch,a,b,c,d;
	static int z,n,no,n1,n2,m,p,q,f,f1;
	static int l,t1,t2,te,tx,hr,h;
	static int bill,cost=0;

	// a function that accepts the number of members who wish to avail the club facilities
	public void members() throws IOException
	{
		z=0;
		while(z==0)
		{
			System.out.println("Enter the number of members who wish to avail the facilities");
			instr=keyin.readLine();
			try
			{
				no=Integer.parseInt(instr);
				z=1;
			}
			catch(NumberFormatException x)
			{
				System.out.println("Invalid Entry : Enter again");
			}
		}
	}

	// a function that calculates the number of hours that a member spends in availing a particular facility
	public void time() throws IOException
	{
		System.out.println(" Please note : The club will be open from 10 am to 9 pm only ");

		z=0;
		while(z==0)
		{
			System.out.println("Enter the time of entry in the following format");
			System.out.println("10 am = 10; 5 pm = 5; 9 pm = 9");
			instr=keyin.readLine();
			try
			{
				h=Integer.parseInt(instr);
				if(h>=1&&h<=12)
				{
					if(h==9)
					System.out.println("Club closes at 9 pm : enter a valid time ");
					else
					{
						te=h;
						z=1;
					}
				}
				else
				System.out.println("Invalid entry");
			}
			catch(NumberFormatException x)
			{
				System.out.println("Invalid Entry");
			}
		}// end of while

		z=0;
		while(z==0)
		{
			System.out.println("Enter the time of exit in the following format");
			System.out.println("10 am = 10; 5 pm = 5; 9 pm = 9");
			instr=keyin.readLine();
			try
			{
				h=Integer.parseInt(instr);
				if(h>=1&&h<=12)
				{
					if(h==10)
					System.out.println("Club Has just opened : You have entered an invalid Option");
					else
					{
						if(h==te)
						{
							System.out.println("Invalid Entry : Entry time cannot be the same as exit time");
						}
						else
						{
							tx=h;
							z=1;
						}
					}
				}
				else
				System.out.println("Invalid entry");
			}
			catch(NumberFormatException x)
			{
				System.out.println("Invalid Entry");
			}
		}// end of while

		if(te<10)
		te=te+12;
		if(tx<12)
		tx=tx+12;

		hr=tx-te;
		System.out.println("Duration of access to the facility = "+hr);
	}

	// a function that displays the main menu of the club
	public void club_menu()throws IOException
	{
		while(true)
		{
			System.out.println("-------------------------------");
			System.out.println(" Welcome to CLUB SOLITAIRE  :)");
			System.out.println("-------------------------------");
			System.out.println();

			System.out.println("Press 1 to view club facilities");
			System.out.println("Press 2 to proceed towards restaurant");
			System.out.println("Press 0 to exit");
			System.out.println();
			System.out.println("----------------------------------------");
			instr=keyin.readLine();

			try
			{
				ch=Integer.parseInt(instr);

				if(ch>=0&&ch<=2)
				{
					switch(ch)
					{
						case 1 : myobj1.facilities();
								 break;

						case 2 : myobj.menu();
								 break;

						case 0 : System.out.println("Hope to See you Again : Have a nice day :)" );
								 System.out.println("---------------------------------------------");
								 System.exit(0);
					}
				}
				else
				System.out.println("Invalid Entry");
			}

			catch(NumberFormatException x)
			{
				System.out.println("Invalid Entry : Enter again");
			}
		}//end of while
	}// end of club_menu

	// a function that displays a menu with the various facilities available at the club
	public void facilities() throws IOException
	{
		while(true)
		{
			System.out.println("------------------------------");
			System.out.println("Welcome to the Facilities Menu");
			System.out.println("------------------------------");

			System.out.println("Enter 1 for Indoor Sports");
			System.out.println("Enter 2 for Outdoor Sports");
			System.out.println("Enter 3 for Swimming facilities");
			System.out.println("Enter 4 for Spa/Gym ");
			System.out.println("Enter 0 to return to main menu ");
			System.out.println();
			System.out.println("------------------------------------");
			instr=keyin.readLine();

			try
			{
				a=Integer.parseInt(instr);

				if(a>=0&&a<=4)
				{
					switch(a)
					{
						case 1 : myobj1.indoor();
								 break;

						case 2 : myobj1.outdoor();
								 break;

						case 3 : myobj1.swimming();
								 break;

						case 4 : myobj1.gym();
								 break;

						case 0 : myobj1.club_menu();
					}
				}

				else
					System.out.println("Invalid Entry");
			}

			catch(NumberFormatException x)
			{
				System.out.println("Invalid Entry : Enter again");
			}

		}//end of while
	}// end of facilities()

	// a function that displays the various indoor sports facilities available to the members
	public void indoor() throws IOException
	{
		while(true)
		{
			System.out.println("-------------------------------------");
			System.out.println("Welcome to the Indoor Facilities Menu");
			System.out.println("-------------------------------------");

			System.out.println("Press 1 for Badminton");
			System.out.println("Press 2 for Pool/Billiards");
			System.out.println("Press 3 for Squash");
			System.out.println("Enter 4 for TableTennis");
			System.out.println("Press 0 to return to previous menu");
			System.out.println();
			System.out.println("-------------------------------------");

			instr=keyin.readLine();
			b=Integer.parseInt(instr);

			if(b==0)
			myobj1.facilities();

			else
			if(b>=1&&b<=4)
			{
				if(b==1)
				{
					System.out.println(" Badminton Menu ");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("Charges will be Rs 100 per member per hour");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println();
					myobj1.members();
					myobj1.time();

					System.out.println(" Do you require any sports equipment ? ");
					System.out.println(" No extra charges will be applied ");
					System.out.println(" Enter yes or no ");
					instr=keyin.readLine();

					if(instr.equalsIgnoreCase("yes"))
					{
						System.out.println(" Do you require badminton Rackets or Shuttles ? ");
						System.out.println(" Enter yes or no ");
						instr=keyin.readLine();

						if(instr.equalsIgnoreCase("yes"))
						{
							System.out.println("Enter the Number of rackets required");
							instr=keyin.readLine();
							n1=Integer.parseInt(instr);

							System.out.println("Enter the Number of shuttles required");
							instr=keyin.readLine();
							n2=Integer.parseInt(instr);

						}

						System.out.println("You will be provided with "+n1+" rackets and "+n2+" Shuttles ");
					}

					bill=0;
					bill=(no*hr*100)+bill;
					System.out.println("Badminton Charges : Rs "+bill);
				}// end of badminton

				if(b==2)
				{
					System.out.println(" Billiards Menu ");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("Charges will be Rs 200 per member per hour");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println();
					myobj1.members();
					myobj1.time();

					bill=0;
					bill=(no*hr*200)+bill;
					System.out.println("Billiards Charges : Rs "+bill);
				}// end of billiards

				if(b==3)
				{
					System.out.println(" Squash Menu ");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("Charges will be Rs 150 per member per hour");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println();
					myobj1.members();
					myobj1.time();

					System.out.println(" Do you require any sports equipment ? ");
					System.out.println(" No extra charges will be applied ");
					System.out.println(" Enter yes or no ");
					instr=keyin.readLine();

					if(instr.equalsIgnoreCase("yes"))
					{
						System.out.println(" Do you require Squash Rackets or balls ? ");
						System.out.println(" Enter yes or no ");
						instr=keyin.readLine();

						if(instr.equalsIgnoreCase("yes"))
						{
							System.out.println("Enter the Number of rackets required");
							instr=keyin.readLine();
							n1=Integer.parseInt(instr);

							System.out.println("Enter the Number of balls required");
							instr=keyin.readLine();
							n2=Integer.parseInt(instr);

						}

						System.out.println("You will be provided with "+n1+" rackets and "+n2+" balls ");
					}

					bill=0;
					bill=(no*hr*150)+bill;
					System.out.println("Squash Charges : Rs "+bill);
				}// end of squash

				if(b==4)
				{
					System.out.println(" TableTennis Menu ");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("Charges will be Rs 100 per member per hour");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println();
					myobj1.members();
					myobj1.time();

					System.out.println(" Do you require any sports equipment ? ");
					System.out.println(" No extra charges will be applied ");
					System.out.println(" Enter yes or no ");
					instr=keyin.readLine();

					if(instr.equalsIgnoreCase("yes"))
					{
						System.out.println(" Do you require TT Rackets or balls ? ");
						System.out.println(" Enter yes or no ");
						instr=keyin.readLine();

						if(instr.equalsIgnoreCase("yes"))
						{
							System.out.println("Enter the Number of rackets required");
							instr=keyin.readLine();
							n1=Integer.parseInt(instr);

							System.out.println("Enter the Number of balls required");
							instr=keyin.readLine();
							n2=Integer.parseInt(instr);

						}

						System.out.println("You will be provided with "+n1+" rackets and "+n2+" balls ");
					}

					bill=0;
					bill=(no*hr*100)+bill;
					System.out.println("TableTennis Charges : Rs "+bill);
				}// end of TableTennis
			}// end of if
			else
			{
				System.out.println("Invalid Entry : Enter again");
			}
		}// end of while
	}// end of indoor()

	// a function that displays the various outdoor sports facilities available to the members
	public void outdoor() throws IOException
	{
		while(true)
		{
			System.out.println("--------------------------------------");
			System.out.println("Welcome to the Outdoor Facilities Menu");
			System.out.println("--------------------------------------");

			System.out.println("Press 1 for Tennis");
			System.out.println("Press 2 for Golf");
			System.out.println("Press 0 to return to previous menu");
			System.out.println();
			System.out.println("-------------------------------------");

			instr=keyin.readLine();
			c=Integer.parseInt(instr);

			if(c==0)
			myobj1.facilities();

			else
			if(c>=1&&c<=2)
			{
				if(c==1)
				{
					System.out.println(" Tennis Menu ");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("Charges will be Rs 250 per member per hour");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println();
					myobj1.members();
					myobj1.time();

					System.out.println(" Do you require any sports equipment ? ");
					System.out.println(" No extra charges will be applied ");
					System.out.println(" Enter yes or no ");
					instr=keyin.readLine();

					if(instr.equalsIgnoreCase("yes"))
					{
						System.out.println(" Do you require Tennis Rackets or Balls ? ");
						System.out.println(" Enter yes or no ");
						instr=keyin.readLine();

						if(instr.equalsIgnoreCase("yes"))
						{
							System.out.println("Enter the Number of rackets required");
							instr=keyin.readLine();
							n1=Integer.parseInt(instr);

							System.out.println("Enter the Number of Balls required");
							instr=keyin.readLine();
							n2=Integer.parseInt(instr);

						}

						System.out.println("You will be provided with "+n1+" rackets and "+n2+" balls ");
					}

					bill=0;
					bill=(no*hr*250)+bill;
					System.out.println("Tennis Charges : Rs "+bill);
				}// end of tennis

				if(c==2)
				{
					System.out.println(" Golf Menu ");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println("Charges will be Rs 400 per member per hour");
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println();
					myobj1.members();
					myobj1.time();

					System.out.println(" Do you require any sports equipment ? ");
					System.out.println(" No extra charges will be applied ");
					System.out.println(" Enter yes or no ");
					instr=keyin.readLine();

					if(instr.equalsIgnoreCase("yes"))
					{
						System.out.println(" Do you require Golf Sticks or balls ? ");
						System.out.println(" Enter yes or no ");
						instr=keyin.readLine();

						if(instr.equalsIgnoreCase("yes"))
						{
							System.out.println("Enter the Number of Golf Sticks required");
							instr=keyin.readLine();
							n1=Integer.parseInt(instr);

							System.out.println("Enter the Number of balls required");
							instr=keyin.readLine();
							n2=Integer.parseInt(instr);

						}

						System.out.println("You will be provided with "+n1+" Golf Sticks and "+n2+" balls ");
					}

					bill=0;
					bill=(no*hr*400)+bill;
					System.out.println("Golf Charges : Rs "+bill);
				}// end of golf

			}// end of if
			else
			{
				System.out.println("Invalid Entry : Enter again");
			}
		}// end of while
	}// end of outdoor()

	// a function that provides the menu for the swimming facilities offered by the club
	public void swimming() throws IOException
	{
		System.out.println("-------------------------------------");
		System.out.println("Welcome to the Swimming Facility Menu");
		System.out.println("-------------------------------------");

		System.out.println("Enter 0 to return to main menu");
		System.out.println("Press 1 to continue ");
		instr=keyin.readLine();
		a=Integer.parseInt(instr);
		if(a==0)
		myobj1.facilities();

		else
		{

		System.out.println("Please note");
		System.out.println("The Swimming pool will be closed on tuesdays for maintenance");
		System.out.println("Please enter today's day");
		day=keyin.readLine();
		day=day.trim();

		if(day.equalsIgnoreCase("Tuesday"))
		{
			System.out.println("We are Very Sorry but the Pool Is closed today");
			System.out.println("We apologize for the Inconvenience : Have a Good Day");
			myobj1.facilities();
		}

		else
		{
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("Charges will be Rs 100 per member per hour");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			myobj1.members();
			myobj1.time();
			bill=0;
			bill=bill+(no*hr*100);
			myobj1.swim_options();
		}

		}

	}

	// a function that provides the menu for Swimming toys and costumes
	public void swim_options()throws IOException
	{
		while(true)
		{
			System.out.println("Enter 1 for pool toys");
			System.out.println("Enter 2 to purchase Swimming costume");
			System.out.println("Enter 0 to return to previous menu");
			System.out.println();
			System.out.println("-------------------------------------------");

			instr=keyin.readLine();
			d=Integer.parseInt(instr);

			if(d==0)
			myobj1.swimming();

			else
			{
			if(d==1)
			{
				while(true)
				{
					System.out.println("Press 1 for beachball/volleyball");
					System.out.println("Press 2 for ships/boats/submarines");
					System.out.println("Press 3 for water guns/squirt guns");
					System.out.println("Enter 0 to return to previous menu");
					instr=keyin.readLine();
					n=Integer.parseInt(instr);

					if(n==0)
					myobj1.swim_options();

					else
					{
						if(n==1)
						{
							System.out.println("Enter the quantity of items");
							instr=keyin.readLine();
							m=Integer.parseInt(instr);

							System.out.println("You have been given "+m+" Balls");
						}
						if(n==2)
						{
							System.out.println("Enter the quantity of items");
							instr=keyin.readLine();
							m=Integer.parseInt(instr);

							System.out.println("You have been given "+m+" Boats");
						}
						if(n==3)
						{
							System.out.println("Enter the quantity of items");
							instr=keyin.readLine();
							m=Integer.parseInt(instr);

							System.out.println("You have been given "+m+" Water Guns");
						}
						else
						System.out.println("Invalid Entry : Enter again");
					}//end of else
				}// end of while
			}// end of first option

				if(d==2)
				{
					while(true)
					{
						System.out.println("Press 1 for Men's Swimming costume");
						System.out.println("Press 2 Women's Swimming Costume");
						System.out.println("Press 3 for children(boy's) Swimming costume");
						System.out.println("Press 4 for children(girl's) Swimming costume");
						System.out.println("Press 5 for Swimming tube/Float Pads");
						System.out.println("Press 0 to return to previous menu ");
						instr=keyin.readLine();
						p=Integer.parseInt(instr);

						if(p==0)
						myobj1.swim_options();

						else
						{

						System.out.println("Enter the quantity of items");
						instr=keyin.readLine();
						q=Integer.parseInt(instr);

						if(p==1)
						{
							System.out.println("Cost = Rs 200");
							System.out.println("Would you like to confirm the purchase : yes or no ");
							instr=keyin.readLine();
							if(instr.equalsIgnoreCase("yes"))
							cost=cost+200*q;
							bill=bill+cost;
							System.out.println("Total Swimming Charges = "+bill);
						}
						if(p==2)
						{
							System.out.println("Cost = Rs 500");
							System.out.println("Would you like to confirm the purchase : yes or no ");
							instr=keyin.readLine();
							if(instr.equalsIgnoreCase("yes"))
							cost=cost+500*q;
							bill=bill+cost;
							System.out.println("Total Swimming Charges = "+bill);
						}
						if(p==3)
						{
							System.out.println("Cost = Rs 100");
							System.out.println("Would you like to confirm the purchase : yes or no ");
							instr=keyin.readLine();
							if(instr.equalsIgnoreCase("yes"))
							cost=cost+100*q;
							bill=bill+cost;
							System.out.println("Total Swimming Charges = "+bill);
						}
						if(p==4)
						{
							System.out.println("Cost = Rs 500");
							System.out.println("Would you like to confirm the purchase : yes or no ");
							instr=keyin.readLine();
							if(instr.equalsIgnoreCase("yes"))
							cost=cost+250*q;
							bill=bill+cost;
							System.out.println("Total Swimming Charges = "+bill);
						}
						if(p==5)
						{
							System.out.println("Cost = Rs 150");
							System.out.println("Would you like to confirm the purchase : yes or no ");
							instr=keyin.readLine();
							if(instr.equalsIgnoreCase("yes"))
							cost=cost+150*q;
							bill=bill+cost;
							System.out.println("Total Swimming Charges = "+bill);
						}
						else
						System.out.println("Invalid Entry : Enter again");

						}// end of else
					}//end of while
				}// end of second option

				else
				System.out.println("Invalid Entry : Enter again");
			}//end of else
		}//end of while
	}

	// a function that provides the menu for the gym and spa faculities offered by the club
	public void gym()throws IOException
	{
		while(true)
		{
			System.out.println("-----------------------------------------");
			System.out.println("Welcome to the Gym and Spa Facilities Menu");
			System.out.println("-----------------------------------------");

			System.out.println(" GYM and SPA Menu ");
			System.out.println();
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println("Charges will be Rs 500 per member per hour");
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			System.out.println();
			System.out.println("Enter 1 for Gym facilities");
			System.out.println("Enter 2 for Spa Faclility");
			System.out.println("Enter 0 to return to previous menu");
			instr=keyin.readLine();
			f=Integer.parseInt(instr);

			if(f==0)
			myobj1.facilities();

			else
			{
				if(f==1)
				{
					bill=0;
					myobj1.members();
					myobj1.time();
					bill=bill+(no*hr*500);
					System.out.println("Total Gym Charges : Rs"+bill);
				}// end of gym facility

				if(f==2)
				{
					System.out.println("Enter 1 for Homeopathy Treatment");
					System.out.println("Enter 2 for Ayurvedic Oil Massage");
					System.out.println("Enter 3 for Accupuncture Therapy ");
					System.out.println("Enter 4 for Steam Bath/ Jacoozi ");
					System.out.println("Enter 5 for Facial, Manicure, Pedicure");
					System.out.println("Enter 6 for Yoga Lessons");
					System.out.println("Enter 0 to return to previous menu");
					instr=keyin.readLine();
					f1=Integer.parseInt(instr);

					if(f1==0)
					myobj1.gym();

					else
					{
						if(f1==1)
						{
							myobj1.members();
							myobj1.time();
							System.out.println("Homeopathy : Charges : Rs 600 per member per hour");
							System.out.println("Do you wish to confirm an appointment : yes or no");
							instr=keyin.readLine();
							if(instr.equals("yes"))
							{
								bill=0;
								bill=bill+(no*hr*600);
								System.out.println("Total Spa charges : Rs"+bill);
							}
						}

						if(f1==2)
						{
							myobj1.members();
							myobj1.time();
							System.out.println("Ayurvedic Massage : Charges : Rs 500 per member per hour");
							System.out.println("Do you wish to confirm an appointment : yes or no");
							instr=keyin.readLine();
							if(instr.equals("yes"))
							{
								bill=0;
								bill=bill+(no*hr*500);
								System.out.println("Total Spa charges : Rs"+bill);
							}
						}

						if(f1==3)
						{
							myobj1.members();
							myobj1.time();
							System.out.println("Accupuncture : Charges : Rs 750 per member per hour");
							System.out.println("Do you wish to confirm an appointment : yes or no");
							instr=keyin.readLine();
							if(instr.equals("yes"))
							{
								bill=0;
								bill=bill+(no*hr*750);
								System.out.println("Total Spa charges : Rs"+bill);
							}
						}

						if(f1==4)
						{
							myobj1.members();
							myobj1.time();
							System.out.println("Jacoozi : Charges : Rs 250 per member per hour");
							System.out.println("Do you wish to confirm an appointment : yes or no");
							instr=keyin.readLine();
							if(instr.equals("yes"))
							{
								bill=0;
								bill=bill+(no*hr*250);
								System.out.println("Total Spa charges : Rs"+bill);
							}
						}

						if(f1==5)
						{
							myobj1.members();
							myobj1.time();
							System.out.println("Facial/Manicure/Pedicure : Charges : Rs 400 per member per hour");
							System.out.println("Do you wish to confirm an appointment : yes or no");
							instr=keyin.readLine();
							if(instr.equals("yes"))
							{
								bill=0;
								bill=bill+(no*hr*400);
								System.out.println("Total Spa charges : Rs"+bill);
							}
						}

						if(f1==6)
						{
							myobj1.members();
							myobj1.time();
							System.out.println("Yoga : Charges : Rs 300 per member per hour");
							System.out.println("Do you wish to confirm an appointment : yes or no");
							instr=keyin.readLine();
							if(instr.equals("yes"))
							{
								bill=0;
								bill=bill+(no*hr*300);
								System.out.println("Total Spa charges : Rs"+bill);
							}
						}

						else
							System.out.println("Invalid Entry : Enter again");

					}// end of else

				}// end of spa treatment
			}// end of main else
		}// end of while
	}// end of gym()

	// main function
	public static void main(String args[]) throws IOException
	{
		myobj1.club_menu();
	}
}

/* LIST OF VARIABLES USED

 	instr :  value of input string
 	day : string that stores the day entered in the swimming function
 	ch,a,b,c,d,z,n,p,f : integer variables that store numbers representing the user's choice
 	no,n1,n2,n,p, : integer variables that store choice values as well
 	m,q : integer variables that store the value of the qunatity of items
 	l,t1,t2,te,tx,hr,h : integer variables associated with the time function
 	te : stores time of entry
 	tx : stores time of exit
 	hr : stores time gap between time of entry and time of exit
*/
