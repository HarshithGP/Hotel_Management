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
import java.util.*;
import java.text.SimpleDateFormat;
import java.lang.*;
import java.util.Calendar;

class HotelManagement
{
	static BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
	static HotelManagement myobj=new HotelManagement();
	static restaurant myobj2 = new restaurant();

	static  int check=0,ck6,ck7,ck5,TB,fcq,EIDQ,f,chk10,tempOpt;
	static int ctr,month,opt,ck4,temp,chk2,i=0,ch=0,age,ck2,noc;
	static int fc,fb,fq,sc,cc,ic,oc,swc,tor,type,ck=0,roomNo;
	static int a=101,b=101,c=0,Dur,CORoomNo,minute,tempS,chk=0;
	static int chk1,tsb,year,hour,day,lnNo,tempBill,year2,hour2;
	static int day2,minute2,month2,noOfHours,tempMonth,Tfb;
	static String name,Snoc,AccPos2,Sf,DJI,DOQ,SS20,SS21,Sopt;
	static String tempS2,cks,StempOpt,ch2,Sday,Smonth,Shour;
	static String Sminute,Sfc,Sfq,SmobNo,am_pm,SresNo,adress;
	static String cf,food,spa,co,R,tempCheck;
	static String tempCheck1,D,DCI,DCO,T,TCI,TCO,subString;
	static String CKINDATE,subString2,CKINTIME,subString3;
	static String NOC2,subString4,subString5,subString6;
	static String subString7,subString8,subString9,EmpName;
	static long days,Bill;

	public HotelManagement()//default constructor
	{

	}//end of constructor

		// a function that ensures that only an authorised user can operate the system


	public void name()throws IOException//To accept name of Customer
	{
		System.out.println("Please Enter name");
		name=obj.readLine();

	}//end of "To accept name of Customer"

	public void ContactNumbers()throws IOException//To take in mobile and Recidence number
	{

		myobj.MobileNumber();//to call function Mobile number

		myobj.ResidenceNumber();//call function residence number

		}//end of "To take in mobile and Recidence number"

	public void MobileNumber()throws IOException////To accept in mobile number
	{
		System.out.println("Please Enter Mobile Number With Country code");
		SmobNo=" ";
		while(true)
		{
			SmobNo=obj.readLine();//accepting mobile number as strring from user
			try
			{
				long mobNo=Long.parseLong(SmobNo);//converting numeric to long type
				break;
			}
			catch(NumberFormatException x)//if number entered is not numeric then catch()is executed.
			{
				System.out.println("Invalid entry Enter again");
			}

		}
	}//end of "To accept in mobile number"

	public void ResidenceNumber()throws IOException////To accept residence number
	{
		System.out.println("Please Enter Residence Number With Respective regional code");
		SresNo=" ";

		while(true)
		{
			SresNo=obj.readLine();//accepting residence number as strring from user
			try
			{
				long resNo=Long.parseLong(SresNo);
				break;
			}
			catch(NumberFormatException x)//if number entered is not numeric then catch()is executed.
			{
				System.out.println("Invalid entry Enter again");
			}

		}

	}//end of "To accept residence number"

	public void Age()throws IOException//to accept age
	{
		System.out.println("Please Enter age");

		while(true)
		{
			try
			{
				age=Integer.parseInt(obj.readLine());//accepting
				while(age>=100||age<=0)
				{
					System.out.println("Please Enter age again");
					age=Integer.parseInt(obj.readLine());
				}
				break;
			}//try
			catch(NumberFormatException x)//if entered age is not numeric
			{
				System.out.println("Please Enter age again");
			}//catch
		}
	}//end of "to accept age"

	public void Adress()throws IOException// to accept Adress
	{
		System.out.println("Please enter Adress including PIN code");

		adress=obj.readLine();//accepting adress as string.

	}//end of "accepting adress"

	public void Acceptance()throws IOException//Responds to option CHECKIN and administration
	{
		/*This function is responsible for accepting basic details
		 *of person such as name,adress,contact details
		 *this can be used both for accepting a customer or employee */

		myobj.name();

		System.out.println("Contact Details Is For Customer Safety");
		myobj.ContactNumbers();

		myobj.Age();
		myobj.Adress();
	}

	public void NumberOfCustomers()throws IOException//to accept no of customers
	{
		System.out.println("Please Enter Number Of Customers");

		while(true)
		{
			Snoc=obj.readLine();//accept number of customer as string
			try
			{
				noc=Integer.parseInt(Snoc);
				break;
			}
			catch(NumberFormatException x)//if entered number of customer is not numeric
			{
				System.out.println("Invalid entry Enter Again");
			}
		}
	}//end of "to check for no of customers"

	public void Duration()throws IOException// to accept duration of any facility that customer want to take
	{
		System.out.println("Please Enter the hours of Usage of The facility");

		while(true)
		{
			try
			{
				Dur=Integer.parseInt(obj.readLine());//accepting duration
				break;

			}
			catch(NumberFormatException x)//excecuted if the entered value is not numberic
			{
				System.out.println("please re-enter a valid number");
			}

		}
	}

	public void facilities()throws IOException//to show all the facilities
	{
		/*To show the facilities*/
		Bill=0;
		chk1=0;
        TB=0;

		while(chk1==0)
		{
			System.out.println("Enter 0 to EXIT");
			System.out.println("Enter 1 for Food facility");
			System.out.println("Enter 2 for Club facility");

			while(true)
			{
				Sf=obj.readLine();//acceptin option as string

				try
				{
					f=Integer.parseInt(Sf);//converting string to int and verifying that it is numeric
					break;
				}
				catch(NumberFormatException e)//excecuted if entered value is not numberic
				{
					System.out.println("Re-Enter valid option");
				}
			}

			if(f>2)
			{
				System.out.println("Re-Enter a Valid Option");
			}

			if(f<=2)
			{
				switch(f)
				{
					case 0: System.out.println("~~~~~~You are always Welcome~~~~~~~~");
							chk1=1;
							break;
					case 1: myobj.RestaurantChoice();
							break;

					case 2: myobj.Club();
							break;
				}
			}

		}//while

		System.out.println("Total cost of All facility(Other than Solitaire Restaurant) is: Rs"+TB);

	}//end of "to accept all the facilities required by customer"

	public void Club()throws IOException//to chek if club facilities are requered by customer
	{
		System.out.println("Note That the time interval that you want to use the facility should never be in decimals");
		chk10=0;

		while(chk10==0)
		{
			System.out.println("Enter 0 to EXIT");
			System.out.println("Enter 1 for Indoor-Games facility");
			System.out.println("Enter 2 for Outdoor-Games facility");
			System.out.println("Enter 3 for Spa/gym facility");
			System.out.println("Enter 4 for Swimming facility");

			while(true)
			{
				Sf=obj.readLine();

				try
				{
					f=Integer.parseInt(Sf);
					break;
				}
				catch(NumberFormatException e)//excecuted if entered value is not numberic
				{
					System.out.println("Re-Enter a valid numeric value");
				}
			}

			if(f>4)
			{
				System.out.println("Re-Enter a Valid Option");
			}

			if(f<=4)
			{
				switch(f)
				{
					case 0: System.out.println("|You are always Welcome|");
							chk1=1;
							break;
					case 1: myobj.IndoorGames();
							break;

					case 2: myobj.OutdoorGames();
							break;

					case 3: myobj.SpaOrGym();
							break;

					case 4: myobj.Swimming();
							break;
				}
			}

		}//while


	}//end of "to chek if club facilities are requered by customer"

	public void Gym()throws IOException
	{
		tsb=0;
		System.out.println("GYM");
		System.out.println("Cost Rs 100 per hour");
		System.out.println("Please Enter Number of People Using this facility(Enter 0 if do not want to use)");

		while(true)
		{
			spa=obj.readLine();

			try
			{
				noc=(Integer.parseInt(spa));
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Re-Enter a option");
			}
		}

		System.out.println("Please Enter Duration of use.");
		myobj.Duration();

		tsb=noc*Dur*100;
		System.out.println("Cost of Gym facility is Rs: "+tsb);
		TB=tsb+TB;

	}

	public void SpaOrGym()throws IOException
	{
		chk10=0;

		while(chk10==0)
		{
			System.out.println("Enter 0 to EXIT");
			System.out.println("Enter 1 for Spa menu");
			System.out.println("Enter 2 for Gym facility");

			while(true)
			{
				Sf=obj.readLine();

				try
				{
					f=Integer.parseInt(Sf);
					break;
				}
				catch(NumberFormatException e)
				{
					System.out.println("Re-Enter");
				}
			}

			if(f>2)
			{
				System.out.println("Re-Enter a Valid Option");
			}

			if(f<=2)
			{
				switch(f)
				{
					case 0: System.out.println("~~~You are always Welcome~~~");
							chk1=1;
							break;
					case 1: myobj.Spa();
							break;

					case 2: myobj.Gym();
							break;

				}
			}

		}//while
	}

	public void FoodMenu()throws IOException//menu of food
	{
		myobj.DateAndTime();

		//System.out.println(TCI);
		Tfb=0;
		fcq=0;

	/*This restaurant operates based on time of entry of
	 *customer hence depending upon time the options are displayed*/
		System.out.println("The following is available menu at this Time");
		if(hour>19)
		{

			chk10=0;
			while(chk10==0)
			{
				System.out.println("Enter 0 to exit Food Menu");
				System.out.println("Enter 1 for Dinner Menu");
				System.out.println("Enter 2 for Snack Menu");
				System.out.println("Enter 3 for Juice Menu");


				Sf=obj.readLine();

				while(true)
				{
					try
					{
						f=Integer.parseInt(Sf);
						break;
					}
					catch(NumberFormatException x)
					{
						System.out.println("Re-Enter a Valid option");
					}
				}

				switch(f)
				{
					case 0: chk10=1;
							break;


					case 1:myobj.DinnerMenu();

							break;

					case 2:myobj.SnackMenu();
							break;

					case 3:myobj.JuiceMenu();
							break;

					default:System.out.println("Re-Enter your Option");
							chk10=0;
				}
			}

		}

		if(hour<19&&hour>16)
		{
			chk10=0;
			while(chk10==0)
			{
				System.out.println("Enter 0 to exit Food Menu");
				System.out.println("Enter 1 for snack menu");
				System.out.println("Enter 2 for Juice Menu");


				Sf=obj.readLine();

				while(true)
				{
					try
					{
						f=Integer.parseInt(Sf);
						break;
					}
					catch(NumberFormatException x)
					{
						System.out.println("Re-Enter a Valid option");
					}
				}

				switch(f)
				{

					case 0: chk10=1;
							break;

					case 1:myobj.SnackMenu();
							break;

					case 2:myobj.JuiceMenu();
							break;

					default:System.out.println("Re-Enter your Option");
							chk10=0;
				}
			}
		}

		if(hour<=15&&hour>10)
		{
			chk10=0;
			while(chk10==0)
			{
				System.out.println("Enter 0 to exit Food Menu");
				System.out.println("Enter 1 for Lunch Menu");
				System.out.println("Enter 2 for Snack Menu");
				System.out.println("Enter 3 for Juice Menu");


				Sf=obj.readLine();

				while(true)
				{
					try
					{
						f=Integer.parseInt(Sf);
						break;
					}
					catch(NumberFormatException x)
					{
						System.out.println("Re-Enter a Valid option");
					}
				}

				switch(f)
				{
					case 0: chk10=1;
							break;


					case 1:myobj.LunchMenu();

							break;

					case 2:myobj.SnackMenu();
							break;

					case 3:myobj.JuiceMenu();
							break;

					default:System.out.println("Re-Enter your Option");
							chk10=0;
				}
			}
		}

		if(hour<=10&&hour>6)
		{
			chk10=0;
			while(chk10==0)
			{
				System.out.println("Enter 0 to exit Food Menu");
				System.out.println("Only Breakfast menu is available");
				System.out.println("Enter 1 for Bearkfast Menu");

				Sf=obj.readLine();

				while(true)
				{
					try
					{
						f=Integer.parseInt(Sf);
						break;
					}
					catch(NumberFormatException x)
					{
						System.out.println("Re-Enter a Valid option");
					}
				}

				switch(f)
				{

					case 0: chk10=1;
						break;

					case 1:myobj.BreakFastMenu();
							break;

					default:System.out.println("Re-Enter your Option");
							chk10=0;
				}
			}

		}

		/*The below code is excecutef if the customer makes entry to the hotel during close times*/
		else
		{
			System.out.println("Sorry you have been here on wrong Timings");
		}

	}	//end of menu of food

	public void BreakFastMenu()throws IOException
	{
		fcq=0;
		while(fcq==0)
		{
			System.out.println("Following is serial no. of break-fast menu followed by its cost");
			System.out.println("Enter 0 to skip");
			System.out.println();
			System.out.println();
			System.out.println("(Gravy provided)");
			System.out.println("SOUTH INDIAN MENU");
			System.out.println();
			System.out.println("1.Idly(2)................Rs20");
			System.out.println("2.Vada...................Rs15");
			System.out.println("3.Plain Dosa(1)..........Rs20");
			System.out.println("4.Masala-Dosa(1).........Rs30");
			System.out.println("5.Onion dosa(1)..........Rs25");
			System.out.println("6.Upma...................Rs25");
			System.out.println("7.Kesribath..............Rs25");
			System.out.println("8.Lemon rice.............Rs30");
			System.out.println("9.Tomatoe rice...........Rs30");
			System.out.println("10.Puliogare.............Rs30");
			System.out.println("11.Paper dosa(1).........Rs25");
			System.out.println("12.Upma+Kesribath........Rs40");

			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("NORTH INDIAN MENU");
			System.out.println("");
			System.out.println("13.Chapathi(3)...........Rs30");
			System.out.println("14.Poori(3)..............Rs30");
			System.out.println("15.Roti(1)...............Rs15");
			System.out.println("16.Rumali roti(1)........Rs15");
			System.out.println("17.Corn roti.............Rs15");
			System.out.println("18.Nan(1)................Rs15");
			System.out.println("19.Geera Rice............Rs30");
			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println("Enter your option");
			int fcq2=0;
			while(fcq2==0)
			{
				Sfc=obj.readLine();
				try
				{
					fc=Integer.parseInt(Sfc);
					fcq2=1;
				}
				catch(NumberFormatException x)
				{
					System.out.println("Invalid Entry Enter again");
				}
			}

                        if(fc<20)
                        {
                            if(fc==0)
			{
				fcq=1;
			}

			if(fc==1||fc==3||fc==11)
			{
				fb=20;
			}

			if(fc==2||fc==15||fc==16||fc==17||fc==18)
			{
				fb=15;
			}

			if(fc==4||fc==8||fc==9||fc==10||fc==13||fc==14||fc==19)
			{
				fb=30;
			}

			if(fc==6||fc==7||fc==11)
			{
				fb=25;
			}

			if(fc==12)
			{
				fb=40;
			}

			if(fc!=0)
			{
				System.out.println("Enter the quantity");
			while(true)
			{
				Sfq=obj.readLine();
				try
				{
					fq=Integer.parseInt(Sfq);
					Tfb=Tfb+(fq*fb);
					break;
				}
				catch(NumberFormatException x)
				{
					System.out.println("Invalid Entry Enter again");
				}
			}
			}

		}//while
       }


		System.out.println("Total cost Of your break-fast is: Rs "+Tfb);
        TB=TB+Tfb;
	}

	public void LunchMenu()throws IOException
	{
		Tfb=0;
		int fcq=0;
		while(fcq==0)
		{


			System.out.println("Following is serial no. of Lunch menu followed by its cost");
			System.out.println("Enter 0 to skip");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("1.South-Indian Vegetarian Meals.................Rs35");
			System.out.println("2.North-Indian Vegetarian Meals.................Rs45");
			System.out.println("3.South-Indian Non-Vegetarian Meals.............Rs60");
			System.out.println("4.North-Indian Non-Vegetarian Meals.............Rs75");

			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println("ROTI(Gravy to be orderd Separately)");
			System.out.println("");
			System.out.println("5.Chapathi(3)...................................Rs20");
			System.out.println("6.Poori(3)......................................Rs20");
			System.out.println("7.Roti(1).......................................Rs8");
			System.out.println("8.Rumali roti(1)................................Rs9");
			System.out.println("9.Corn roti.....................................Rs8");
			System.out.println("10.Nan(1).......................................Rs10");


			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println("VEG-CURRY/GRAVY");
			System.out.println("");

			System.out.println("PANEER");
			System.out.println("");

			System.out.println("11.Palak-Paneer Gravy............................Rs30");
			System.out.println("12.Butter-Panner Gravy...........................Rs30");
			System.out.println("13.Tomato-Paneer Gravy...........................Rs30");
			System.out.println("");
			System.out.println("");

			System.out.println("Other Veg-Curry/Gravy");
			System.out.println("14.Dal Gravy.....................................Rs25");
			System.out.println("15.Soya Gravy....................................Rs25");
			System.out.println("16.Green Peas Gravy..............................Rs25");

			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println("NON-VEG-CURRY/GRAVY");

			System.out.println("CHICKEN");
			System.out.println("17.Chicken Curry.................................Rs 50");
			System.out.println("18.Butter Chicken................................Rs 130");
			System.out.println("19.Chilly Chicken(Gravy).........................Rs 140");
			System.out.println("20.Chicken Navab(Gravy)..........................Rs 130");
			System.out.println("21.Chicken Hydrabadhi............................Rs 140");
			System.out.println("22.Palak Chicken.................................Rs 90");

			System.out.println("");
			System.out.println("CHICKEN-FRY");
			System.out.println("");
			System.out.println("23.Tandoori Chicken..............................Rs 100");
			System.out.println("24.Chilly Chicken(Dry) ..........................Rs 120");
			System.out.println("25.Kalmi Kabab...................................Rs 100");
			System.out.println("26.Chicken Kabab.................................Rs 90");
			System.out.println("27.Chicken fry...................................Rs 90");
			System.out.println("28.Deep-fry Chicken..............................Rs 150");
			System.out.println("29.Chicken Tikka.................................Rs 130");
			System.out.println("30.Masala Chicken................................Rs 130");
			System.out.println("31.Chicken Manchurian............................Rs 100");
			System.out.println("32.Chicken Satay.................................Rs 170");
			System.out.println("");
			System.out.println("");


			System.out.println("Enter your option");
			int fcq2=0;
			while(fcq2==0)
			{
				Sfc=obj.readLine();
				try
				{
					fc=Integer.parseInt(Sfc);
					fcq2=1;
				}
				catch(NumberFormatException x)
				{
					System.out.println("Invalid Entry Enter again");
				}
			}

                        if(fc<33)
                        {
                            if(fc==0)
			{
				fcq=1;
			}

			if(fc==1)
			{
				fb=35;
			}

			if(fc==2)
			{
				fb=45;
			}

			if(fc==3)
			{
				fb=60;
			}

			if(fc==4)
			{
				fb=75;
			}

			if(fc==5||fc==6)
			{
				fb=20;
			}

			if(fc==7||fc==9)
			{
				fb=20;
			}


			if(fc==8)
			{
				fb=9;
			}

			if(fc==10)
			{
				fb=10;
			}

			if(fc<=13&&fc>=11)
			{
				fb=30;
			}

			if(fc<=16&&fc>=14)
			{
				fb=25;
			}

			if(fc==17)
			{
				fb=50;
			}

			if(fc==18||fc==20||fc==29||fc==30)
			{
				fb=130;
			}

			if(fc==19||fc==21)
			{
				fb=140;
			}

			if(fc==28)
			{
				fb=150;
			}

			if(fc==32)
			{
				fb=170;
			}

			if(fc==22||fc==26||fc==27)
			{
				fb=90;
			}

			if(fc==23||fc==25||fc==31)
			{
				fb=100;
			}

			if(fc!=0)
			{
				System.out.println("Enter the quantity");
			while(true)
			{
				Sfq=obj.readLine();
				try
				{
					fq=Integer.parseInt(Sfq);
					Tfb=Tfb+(fq*fb);
					break;
				}
				catch(NumberFormatException x)
				{
					System.out.println("Invalid Entry Enter again");
				}
			}
			}



		}//while
                }


		System.out.println("Total cost Of your Lunch is: Rs "+Tfb);
                TB=TB+Tfb;
	}

	public void DinnerMenu()throws IOException
	{
		Tfb=0;
		int fcq=0;
		while(fcq==0)
		{


			System.out.println("Following is serial no. of Lunch menu followed by its cost");
			System.out.println("Enter 0 to skip");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("1.South-Indian Vegetarian Meals.................Rs35");
			System.out.println("2.North-Indian Vegetarian Meals.................Rs45");
			System.out.println("3.South-Indian Non-Vegetarian Meals.............Rs60");
			System.out.println("4.North-Indian Non-Vegetarian Meals.............Rs75");

			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println("ROTI(Gravy to be orderd Separately)");
			System.out.println("");
			System.out.println("5.Chapathi(3)...................................Rs20");
			System.out.println("6.Poori(3)......................................Rs20");
			System.out.println("7.Roti(1).......................................Rs8");
			System.out.println("8.Rumali roti(1)................................Rs9");
			System.out.println("9.Corn roti.....................................Rs8");
			System.out.println("10.Nan(1).......................................Rs10");


			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println("VEG-CURRY/GRAVY");
			System.out.println("");

			System.out.println("PANEER");
			System.out.println("");

			System.out.println("11.Palak-Paneer Gravy............................Rs30");
			System.out.println("12.Butter-Panner Gravy...........................Rs30");
			System.out.println("13.Tomato-Paneer Gravy...........................Rs30");
			System.out.println("");
			System.out.println("");

			System.out.println("Other Veg-Curry/Gravy");
			System.out.println("14.Dal Gravy.....................................Rs25");
			System.out.println("15.Soya Gravy....................................Rs25");
			System.out.println("16.Green Peas Gravy..............................Rs25");

			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println("NON-VEG-CURRY/GRAVY");

			System.out.println("CHICKEN");
			System.out.println("17.Chicken Curry.................................Rs 50");
			System.out.println("18.Butter Chicken................................Rs 130");
			System.out.println("19.Chilly Chicken(Gravy).........................Rs 140");
			System.out.println("20.Chicken Navab(Gravy)..........................Rs 130");
			System.out.println("21.Chicken Hydrabadhi............................Rs 140");
			System.out.println("22.Palak Chicken.................................Rs 90");

			System.out.println("");
			System.out.println("CHICKEN-FRY");
			System.out.println("");
			System.out.println("23.Tandoori Chicken..............................Rs 100");
			System.out.println("24.Chilly Chicken(Dry) ..........................Rs 120");
			System.out.println("25.Kalmi Kabab...................................Rs 100");
			System.out.println("26.Chicken Kabab.................................Rs 90");
			System.out.println("27.Chicken fry...................................Rs 90");
			System.out.println("28.Deep-fry Chicken..............................Rs 150");
			System.out.println("29.Chicken Tikka.................................Rs 130");
			System.out.println("30.Masala Chicken................................Rs 130");
			System.out.println("31.Chicken Manchurian............................Rs 100");
			System.out.println("32.Chicken Satay.................................Rs 170");
			System.out.println("");
			System.out.println("");


			System.out.println("Enter your option");
			int fcq2=0;
			while(fcq2==0)
			{
				Sfc=obj.readLine();
				try
				{
					fc=Integer.parseInt(Sfc);
					fcq2=1;
				}
				catch(NumberFormatException x)
				{
					System.out.println("Invalid Entry Enter again");
				}
			}

                        if(fc<33)
                        {
                            if(fc==0)
			{
				fcq=1;
			}

			if(fc==1)
			{
				fb=35;
			}

			if(fc==2)
			{
				fb=45;
			}

			if(fc==3)
			{
				fb=60;
			}

			if(fc==4)
			{
				fb=75;
			}

			if(fc==5||fc==6)
			{
				fb=20;
			}

			if(fc==7||fc==9)
			{
				fb=20;
			}


			if(fc==8)
			{
				fb=9;
			}

			if(fc==10)
			{
				fb=10;
			}

			if(fc<=13&&fc>=11)
			{
				fb=30;
			}

			if(fc<=16&&fc>=14)
			{
				fb=25;
			}

			if(fc==17)
			{
				fb=50;
			}

			if(fc==18||fc==20||fc==29||fc==30)
			{
				fb=130;
			}

			if(fc==19||fc==21)
			{
				fb=140;
			}

			if(fc==28)
			{
				fb=150;
			}

			if(fc==32)
			{
				fb=170;
			}

			if(fc==22||fc==26||fc==27)
			{
				fb=90;
			}

			if(fc==23||fc==25||fc==31)
			{
				fb=100;
			}

			if(fc!=0)
			{
				System.out.println("Enter the quantity");
			while(true)
			{
				Sfq=obj.readLine();
				try
				{
					fq=Integer.parseInt(Sfq);
					Tfb=Tfb+(fq*fb);
					break;
				}
				catch(NumberFormatException x)
				{
					System.out.println("Invalid Entry Enter again");
				}
			}
			}

		}//while
                }


		System.out.println("Total cost Of your Lunch is: Rs "+Tfb);
                TB=TB+Tfb;
	}

	public void SnackMenu()throws IOException
	{
            fcq=0;
		while(fcq==0)
		{
			//System.out.println("Tfb:"+Tfb);

			System.out.println("Following is serial no. of Snack menu followed by its cost");
			System.out.println("Enter 0 to skip");
			System.out.println();
            System.out.println();
            System.out.println("CHATS");
			System.out.println("1.Pani-Poori...................Rs25");
			System.out.println("2.Masala-Poori.................Rs25");
			System.out.println("3.Dhai-Poori...................Rs25");
			System.out.println("4.Shev-Poori...................Rs25");
			System.out.println("5.Bhel-Poori...................Rs25");
			System.out.println("6.Samosa-Poori.................Rs25");
            System.out.println("7.Aloo-Poori...................Rs25");
            System.out.println();
            System.out.println();
            System.out.println("SNACKS");
			System.out.println("8.Samosa......................Rs10");
			System.out.println("9.French-Fries................Rs35");
			System.out.println("10.Chicken-Roll...............Rs40");
			System.out.println("11.Veg-Roll...................Rs35");
			System.out.println("12.Aloo-Tikki.................Rs30");
            System.out.println("13.Dal-Kachori................Rs30");
            System.out.println("14.Chicken burger.............Rs45");
            System.out.println("15.Veg-Burger.................Rs40");
			System.out.println("16.Cheesy-Pissa...............Rs60");
            System.out.println("17.Pao-bhaji..................Rs40");

			System.out.println("Enter your option");
			int fcq2=0;
			while(fcq2==0)
			{
				Sfc=obj.readLine();
				try
				{
					fc=Integer.parseInt(Sfc);
					fcq2=1;
				}
				catch(NumberFormatException x)
				{
					System.out.println("Invalid Entry Enter again");
				}
			}

          if(fc<18)
          {
           if(fc==0)
			{
				fcq=1;
			}

			if(fc<=7&&fc>=1)
			{
				fb=25;
			}

			if(fc==9||fc==11)
			{
				fb=35;
			}

			if(fc==8)
			{
				fb=10;
			}

			if(fc==10||fc==15||fc==17)
			{
				fb=40;
			}

                        if(fc==12||fc==13)
			{
				fb=40;
			}

                        if(fc==14)
			{
				fb=45;
			}

                        if(fc==16)
			{
				fb=60;
			}

			if(fc!=0)
			{
				System.out.println("Enter the quantity");
                 while(true)
                 {
             		Sfq=obj.readLine();
					try
					{
						fq=Integer.parseInt(Sfq);
						Tfb=Tfb+(fq*fb);
						break;
					}
					catch(NumberFormatException x)
					{
						System.out.println("Invalid Entry Enter again");
					}
                 }
			}

		//	System.out.println("TFB:"+Tfb);

		}


               }//while
            System.out.println("Total cost Of your snacks is: Rs "+Tfb);

                TB=TB+Tfb;

	}

	public void JuiceMenu()throws IOException
	{
             fcq=0;
		while(fcq==0)
		{
			System.out.println("Following is serial no. of break-fast menu followed by its cost");
			System.out.println("Enter 0 to skip");
			System.out.println();
            System.out.println();
            System.out.println("JUICES");
           System.out.println();
			System.out.println("1.Lime........................Rs25");
			System.out.println("2.Orange......................Rs25");
			System.out.println("3.Sweet-Lime..................Rs25");
			System.out.println("4.Apple.......................Rs35");
			System.out.println("5.Pine-Apple..................Rs25");
			System.out.println("6.Mango(Seasonal Only)........Rs25");
            System.out.println("7.Kiwi........................Rs25");
			System.out.println("8.Grapes......................Rs25");
			System.out.println("9.Peach.......................Rs35");
			System.out.println("10.Black Current(Seasonal Only).Rs25");
            System.out.println();
            System.out.println();
            System.out.println("MILK-Shakes");
			System.out.println("11.Apple......................Rs35");
			System.out.println("12.Mango......................Rs25");
            System.out.println("13.Peach......................Rs35");
            System.out.println("14.Mash-Melon.................Rs35");
            System.out.println("15.Butter Fruit(Seasonal Only).Rs35");
            System.out.println("16.Banana.....................Rs25");
            System.out.println("17.Papaya.....................Rs25");

			System.out.println("Enter your option");
			int fcq2=0;
			while(fcq2==0)
			{
				Sfc=obj.readLine();
				try
				{
					fc=Integer.parseInt(Sfc);
					fcq2=1;
				}
				catch(NumberFormatException x)
				{
					System.out.println("Invalid Entry Enter again");
				}
			}

                        if(fc<18)
                        {
                            fb=35;
			if(fc==0)
			{
				fcq=1;
			}

			if(fc<=3&&fc>=1)
			{
				fb=25;
			}

                        if(fc<=8&&fc>=5)
			{
				fb=25;
			}

			if(fc==10||fc==12||fc==16||fc==17)
			{
				fb=25;
			}

			if(fc!=0)
			{
				System.out.println("Enter the quantity");
                            while(true)
                            {
                            	Sfq=obj.readLine();
				try
				{
					fq=Integer.parseInt(Sfq);
					Tfb=Tfb+(fq*fb);
					break;
				}
				catch(NumberFormatException x)
				{
					System.out.println("Invalid Entry Enter again");
				}
                            }
			}

		}//while

		System.out.println("Total cost Of your break-fast is: Rs "+Tfb);
                        }


                TB=TB+Tfb;
	}

	public void RestaurantChoice()throws IOException
	{
		/*This function lets the customer to make a choice
		 *to move to the restaurant that he desires*/
		System.out.println("Please Choose your restaurant");
		chk10=0;
			while(chk10==0)
			{
				System.out.println("Enter 0 to exit Food Menu");
				System.out.println("Enter 1 for Pool Restaurant");
				System.out.println("Enter 2 for Solitaire Restaurant");


				Sf=obj.readLine();

				while(true)
				{
					try
					{
						f=Integer.parseInt(Sf);
						break;
					}
					catch(NumberFormatException x)
					{
						System.out.println("Re-Enter a Valid option");
					}
				}

				switch(f)
				{
					case 0: chk10=1;
							break;


					case 1:myobj.FoodMenu();

							break;

					case 2:myobj2.menu();
					//the above function is in the file "restaurant.java"
							break;

					default:System.out.println("Re-Enter your Option");
							chk10=0;
				}
			}
	}

	public void Spa()throws IOException//to accept if spa facilities is required
	{
		chk10=0;
		tsb=0;
		while(chk10==0)
		{
		System.out.println("Enter 1 for Homeopathy Treatment       Charges : Rs 600 per member per hour");
		System.out.println("Enter 2 for Ayurvedic Oil Massage      Charges : Rs 500 per member per hour");
		System.out.println("Enter 3 for Accupuncture Therapy       Charges : Rs 750 per member per hour");
		System.out.println("Enter 4 for Steam Bath/ Jacoozi        Charges : Rs 250 per member per hour");
		System.out.println("Enter 5 for Facial, Manicure, Pedicure Charges : Rs 400 per member per hour");
		System.out.println("Enter 0 to return to previous menu");

		 cc=0;
        while(true)
		{
			spa=obj.readLine();

			try
			{
				cc=(Integer.parseInt(spa));

				if(cc<6)
				{
					break;
				}

			}
			catch(NumberFormatException e)
			{
				System.out.println("Re-Enter a option");
			}
		}

		if(cc==0)
		{
			chk10=1;
		}

		if(cc==1)
		{
			cc=600;
		}

		if(cc==2)
		{
			cc=500;
		}

		if(cc==3)
		{
			cc=750;
		}

		if(cc==4)
		{
			cc=250;
		}

		if(cc==5)
		{
			cc=400;
		}

		if(chk10==0)
		{
			System.out.println("Enter no of People");
        System.out.println("Enter 0 if do not want to use facility");
        while(true)
		{
			spa=obj.readLine();

			try
			{
				noc=(Integer.parseInt(spa));
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Re-Enter a option");
			}
		}
		if(noc!=0)
		{
			myobj.Duration();
		}

		if(noc==0)
		{
			chk10=1;
		}

		tsb=tsb+(Dur*noc*cc);
		}


		}


        System.out.println("Cost of Spa facility is: Rs "+tsb);
		TB=TB+tsb;

	}//end of "to accept if spa facilities is required"

	public void TableTennis()throws IOException
	{
		tsb=0;
		System.out.println("Table-Tennis");
		System.out.println("Cost Rs 100 per hour");
		System.out.println("Please Enter Number of People Using this facility(Enter 0 if do not want to use)");

		while(true)
		{
			spa=obj.readLine();

			try
			{
				noc=(Integer.parseInt(spa));
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Re-Enter a option");
			}
		}

		System.out.println("Please Enter Duration of use");
		myobj.Duration();

		tsb=noc*Dur*100;
		System.out.println("Cost of Table-Tennis facility is Rs:"+tsb);
		TB=tsb+TB;
	}

	public void Pool()throws IOException
	{
		tsb=0;
		System.out.println("Pool/Billiards");
		System.out.println("Cost Rs 150 per hour");
		System.out.println("Please Enter Number of People Using this facility(Enter 0 if do not want to use)");

		while(true)
		{
			spa=obj.readLine();

			try
			{
				noc=(Integer.parseInt(spa));
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Re-Enter a option");
			}
		}

		System.out.println("Please Enter Duration of use");
		myobj.Duration();

		tsb=noc*Dur*150;
		System.out.println("Cost of Pool/Billiards facility is: Rs "+tsb);
		TB=tsb+TB;
	}

	public void Badminton()throws IOException
	{
		tsb=0;
		System.out.println("Badminton");
		System.out.println("Cost Rs 100 per hour");
		System.out.println("Please Enter Number of People Using this facility(Enter 0 if do not want to use)");

		while(true)
		{
			spa=obj.readLine();

			try
			{
				noc=(Integer.parseInt(spa));
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Re-Enter a option");
			}
		}

		System.out.println("Please Enter Duration of use");
		myobj.Duration();

		tsb=noc*Dur*100;
		System.out.println("Cost of Badminton facility is: Rs "+tsb);
		TB=tsb+TB;
	}

	public void Squash()throws IOException
	{
		tsb=0;
		System.out.println("SQUASH");
		System.out.println("Cost Rs 150 per hour");
		System.out.println("Please Enter Number of People Using this facility(Enter 0 if do not want to use)");

		while(true)
		{
			spa=obj.readLine();

			try
			{
				noc=(Integer.parseInt(spa));
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Re-Enter a option");
			}
		}

		System.out.println("Please Enter Duration of use");
		myobj.Duration();

		tsb=noc*Dur*150;
		System.out.println("Cost of Squash facility is: Rs "+tsb);
		TB=tsb+TB;
	}

	public void IndoorGames()throws IOException//to check if customer requeres Indoor games
	{
		chk10=0;

		while(chk10==0)
		{
			System.out.println("Enter 0 to EXIT");
			System.out.println("Enter 1 for Table-Tennis");
			System.out.println("Enter 2 for Pool/Billiards");
			System.out.println("Enter 3 for Badminton");
			System.out.println("Enter 4 for Squash");

			while(true)
			{
				Sf=obj.readLine();

				try
				{
					f=Integer.parseInt(Sf);
					break;
				}
				catch(NumberFormatException e)
				{
					System.out.println("Re-Enter");
				}
			}

			if(f>4)
			{
				System.out.println("Re-Enter a Valid Option");
			}

			if(f<=4)
			{
				switch(f)
				{
					case 0: System.out.println("|You are always Welcome|");
							chk10=1;
							break;

					case 1: myobj.TableTennis();
							break;

					case 2: myobj.Pool();
							break;

					case 3: myobj.Badminton();
							break;

					case 4: myobj.Squash();
							break;
				}
			}

		}//while

	}//end of "to check if customer requeres Indoor games"

	public void OutdoorGames()throws IOException//to check if Customer requires outdoor games
	{
		chk10=0;

		while(chk10==0)
		{
			System.out.println("Enter 0 to EXIT");
			System.out.println("Enter 1 for Tennis");
			System.out.println("Enter 2 for Golf");

			while(true)
			{
				Sf=obj.readLine();

				try
				{
					f=Integer.parseInt(Sf);
					break;
				}
				catch(NumberFormatException e)
				{
					System.out.println("Re-Enter");
				}
			}

			if(f>2)
			{
				System.out.println("Re-Enter a Valid Option");
			}

			if(f<=2)
			{
				switch(f)
				{
					case 0: System.out.println("|You are always Welcome|");
							chk10=1;
							break;

					case 1: myobj.Tennis();
							break;

					case 2: myobj.Golf();
							break;
				}
			}

		}//while

	}//end of "to check if Customer requires outdoor games"

	public void Swimming()throws IOException//to check if customer requires swimming
	{
		tsb=0;
		System.out.println("SWIMMING");
		System.out.println("Cost Rs 200 per hour");
		System.out.println("Please Enter Number of People Using this facility(Enter 0 if do not want to use)");

		while(true)
		{
			spa=obj.readLine();

			try
			{
				noc=(Integer.parseInt(spa));
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Re-Enter a option");
			}
		}

		System.out.println("Please Enter Duration of use");
		myobj.Duration();

		tsb=noc*Dur*200;
		TB=tsb+TB;
	}//end of "to check if customer requires swimming"

	public void Tennis()throws IOException
	{
		tsb=0;
		System.out.println("TENNIS");
		System.out.println("Cost Rs 100 per hour");
		System.out.println("Please Enter Number of People Using this facility(Enter 0 if do not want to use)");

		while(true)
		{
			spa=obj.readLine();

			try
			{
				noc=(Integer.parseInt(spa));
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Re-Enter a option");
			}
		}

		System.out.println("Please Enter Duration of use");
		myobj.Duration();

		tsb=noc*Dur*100;

		System.out.println("Cost of Tennis facility is Rs:"+tsb);
		TB=tsb+TB;
	}

	public void Golf()throws IOException
	{
		tsb=0;
		System.out.println("GOLF");
		System.out.println("Cost Rs 200 per hour");
		System.out.println("Please Enter Number of People Using this facility(Enter 0 if do not want to use)");

		while(true)
		{
			spa=obj.readLine();

			try
			{
				noc=(Integer.parseInt(spa));
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Re-Enter a option");
			}
		}

		System.out.println("Please Enter Duration of use");
		myobj.Duration();


		tsb=noc*Dur*200;

		System.out.println("Cost of Golf facility is: Rs "+tsb);
		TB=tsb+TB;
	}

	public void TypeOfRoom()throws IOException//to chaeck type of room
	{
		System.out.println("Please Enter type of room");
		System.out.println("\t (Charges Rs 500/head if beyond limit) Max limit:+2 more than limit");
		System.out.println();

		System.out.println("Enter 1 for single bed Room");
		System.out.println("\t (Charges Rs 1000/day)	limit:1");
		System.out.println();

		System.out.println("Enter 2 for single bed Roomn with a/c");
		System.out.println("\t (Charges Rs 1300/day)	limit:1");
		System.out.println();

		System.out.println("Enter 3 for double bed Room");
		System.out.println("\t (Charges Rs 1500/day)	limit:2");
		System.out.println();

		System.out.println("Enter 4 for double bed Room with a/c");
		System.out.println("\t (Charges Rs 1800/day)	limit:2");
		System.out.println();

		System.out.println("Enter 5 for Delux suit");
		System.out.println("\t (Charges Rs 2500/day)	limit:5");
		System.out.println();

		System.out.println("Enter your option");
		ck=0;
		while(ck==0)
		{
			try
			{
				while(ck==0)
				{
					tor=Integer.parseInt(obj.readLine());
					if(tor<=5&&tor>0)
					{
						ck=1;
					}
					else
					{
						System.out.println("Invalid Entry Enter again");
						continue;
					}
				}
				ck=1;
			}//try
			catch(NumberFormatException x)
			{
				System.out.println("Invalid Entry Enter again");
				continue;
			}//catch

		}//end of while

		switch(tor)
		{
			case 1:type=1;
					break;

			case 2:type=2;
					break;

			case 3:type=3;
					break;

			case 4:type=4;
					break;

			case 5:type=5;
					break;
		}//switch
	}

	public void Compability()throws IOException//to check if room is compatible
	{
		/**This function makes decesion if the customer
		 *is able to take up the type of room that he
		 *desires to stay in*/
		ck7=0;
		chk1=0;
		while(chk1==0)
		{

			if(noc>5)
			{
				System.out.println("None of the rooms are compatible with respect to number of Customers-book multiple rooms");
				//System.out.println("Restart Program");
				chk1=1;
			}


			if(noc<=5)
			{
				if(type==1||type==2)
				{
					chk1=1;
					if(noc>3)
					{
						ck5=0;

						while(ck5==0)
						{
							ck6=0;
							System.out.println("Please Enter 1 to change type of room");
							System.out.println("Please Enter 2 to book multiple rooms");

							while(ck6==0)
							{
								Sopt=obj.readLine();

								try
								{
									opt=Integer.parseInt(Sopt);

									if(opt==1)
									{
										myobj.TypeOfRoom();
										ck7=0;
										ck6=1;
										ck5=1;
									}
									else if(opt==2)
									{
										ck7=1;
										ck6=1;
										ck5=1;
										break;
									}
								}
								catch(NumberFormatException e)
								{
									System.out.println("Re-enter a valid number");
								}
							}

						}


					}
				}

				if(type==3||type==4)
				{	chk1=1;
					if(noc>4)
					{
						ck5=0;

						while(ck5==0)
						{
							ck6=0;
							System.out.println("Please Enter 1 to change type of room");
							System.out.println("Please Enter 2 to book multiple rooms");

							while(ck6==0)
							{
								Sopt=obj.readLine();

								try
								{
									opt=Integer.parseInt(Sopt);

									if(opt==1)
									{
										myobj.TypeOfRoom();
										ck7=0;
										ck6=1;
										ck5=1;
									}
									else if(opt==2)
									{
										ck7=1;
										ck6=1;
										ck5=1;
										break;
									}
								}
								catch(NumberFormatException e)
								{
									System.out.println("Re-enter a valid number");
								}
							}

						}
					}
				}

				if(type==5)
				{
					if(noc>5)
					{
						ck5=0;

						while(ck5==0)
						{
							ck6=0;
							System.out.println("Please Enter 1 to change type of room");
							System.out.println("Please Enter 2 to book multiple rooms");

							while(ck6==0)
							{
								Sopt=obj.readLine();

								try
								{
									opt=Integer.parseInt(Sopt);

									if(opt==1)
									{
										myobj.TypeOfRoom();
										ck7=0;
										ck6=1;
										ck5=1;
									}
									else if(opt==2)
									{
										ck7=1;
										ck6=1;
										ck5=1;
										break;
									}
								}
								catch(NumberFormatException e)
								{
									System.out.println("Re-enter a valid number");
								}
							}

						}
					}
				}
			}


		}
	}

	public void Checkin()throws IOException//options @ checkin
	{
		/*this function is responsible for allthe necessary
		 *function that is required during checkin process*/
		myobj.Acceptance();
		myobj.NumberOfCustomers();
		myobj.TypeOfRoom();
		myobj.Compability();
		myobj.Rooms();
		myobj.AllocateRoom();
		myobj.RenameFile();

	}//end of "checkin"

	public void Rooms()throws IOException
	{
		/*This function creates the file
		 *"ProjectRooms.txt" where the rooms that are occupied and
		 *rooms that are unoccupied are are stored in this file*/
		try
		{

			File fl=new File("ProjectRooms.txt");

			if(fl.exists())
			{

			}

			else
			{
				FileWriter fw=new FileWriter("ProjectRooms.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter pw=new PrintWriter(bw);

				//pw.println("");

				for(int a=101;a<=110;a++)
				{
					//String temp=a;

					pw.print(a);
					pw.println(":E");
					//pw.println("");
				}
				for(int a=201;a<=210;a++)
				{
					//String temp=a;

					pw.print(a);
					pw.println(":E");
					//pw.println("");
				}
				for(int a=301;a<=310;a++)
				{
					//String temp=a;

					pw.print(a);
					pw.println(":E");
				//	pw.println("");
				}

				for(int a=401;a<=410;a++)
				{
					//String temp=a;

					pw.print(a);
					pw.println(":E");
				//	pw.println("");
				}

				for(int a=501;a<=508;a++)
				{
					//String temp=a;

					pw.print(a);
					pw.println(":E");
				//	pw.println("");
				}

				for(int a=601;a<=608;a++)
				{
					//String temp=a;

					pw.print(a);
					pw.println(":E");
					//pw.println("");
				}

				for(int a=701;a<=708;a++)
				{
					//String temp=a;

					pw.print(a);
					pw.println(":E");
					//pw.println("");
				}

				for(int a=801;a<=808;a++)
				{
					//String temp=a;

					pw.print(a);
					pw.println(":E");
					//pw.println("");
				}

				for(int a=901;a<=906;a++)
				{
					//String temp=a;

					pw.print(a);
					pw.println(":E");
					//pw.println("");
				}

				for(int a=1001;a<=1006;a++)
				{
					//String temp=a;

					pw.print(a);
					pw.println(":E");
					//pw.println("");
				}
				pw.close();
				bw.close();
			//	fw.close();
			}



		}//end of try
		catch(Exception e)
		{

		}//catch
	}//end of rooms

	public void AllocateRoom()throws IOException//to allocate rooms
	{
		/*assuming 10 floors in hotel
		 *2 floors with each of 10 rooms for single(without a/c)
		 *2 floors with each of 10 rooms for single(with a/c)
		 *2 floors with each of 8 rooms for Double(without a/c)
		 *2 floors with each of 8 rooms for Double(with a/c)
		 **2 floors with each of 5 rooms for Suits
		*/

		if(noc>5)
		{
			try
			{
				FileReader fr=new FileReader("ProjectRooms.txt");
				BufferedReader br=new BufferedReader(fr);


				FileWriter fw=new FileWriter("ProjectHotelmanagement.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter pw=new PrintWriter(bw);


				String RD;
				while((RD=br.readLine())!=null)
				{
					pw.println(RD);
				}

				br.close();
				bw.close();
				pw.close();
			}
			catch(Exception e)
			{

			}

		}

		if(ck7==0)
		{
			if(noc<=5)
		{

			//System.out.println("Enterd");
			try
			{

				FileReader fr=new FileReader("ProjectRooms.txt");
				//FileReader fr=new FileReader("ProjectHotelmanagement2.txt");
				BufferedReader br=new BufferedReader(fr);

				String RD;

				if(type==1)
				{
					 this.a=101;
					 this.b=101;
					 this.c=0;
				}

				else if(type==2)
				{
					 this.a=301;
					 this.b=301;
				 	this.c=20;
				}

				else if(type==3)
				{
					 this.a=501;
					 this.b=501;
					 this.c=40;
				}

				else if(type==4)
				{
					 this.a=701;
					 this.b=701;
					 this.c=56;
				}

				else if(type==5)
				{
					 this.a=901;
					 this.b=901;
					 this.c=72;
				}

				//System.out.println("Check the room wrt type-referece"+a);
				//System.out.println("Check the room wrt type-referece"+b);

				FileWriter fw=new FileWriter("ProjectHotelmanagement.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter pw=new PrintWriter(bw);
				ch=0;

				//System.out.println("Enterd2");
				for(int i=0;i<c;i++)
				{
					RD=br.readLine();
					pw.println(RD);
					//System.out.println(RD);

				}

			while((RD=br.readLine())!=null||b==a)
			{
				//System.out.println("Enterd3");

				String sb=a+":E";

				if(RD.compareTo(sb)!=0)
				{
					pw.println(RD);
				}

				if(type==1&&a==301)
				{
					pw.println(RD);
					System.out.println("All rooms of this type are Occupied");
					chk=1;
					while((RD=br.readLine())!=null)
					{
						pw.println(RD);
					}
					break;
				}//if(type==1&&a==301)

				if(type==2&&a==501)
				{
					pw.println(RD);
					System.out.println("All rooms of this type are Occupied");
					chk=1;
					while((RD=br.readLine())!=null)
					{
						pw.println(RD);
					}
					break;
				}//if(type==1&&a==501)

				if(type==3&&a==701)
				{
					pw.println(RD);
					System.out.println("All rooms of this type are Occupied");
					chk=1;
					while((RD=br.readLine())!=null)
					{
						pw.println(RD);
					}
					break;
				}//	if(type==3&&a==701)


				if(type==4&&a==901)
				{
					pw.println(RD);
					System.out.println("All rooms of this type are Occupied");
					chk=1;
					while((RD=br.readLine())!=null)
					{
						pw.println(RD);
					}
					break;
				}//if(type==4&&a==901)

					//System.out.println("sb"+sb);

			//	System.out.println(RD);



				if(RD.compareTo(sb)==0&&ch==0)
				{
					//System.out.println("Empty");

					//calling functions

					myobj.CustomerID();
					myobj.RenameFile2();
					myobj.DateAndTime();
					myobj.CustomerLog();

					pw.println(a+":O");
					System.out.println("Room No="+a);
					ch=1;
					a=a+1;
					while((RD=br.readLine())!=null)
					{
						pw.println(RD);
					}
						break;
				}

				if(a==110)
				{
					this.b=201;
					this.a=200;
				}

				if(a==210)
				{
					this.b=301;
					this.a=300;
				}

				if(a==310)
				{
					this.b=401;
					this.a=400;
				}
				if(a==410)
				{
					this.b=501;
					this.a=500;
				}

				if(a==508)
				{
					this.b=601;
					this.a=600;
				}

				if(a==608)
				{
					this.b=701;
					this.a=700;
				}

				if(a==708)
				{
					this.b=801;
					this.a=800;
				}

				if(a==808)
				{
					this.b=901;
					this.a=900;
				}

				if(a==906)
				{
				this.b=1001;
				this.a=1000;
				}


				a=a+1;
				if(a==1007)
				{
					System.out.println("All rooms of tis type r filed up");
					chk=1;
				}



			}
			//fw.close();
			bw.close();
			pw.close();


		}


		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		}



	}//end of"RoomAllocation()"

	public void Checkout()throws IOException
	{
		/*this function is similar to checkin but the functions executed are function that
		 *are used during checkout of customer*/
			myobj.ClearanceOfRooms();
			myobj.RenameFile();
			myobj.DateAndTime();
			myobj.AddCheckOutDate();
			myobj.RenameFile3();
			myobj.TotalCost();
	}//end of checkout

	public void ClearanceOfRooms()throws IOException
	{
		/*this function is responsible for checking out of
		 *customer where during checkout all the necessary details
		 *are filled and the it is ensured that room is evacuated
		 *by changing the data in the file "ProjectRooms.txt" */
		try
		{
			FileReader fr=new FileReader("ProjectRooms.txt");
			//FileReader fr=new FileReader("ProjectHotelmanagement2.txt");
			BufferedReader br=new BufferedReader(fr);

			String RD;

			FileWriter fw=new FileWriter("ProjectHotelmanagement.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);


			ck=0;
			while(ck==0)
			{

				System.out.println("Please Enter the room no");

				ck=0;
				while(ck==0)
				{

					try
					{
						System.out.println("accepting room no");
						CORoomNo=Integer.parseInt(obj.readLine());

							if(CORoomNo>=101&&CORoomNo<=110)
							{
								//System.out.println("checking if room exists");
								ck=1;
								//System.out.println("CK="+ck);
							}

							if(CORoomNo>=201&&CORoomNo<=210)
							{
								ck=1;
							}

							if(CORoomNo>=301&&CORoomNo<=310)
							{
								ck=1;
							}

							if(CORoomNo>=401&&CORoomNo<=410)
							{
								ck=1;
							}


							if(CORoomNo>=501&&CORoomNo<=508)
							{
								ck=1;
							}

							if(CORoomNo>=601&&CORoomNo<=608)
							{
								ck=1;
							}

							if(CORoomNo>=701&&CORoomNo<=708)
							{
								ck=1;
							}

							if(CORoomNo>=801&&CORoomNo<=808)
							{
								ck=1;
							}

							if(CORoomNo>=901&&CORoomNo<=906)
							{
								ck=1;
							}

							if(CORoomNo>=1001&&CORoomNo<=1006)
							{
								ck=1;
							}

							//System.out.println("CK2="+ck);
							if(ck==0)
							{
								//System.out.println("Checking if room exists");
								System.out.println("The room no. entered is invalid");
								System.out.println("Re-enter existing room number");


								ck=0;
							}


					}//end of try

					catch(NumberFormatException x)
					{
						System.out.println("The room no. entered is invalid");
						System.out.println("Enter again");
						ck=0;
					}
				}//while

				System.out.println("Got out of acceptance");
				tempCheck=CORoomNo+":E";


					ck=0;
					while((RD=br.readLine())!=null)
					{
						if(RD.compareTo(tempCheck)==0)
						{
							//System.out.println("Checking if room is empty");
							System.out.println("The room you are trying to checkout is already Empty");
							System.out.println("Enter Again");


							while(ck==0)
							{

								try
								{
									CORoomNo=Integer.parseInt(obj.readLine());
									ck=1;
								}//end of try

								catch(NumberFormatException x)
								{
									System.out.println("The room no. entered is invalid");
									System.out.println("Enter again");

								}

							}

						}//if

						if(RD.compareTo(tempCheck)!=0)
						{
							ck=0;
						}
					}//end of sub-while
				ck=1;
			}//end of while

				br.close();
				FileReader fr1=new FileReader("ProjectRooms.txt");
				//FileReader fr=new FileReader("ProjectHotelmanagement2.txt");
				BufferedReader br1=new BufferedReader(fr1);
				tempCheck=CORoomNo+":O";
				tempCheck1=CORoomNo+":E";
			while((RD=br1.readLine())!=null)
			{
				if(RD.compareTo(tempCheck)==0)
				{
					pw.println(tempCheck1);

				}
				else
				{
					pw.println(RD);

				}
			}//while
			bw.close();
			pw.close();

		}//end of try
		catch(Exception e)
		{
			System.err.println(e);
		}//end of catch

	}//end of ClearanceOfRooms()

	public void CustomerLog()throws IOException
	{
		/*This function is responsible to store log of customer*/
		myobj.PutInDataOfCustomers();
		myobj.RenameFile3();
	}

	public void CreateLog()throws IOException
	{
		try
		{
			File f=new File("HotelLog.txt");

			if(!f.exists())
			{
				FileWriter fw=new FileWriter("HotelLog.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter pw=new PrintWriter(bw);

				bw.close();
				pw.close();
			}
		}
		catch(Exception e)
		{

		}

	}

	public void PutInDataOfCustomers()throws IOException
	{
		try
		{
			File f=new File("HotelLog.txt");

			myobj.CreateLog();

				FileWriter fw=new FileWriter("HotelLog1.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter pw=new PrintWriter(bw);

				FileReader fr=new FileReader("HotelLog.txt");
				BufferedReader br=new BufferedReader(fr);

				String RD;

				while((RD=br.readLine())!=null)
				{
					pw.println(RD);
				}

				pw.println(tempS);
				pw.println("Name:"+name);
				pw.println("Room Number="+a);
				pw.println("No. Of Customers:"+noc);
				pw.println(DCI);
				pw.println(TCI);

				pw.println("Contact No.(residence):"+SresNo);
				pw.println("Contact No.(Mobile):"+SmobNo);
				pw.println("Age:"+age);
				pw.println("adress:"+adress);
				pw.println();
				pw.println();

				br.close();
				bw.close();
				pw.close();


		}//end of try
		catch(Exception e)
		{

		}//end of catch

	}//end of PutInDataOfCustomers()

	public void CustomerID()throws IOException
	{
		try
		{
			File fl=new File("CustID.txt");

			if(fl.exists())
			{

			}

			else
			{

				FileWriter fw=new FileWriter("CustID.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter pw=new PrintWriter(bw);

				pw.println("0");
				tempS=1;
				bw.close();
				pw.close();
			}


			FileWriter fw1=new FileWriter("CustID1.txt");
			BufferedWriter bw1=new BufferedWriter(fw1);
			PrintWriter pw1=new PrintWriter(bw1);

			FileReader fr=new FileReader("CustID.txt");
			BufferedReader br=new BufferedReader(fr);

			String RD;

			RD=br.readLine();
			{
					tempS=Integer.parseInt(RD);
					tempS=tempS+1;

					pw1.println(tempS);
					System.out.println("Customer ID no:"+tempS);
			}

			bw1.close();
			pw1.close();
			br.close();


		}

		catch(Exception e)
		{

		}

	}//

	/*RenameFile(1-6) is used to rename/delete the files
	 *as java does not allows to rename a file directly it has
	 *to be done in a different manner*/

	 public void RenameFile()throws IOException//to delete the excess file created
	{
		try
		{
			File fl=new File("ProjectRooms.txt");
			fl.delete();

			FileWriter fw=new FileWriter("ProjectRooms.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);

			FileReader fr=new FileReader("ProjectHotelmanagement.txt");
			BufferedReader br=new BufferedReader(fr);

			String RD;

			while((RD=br.readLine())!=null)
			{
				pw.println(RD);
			}
			pw.close();
			bw.close();
			br.close();
			File fl2=new File("ProjectHotelmanagement.txt");
			fl2.delete();

		}//end of try

		catch(Exception e)
		{

		}//end of catch

	}//end of RenameFile()

	public void RenameFile2()throws IOException//to delete the excess file created
	{
		try
		{
			File fl=new File("CustID.txt");
			fl.delete();

			FileWriter fw=new FileWriter("CustID.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);

			FileReader fr=new FileReader("CustID1.txt");
			BufferedReader br=new BufferedReader(fr);

			String RD;

			while((RD=br.readLine())!=null)
			{
				pw.println(RD);
			}
			pw.close();
			bw.close();
			br.close();

			File fl2=new File("CustID1.txt");
			fl2.delete();

		}//end of try

		catch(Exception e)
		{

		}//end of catch

	}//end of RenameFile2()

	public void RenameFile3()throws IOException//to delete 1 of the file(related ro LOG)
	{
		try
		{
			File fl=new File("HotelLog.txt");
			fl.delete();

			FileWriter fw=new FileWriter("HotelLog.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);

			FileReader fr=new FileReader("HotelLog1.txt");
			BufferedReader br=new BufferedReader(fr);

			String RD;

			while((RD=br.readLine())!=null)
			{
				pw.println(RD);
			}
			pw.close();
			bw.close();
			br.close();

			File fl2=new File("HotelLog1.txt");
			fl2.delete();

		}//end of try

		catch(Exception e)
		{

		}//end of catch
	}

	public void RenameFile4()throws IOException
	{

		File f2=new File("Positions1.txt");

		if(f2.exists())
		{
			try
		{
			File fl=new File("Positions.txt");
			fl.delete();

			FileWriter fw=new FileWriter("Positions.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);

			FileReader fr=new FileReader("Positions1.txt");
			BufferedReader br=new BufferedReader(fr);

			String RD;

			while((RD=br.readLine())!=null)
			{
				pw.println(RD);
			}
			pw.close();
			bw.close();
			br.close();

			File fl2=new File("Positions1.txt");
			fl2.delete();

			//System.out.println("Reference: Completion of task of functon RenameFile4()");
		}//end of try

		catch(Exception e)
		{
			System.out.println("Unable to rename!");
		}//end of catch
		}

	}

	public void RenameFile5()throws IOException
	{

		File f2=new File("EmployeeLog1.txt");

		if(f2.exists())
		{
			try
		{
			File fl=new File("EmployeeLog.txt");
			fl.delete();

			FileWriter fw=new FileWriter("EmployeeLog.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);

			FileReader fr=new FileReader("EmployeeLog1.txt");
			BufferedReader br=new BufferedReader(fr);

			String RD;

			while((RD=br.readLine())!=null)
			{
				pw.println(RD);
			}
			pw.close();
			bw.close();
			br.close();

			File fl2=new File("EmployeeLog1.txt");
			fl2.delete();

			//System.out.println("Reference: Completion of task of functon RenameFile4()");
		}//end of try

		catch(Exception e)
		{
			System.out.println("Unable to rename!");
		}//end of catch
		}

	}

	public void RenameFile6()throws IOException
	{
		try
		{
			File fl=new File("EmpID.txt");
			fl.delete();

			FileWriter fw=new FileWriter("EmpID.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);

			FileReader fr=new FileReader("EmpID1.txt");
			BufferedReader br=new BufferedReader(fr);

			String RD;

			while((RD=br.readLine())!=null)
			{
				pw.println(RD);
			}
			pw.close();
			bw.close();
			br.close();

			File fl2=new File("EmpID1.txt");
			fl2.delete();

		}//end of try

		catch(Exception e)
		{

		}//end of catch
	}

	public void DateAndTime()//to get date and time
	{

		/*the function uses class Calendar which is
		 *in java library used to calculate the number of duration
		 *elapsed in b/w 2 dates and time
		 *
		 *This function is also used to get the GMT date and time
		 *prom a PC*/
		Calendar cal=new GregorianCalendar();

		month=cal.get(Calendar.MONTH);
		month=month+1;
		year=cal.get(Calendar.YEAR);
		day=cal.get(Calendar.DAY_OF_MONTH);

		hour=cal.get(Calendar.HOUR);
		//System.out.println("hr:"+hour);

		minute=cal.get(Calendar.MINUTE);

		if(cal.get(Calendar.AM_PM)==0)
		{
			//System.out.println("am");
		}
		else
		{
			//System.out.println("pm");
			hour=hour+12;
		}

		Sday=day+"";
		Smonth=month+"";
		if(day<9)
		{
			Sday="0"+day;
		}

		if((month)<10)
		{
			Smonth="0"+(month);
		}


		D=Sday+"/"+Smonth+"/"+year;
		DCI="Checkin Date:"+D;
		DCO="Checkout Date:"+D;
		DJI="Date Of Joining In:"+D;
		DOQ="Date Of Quiting:"+D;

		Shour=hour+"";
		Sminute=minute+"";
		if(hour<10)
		{
			Shour="0"+hour;
		}


		String Sminute=minute+"";
		if(minute<10)
		{
			Sminute="0"+Sminute;
		}

		T=Shour+":"+Sminute+" ";
		TCI="Checkin Time: "+T;
		TCO="Checkout Time: "+T;
	}

	public void AddCheckOutDate()throws IOException//to add checkout date to the file(LOG)
	{
		try
		{
			File fl=new File("HotelLog.txt");


			if(fl.exists())
			{
				FileReader fr=new FileReader("HotelLog.txt");
				BufferedReader br=new BufferedReader(fr);

				FileWriter fw=new FileWriter("HotelLog1.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter pw=new PrintWriter(bw);

				String RD;
				ch=0;
				lnNo=0;
				myobj.DateAndTime();
				while((RD=br.readLine())!=null&&ch==0)
				{


					pw.println(RD);


					String rmnoS="Room Number="+CORoomNo;

					//System.out.println("REFF:"+rmnoS);
					if(RD.compareTo(rmnoS)==0)
					{
						//System.out.println("ENTERED");
						for(i=0;i<7;i++)
						{
							RD=br.readLine();

								try
								{
									subString2=RD.substring(0,12);

									//System.out.println("SS2=:"+subString2);
								}
								catch(Exception e)
								{

								}

								try
								{
									subString3=RD.substring(0,6);
									//System.out.println("SS3=:"+subString3);

								}

								catch(Exception e)
								{

								}

								if(subString2.compareTo("Checkin Date")==0)
								{
									CKINDATE=RD;
									//System.out.println("CKINDATE="+CKINDATE);
								}

								if(subString2.compareTo("Checkin Time")==0)
								{
									CKINTIME=RD;
									//System.out.println("CKITIME="+CKINTIME);
								}
								if(subString3.compareTo("No. Of")==0)
								{
									NOC2=RD;
									//System.out.println("NOC="+NOC2);
									subString9=NOC2.substring(17,18);
									//System.out.println("nocint="+subString9);
								}
							pw.println(RD);

							//System.out.println("Reference chek-line:"+RD);

						}//for
						RD=br.readLine();

						//System.out.println("READ");

						try
						{
							subString=RD.substring(0,13);
							//System.out.println("READ2");
							//System.out.println("Referece substring"+subString);

							if(subString.compareTo("Checkout Date")==0)
							{
								ch=0;
								pw.println(RD);
							}



						}
						catch(Exception e)
						{
							pw.println(DCO);
								pw.println(TCO);

								while((RD=br.readLine())!=null)
								{
									pw.println(RD);
								}//while

								ch=1;
						}
						System.out.println("CH:"+ch);



					}//if


				}//while


				br.close();
				bw.close();
				pw.close();

			}
			else
			{
				System.out.println("Sorry Log File Not Found");
			}
		}
		catch(Exception e)
		{

		}

	}//end of add checkout date to the file(LOG)

	public void DurationOfStay()throws IOException//to calculate duration of stay
	{
		myobj.DateAndTime();

		subString4=CKINDATE.substring(13,15);
		//System.out.println("Suubstring4="+subString4);

		subString5=CKINDATE.substring(16,18);
		//System.out.println("Suubstring5="+subString5);

		subString6=CKINDATE.substring(19,23);
		//System.out.println("Suubstring6="+subString6);

		day2=Integer.parseInt(subString4);
		month2=Integer.parseInt(subString5);
		year2=Integer.parseInt(subString6);

		subString7=CKINTIME.substring(14,16);
		//System.out.println("Suubstring6="+subString7);

		subString8=CKINTIME.substring(17,19);
		//System.out.println("Suubstring7="+subString8);

		minute2=Integer.parseInt(subString8);
		hour2=Integer.parseInt(subString7);


		//following code calculates difference between 2 dayes i.e, calculate the duration of stay
		Calendar cal1=Calendar.getInstance();
		Calendar cal2=Calendar.getInstance();


		cal1.set(year2,month2,day2);
		cal2.set(year,(month+1),day);

		long milliseconds1=cal1.getTimeInMillis();
		long milliseconds2=cal2.getTimeInMillis();

		System.out.println("mill1="+milliseconds1);
		System.out.println("mill2="+milliseconds2);

		long diff=milliseconds2-milliseconds1;
		days=diff/(1000*24*60*60);
		long hours=diff/(60*60*1000);

		if(hour>hour2)
		{
			days=days+1;
		}

		if(hour==hour2)
		{
			if(minute>minute2)
			{
				days=days+1;
			}
		}


		if(days==0)//minimum cost of stay
		{
			days=days+1;
		}

		//System.out.println("hrs="+hours);
		System.out.println("Duration Of Stay="+days);
	}//end of to calculate duration of stay

	public void CostOfStay()throws IOException//to calculate the amount according to duration of stay
	{
		/*This function calculate the duration and the cost that customer has to pay*/
		//CORoomNo;
		int STOINT=Integer.parseInt(subString9);

		if(CORoomNo>=101&&CORoomNo<=210)
		{
			tempBill=1000;
			if(STOINT==2)
			{
				tempBill=tempBill+500;
			}

			if(STOINT==3)
			{
				tempBill=tempBill+1000;
			}
		}

		if(CORoomNo>=301&&CORoomNo<=410)
		{
			tempBill=1300;
			if(STOINT==2)
			{
				tempBill=tempBill+500;
			}

			if(STOINT==3)
			{
				tempBill=tempBill+1000;
			}
		}

		if(CORoomNo>=501&&CORoomNo<=610)
		{
			tempBill=1500;
			if(STOINT==3)
			{
				tempBill=tempBill+500;
			}

			if(STOINT==4)
			{
				tempBill=tempBill+1000;
			}
		}

		if(CORoomNo>=501&&CORoomNo<=610)
		{
			tempBill=1800;
			if(STOINT==3)
			{
				tempBill=tempBill+500;
			}

			if(STOINT==4)
			{
				tempBill=tempBill+1000;
			}
		}

		if(CORoomNo>=501&&CORoomNo<=610)
		{
			tempBill=2500;
			if(STOINT==4)
			{
				tempBill=tempBill+500;
			}

			if(STOINT==5)
			{
				tempBill=tempBill+1000;
			}
		}

	}

	public void TotalCost()throws IOException
	{
		myobj.DurationOfStay();
		myobj.CostOfStay();

		Bill=tempBill*days;
		System.out.println("Total Cost of Stay is Rs"+Bill);
	}

	public void Administration()throws IOException
	{
		myobj.Positions();
		myobj.EmployeeLog();
		System.out.println("");

		while(true)
		{
			System.out.println("Please Enter One Of Your Option");
			System.out.println("");
			System.out.println("Please Enter 1 to add Employee");
			System.out.println("Please Enter 2 to delete Employee");
			System.out.println("Please Enter 3 to check for the Status Of Employee");
			System.out.println("Please Enter 4 to check vacant positions");
			System.out.println("Please Enter 5 to exit administration");
			try
			{
				ch=Integer.parseInt(obj.readLine());
				break;
			}//try
			catch(Exception e)
			{
				System.out.println("Invalid entry");
			}//catch

		}

		switch(ch)
		{
			case 1: myobj.AcceptEmployee();
					break;

			case 2:myobj.deleteEmployee();
					break;

			case 3:myobj.EmployeeStatus();
					break;

			case 4:myobj.PositionAvailable();
					break;

			case 5: break;

			default: System.out.println("Re enter your option");
		}//switch

	}

	public void EmployeeLog()throws IOException
	{
		/*function similar to customer log but for employee*/
		File fl=new File("EmployeeLog.txt");

		if(fl.exists())
		{

		}
		else
		{
			try
			{

				FileWriter fw=new FileWriter("EmployeeLog.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter pw=new PrintWriter(bw);

				bw.close();
				pw.close();
			}
			catch(Exception e)
			{

			}
		}
	}

	public void AcceptEmployee()throws IOException
	{
		myobj.name();
		myobj.ContactNumbers();
		myobj.Age();
		myobj.Adress();

		if(age>=18&&age<61)
		{
			myobj.AcceptPositions();
		}
		else
			System.out.println("Sorry Child labour and overaged employees not allowed!!");

	}

	public void PositionAvailable()throws IOException
	{
		/*function shows all available positions*/
		try
		{
			FileReader fr=new FileReader("Positions.txt");
			BufferedReader br=new BufferedReader(fr);

			String RD;
			int length;

			while((RD=br.readLine())!=null)
			{
				length=RD.length();

				//System.out.println(RD.substring((length-5),(length-3)));
				//System.out.println(RD.substring((length-2),(length)));

				if((Integer.parseInt(RD.substring((length-5),(length-3))))<(Integer.parseInt(RD.substring((length-2),(length)))))
				{
					System.out.println(RD.substring(0,(length-6)));
				}

				RD=br.readLine();
			}

			System.out.println("");
			System.out.println("");
		}
		catch(Exception e)
		{
			System.out.println("File not Found");
		}
	}

	public void Positions()throws IOException
	{
		File fl=new File("Positions.txt");

		if(fl.exists())
		{

		}

		else
		{

			FileWriter fw=new FileWriter("Positions.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);

			pw.println("General Manager:00/01");
			pw.println("");
			pw.println("Assistant Manager:00/04");
			pw.println("");
			pw.println("Adminstrative Supervisors:00/05");
			pw.println("");
			pw.println("Assistant Supervisors:00/10");
			pw.println("");
			pw.println("Clerks:00/05");
			pw.println("");
			pw.println("Receptionist:00/03");
			pw.println("");
			pw.println("Head Waiters:00/10");
			pw.println("");
			pw.println("Waiters:00/50");
			pw.println("");
			pw.println("Cleaner:00/50");
			pw.println("");
			pw.println("Floor Heads:00/10");
			pw.println("");
			pw.println("Hotel Chef:00/10");
			pw.println("");
			pw.println("Hotel Head Security Gaurd:00/01");
			pw.println("");
			pw.println("Hotel Security Gaurd:00/40");
			pw.println("");
			pw.println("Hotel Garderner:00/30");
			pw.println("");
			pw.println("Hotel Electrician:00/02");
			pw.println("");
			pw.println("Hotel Carpenter:00/01");

			bw.close();
			pw.close();
		}
	}

	public void EmployeeID()throws IOException
	{
		try
		{
			File fl=new File("EmpID.txt");

			if(fl.exists())
			{

			}

			else
			{

				FileWriter fw=new FileWriter("EmpID.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter pw=new PrintWriter(bw);

				pw.println("0");
				tempS=1;
				bw.close();
				pw.close();
			}


			FileWriter fw1=new FileWriter("EmpID1.txt");
			BufferedWriter bw1=new BufferedWriter(fw1);
			PrintWriter pw1=new PrintWriter(bw1);

			FileReader fr=new FileReader("EmpID.txt");
			BufferedReader br=new BufferedReader(fr);

			String RD;

			RD=br.readLine();
			{
					tempS=Integer.parseInt(RD);
					tempS=tempS+1;

					pw1.println(tempS);
					System.out.println("Employee ID:"+tempS);
			}

			bw1.close();
			pw1.close();
			br.close();


		}

		catch(Exception e)
		{

		}
	}

	public void AcceptPositions()throws IOException
	{

		ck2=0;

		while(ck2==0)
		{
			ck=0;
			ck5=0;
			while(ck==0)
			{

				System.out.println("Enter the below no. for the desired Postion");
				System.out.println("");
				System.out.println("Enter 1  for General Manager");
				System.out.println("Enter 2  for Assistant Manager");
				System.out.println("Enter 3  for Adminstrative Supervisor");
				System.out.println("Enter 4  for Assistant Supervisor");
				System.out.println("Enter 5  for Clerk");
				System.out.println("Enter 6  for Receptionist");
				System.out.println("Enter 7  for Head Waiter");
				System.out.println("Enter 8  for Waiter");
				System.out.println("Enter 9  for Cleaner");
				System.out.println("Enter 10 for Floor Head");
				System.out.println("Enter 11 for Hotel Chef");
				System.out.println("Enter 12 for Hotel Head Security Gaurd");
				System.out.println("Enter 13 for Hotel Security Gaurd");
				System.out.println("Enter 14 for Hotel Garderner");
				System.out.println("Enter 15 for Hotel Electrician");
				System.out.println("Enter 16 for Hotel Carpenter");
				System.out.println("Enter 0 to EXIT this menu");

				try
				{
					ch=Integer.parseInt(obj.readLine());
					//System.out.println(ch);
					if(ch>=0&&ch<=16)
					{
						ck=1;
					    //System.out.println("CK1:"+ck);
					}

				}//try
				catch(Exception e)
				{
					System.out.println("Invalid entry Enter again");
				}//catch

			}//while
			ck=0;
			//myobj.Positions();
			switch(ch)
			{
				case 1:
						myobj.FileEditorForAcceptEmployeePosition("General Manager");
						break;

				case 2:
						myobj.FileEditorForAcceptEmployeePosition("Assistant Manager");
						break;

				case 3:
						myobj.FileEditorForAcceptEmployeePosition("Adminstrative Supervisors");
						break;

				case 4:
						myobj.FileEditorForAcceptEmployeePosition("Assistant Supervisors");
						break;

				case 5:
						myobj.FileEditorForAcceptEmployeePosition("Clerks");
						break;

				case 6:
						myobj.FileEditorForAcceptEmployeePosition("Receptionist");
						break;

				case 7:
						myobj.FileEditorForAcceptEmployeePosition("Head Waiters");
						break;

				case 8:
						myobj.FileEditorForAcceptEmployeePosition("Waiters");
						break;

				case 9:
						myobj.FileEditorForAcceptEmployeePosition("Cleaner");
						break;

				case 10:
						myobj.FileEditorForAcceptEmployeePosition("Floor Heads");
						break;

				case 11:
						myobj.FileEditorForAcceptEmployeePosition("Hotel Chef");
						break;

				case 12:
						myobj.FileEditorForAcceptEmployeePosition("Hotel Head Security Gaurd");
						break;

				case 13:
						myobj.FileEditorForAcceptEmployeePosition("Hotel Security Gaurd");
						break;

				case 14:
						myobj.FileEditorForAcceptEmployeePosition("Hotel Garderner");
						break;

				case 15:
						myobj.FileEditorForAcceptEmployeePosition("Hotel Electrician");
						break;

				case 16:
						myobj.FileEditorForAcceptEmployeePosition("Hotel Carpenter");
						break;


				case 0:ck2=1;
					break;
			}//switch
		}
	}

	public void FileEditorForAcceptEmployeePosition(String AccPos)throws IOException
	{	//File "Position.txt is already created"
		AccPos2=AccPos;
		//System.out.println(AccPos2);
		try
		{
			FileReader fr=new FileReader("Positions.txt");
			BufferedReader br=new BufferedReader(fr);

			FileWriter fw=new FileWriter("Positions1.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);

			String RD;
			ck5=0;
			int length;
			System.out.println("");
			System.out.println("");
			while((RD=br.readLine())!=null&&ck5==0)
			{

				//System.out.println("reading");
				length=RD.length();
				if(RD!=null)
				{
					//System.out.println("Entered not null");
					ch2="";
					try
					{
						//System.out.println("RD"+RD.substring(0,(length-6)));
						if((RD.substring(0,(length-6))).compareTo(AccPos2)==0)
						{
							//System.out.println(Integer.parseInt(RD.substring((length-2),(length))));
							if((Integer.parseInt(RD.substring((length-5),(length-3))))==(Integer.parseInt(RD.substring((length-2),(length)))))
							{
								System.out.println("Sorry the position is full");
								//temp
								pw.println(RD);
								while((RD=br.readLine())!=null)
								{
									pw.println(RD);
								}
								br.close();
								pw.close();
								bw.close();
								myobj.RenameFile4();

								System.out.println("So  you want to try for other position?");

								ck4=0;
								while(ck4==0)
								{
									System.out.println("Enter 'y' for yes and 'n' for no.");
									ch2=obj.readLine();
									if(ch2.equalsIgnoreCase("y"))//if food is required
									{
										ck2=0;
										ck4=1;
									}//if
									else if(ch2.equalsIgnoreCase("n"))
									{
										ck2=1;
										ck4=1;
									}
									else
									{
										System.out.println("invalid Entry!!!!!!Enter again");
										ck4=0;
									}

								}
							}
							else
							{
								ck2=1;
								pw.print(RD.substring(0,(length-5)));
								temp=(Integer.parseInt(RD.substring((length-5),(length-3))))+1;
								tempS2=""+temp;
								int length2=tempS2.length();
								if(length2==1)
								{
									pw.print("0"+temp);
									pw.println(RD.substring((length-3),(length)));
									while((RD=br.readLine())!=null)
									{
										pw.println(RD);
									}
									br.close();
									pw.close();
									bw.close();
								}
								if(length2==2)
								{
									pw.println(temp);
									pw.println(RD.substring((length-3),(length)));
									while((RD=br.readLine())!=null)
									{
										pw.println(RD);

									}
									br.close();
									pw.close();
									bw.close();
								}
								myobj.RenameFile4();

								System.out.println();
								System.out.println("Name:"+name);
								System.out.println("Age:"+age);
								System.out.println("Position: "+AccPos2);

								myobj.DateAndTime();
								myobj.EmployeeID();
								myobj.PutInDataOfEmployee();
								myobj.RenameFile6();
								myobj.RenameFile5();
							}
						}
						else
						{
							pw.println(RD);
						}

					}
					catch(Exception e)
					{
						pw.println("");
					}


				}
			}

			pw.close();
			bw.close();
			br.close();


		}
			catch(FileNotFoundException e)
			{
				ck=1;
				ck5=1;
				System.out.println("Sorry File Not Found");
				ck2=1;
			}
			catch(Exception e)
			{
				ck=1;
				ck5=1;
				ck2=1;
			}
			if(ch2.equalsIgnoreCase("y"))
			{
				ck2=0;
			}
	}

	public void RoomAvailability()throws IOException
	{
		try
		{
			FileReader fr=new FileReader("ProjectRooms.txt");
			BufferedReader br=new BufferedReader(fr);

			ctr=0;
			String RD;
			System.out.println("The free rooms available are");

				for(int a=101;a<=110;a++)
				{
					RD=br.readLine();
					String sb=a+":E";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}

				}
				for(int a=201;a<=210;a++)
				{
					RD=br.readLine();
					String sb=a+":E";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}
				for(int a=301;a<=310;a++)
				{
					RD=br.readLine();
					String sb=a+":E";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}

				for(int a=401;a<=410;a++)
				{
					RD=br.readLine();
					String sb=a+":E";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}

				for(int a=501;a<=508;a++)
				{
					RD=br.readLine();
					String sb=a+":E";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}

				for(int a=601;a<=608;a++)
				{
					RD=br.readLine();
					String sb=a+":E";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}

				for(int a=701;a<=708;a++)
				{
					RD=br.readLine();
					String sb=a+":E";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}

				for(int a=801;a<=808;a++)
				{
					RD=br.readLine();
					String sb=a+":E";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}

				for(int a=901;a<=906;a++)
				{
					RD=br.readLine();
					String sb=a+":E";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}

				for(int a=1001;a<=1006;a++)
				{
					RD=br.readLine();
					String sb=a+":E";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}

				System.out.println("Total Empty Rooms:"+ctr
				);
		}
		catch(Exception e)
		{
			System.out.println("File Handling Room Details Not Found");
		}
	}

	public void ShowAllOccupiedRooms()throws IOException
	{
		try
		{
			FileReader fr=new FileReader("ProjectRooms.txt");
			BufferedReader br=new BufferedReader(fr);

			String RD;
			ctr=0;
			System.out.println("The rooms that are occupied are");

				for(int a=101;a<=110;a++)
				{
					RD=br.readLine();
					String sb=a+":O";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}

				}
				for(int a=201;a<=210;a++)
				{
					RD=br.readLine();
					String sb=a+":O";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}
				for(int a=301;a<=310;a++)
				{
					RD=br.readLine();
					String sb=a+":O";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}

				for(int a=401;a<=410;a++)
				{
					RD=br.readLine();
					String sb=a+":O";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}

				for(int a=501;a<=508;a++)
				{
					RD=br.readLine();
					String sb=a+":O";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}

				for(int a=601;a<=608;a++)
				{
					RD=br.readLine();
					String sb=a+":O";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}

				for(int a=701;a<=708;a++)
				{
					RD=br.readLine();
					String sb=a+":O";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}

				for(int a=801;a<=808;a++)
				{
					RD=br.readLine();
					String sb=a+":O";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}

				for(int a=901;a<=906;a++)
				{
					RD=br.readLine();
					String sb=a+":O";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}

				for(int a=1001;a<=1006;a++)
				{
					RD=br.readLine();
					String sb=a+":O";

					if(RD.compareTo(sb)==0)
					{
						ctr++;
						System.out.println(a);
					}
				}
				System.out.println("Total Empty Rooms:"+ctr);
		}
		catch(Exception e)
		{
			System.out.println("File Handling Room Details Not Found");
		}

	}

	public void PutInDataOfEmployee()throws IOException
	{
		try
		{
			File f=new File("EmployeeLog.txt");

				FileWriter fw=new FileWriter("EmployeeLog1.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter pw=new PrintWriter(bw);

				FileReader fr=new FileReader("EmployeeLog.txt");
				BufferedReader br=new BufferedReader(fr);

				String RD;

				while((RD=br.readLine())!=null)
				{
					pw.println(RD);
				}

				pw.println(tempS);
				pw.println("Name:"+name);

				pw.println("Contact No.(residence):"+SresNo);
				pw.println("Contact No.(Mobile):"+SmobNo);
				pw.println("Age:"+age);
				pw.println("adress:"+adress);
				pw.println("Position:"+AccPos2);
				pw.println(DJI);
				pw.println();
				pw.println();

				br.close();
				bw.close();
				pw.close();


		}//end of try
		catch(Exception e)
		{

		}//end of catch
	}

	public void deleteEmployee()throws IOException
	{
		myobj.DateAndTime();
		System.out.println("Please Enter Employee ID");
		chk1=0;
		while(chk1==0)
		{
			try
			{
				EIDQ=Integer.parseInt(obj.readLine());

				try
				{
					FileReader fr=new FileReader("EmpID.txt");
					BufferedReader br=new BufferedReader(fr);

					String RD=br.readLine();
					RD=RD.trim();
					if((Integer.parseInt(RD))>=EIDQ)
					{
						chk1=1;
					}
					else if((Integer.parseInt(RD))<EIDQ)
					{

						System.out.println("Invalid Entry");
						System.out.println();
						System.out.println("Enter 1 to Re-Enter");
						System.out.println("Enter 2 to exit");

						chk2=0;
						while(chk2==0)
						{
							try
							{
								StempOpt=obj.readLine();
								tempOpt=Integer.parseInt(StempOpt);

								if(tempOpt==1)
								{
									System.out.println("Re-Enter");
									chk2=1;
									chk1=0;
								}
								else if(tempOpt==2)
								{
									chk1=3;
									chk2=2;
								}

								else
								{
									System.out.println("Re-Enter");
								}
							}
							catch(NumberFormatException x)
							{
								System.out.println("Re-enter");
							}
						}

					}
					br.close();
					//fr.close();
				}
				catch(FileNotFoundException f)
				{
					System.out.println("Sorry for Inconvenince");
					System.out.println("File missing(may be there are no employees)");
					chk1=3;
				}
				catch(Exception e)
				{
					System.err.println(e);
				}
			}
			catch(NumberFormatException x)
			{
				System.out.println("Please Enter Valid Employee ID");
			}
		}

		if(chk1==3)
		{

		}

		else
		{
			try
			{
				FileReader fr=new FileReader("EmployeeLog.txt");
				BufferedReader br=new BufferedReader(fr);

				FileWriter fw=new FileWriter("EmployeeLog1.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				PrintWriter pw=new PrintWriter(bw);
				chk1=0;
				String RD;
				while((((RD=br.readLine())!=null))&&chk1==0)
				{
					try
					{
						if((Integer.parseInt(RD))==EIDQ)
						{
							chk1=1;
						}
						pw.println(RD);
						//System.out.println("ck0:"+RD);
						RD=br.readLine();
						pw.println(RD);
						RD=br.readLine();
						pw.println(RD);
					}
					catch(Exception e)
					{
						pw.println(RD);
					}

				}

				if(chk1==1)
				{


					try
					{
						pw.println(RD);
						for(i=0;i<4;i++)
						{
							RD=br.readLine();
							pw.println(RD);

							//System.out.println("CHK:"+RD);
						}
						SS20=br.readLine();;
						System.out.println("SS20:"+SS20);

						try
						{
							SS21=SS20.substring(0,16);
							System.out.println("SS21:"+SS21);

							if(SS21.equals("Date Of Quiting:"))
							{

								pw.println(SS20);
								System.out.println("Unable to delete as Eployee already Deleted");

								while((RD=br.readLine())!=null)
								{
									pw.println(RD);
								}
							}
						}
						catch(Exception e)
						{
							pw.println(DOQ);
							pw.println();
							while((RD=br.readLine())!=null)
							{
								pw.println(RD);
							}
						}

					}
					catch(NullPointerException n)
					{
						pw.println(DOQ);

						while((RD=br.readLine())!=null)
						{
							pw.println(RD);
						}
					}
					catch(Exception e)
					{
						pw.println(DOQ);
					}


					while((RD=br.readLine())!=null)
					{
						pw.println(RD);
					}

				}

				pw.close();
				bw.close();
				br.close();
			}
			catch(Exception e)
			{
				System.err.println(e);
			}
			myobj.RenameFile5();
		}

	}

	public void EmployeeStatus()throws IOException
	{
		System.out.println("Please Enter Employee ID");
		chk1=0;
		while(chk1==0)
		{
			try
			{
				EIDQ=Integer.parseInt(obj.readLine());

				try
				{
					FileReader fr=new FileReader("EmpID.txt");
					BufferedReader br=new BufferedReader(fr);

					FileReader fr1=new FileReader("EmployeeLog.txt");
					BufferedReader br1=new BufferedReader(fr1);

					String RD1=br.readLine();
					String RD="";
					RD1=RD1.trim();

					System.out.println("RD1"+RD1);
					if((Integer.parseInt(RD1))>=EIDQ)
					{
						chk1=1;
						//System.out.println("Entered");
						try
						{
							//System.out.println("Entered2");

							//System.out.println((RD=br1.readLine()));
							//System.out.println((RD=br1.readLine()));

							while((RD=br1.readLine())!=null)
							{
								//System.out.println("Entered3");
								try
								{
									//System.out.println("Entered4");
									if((Integer.parseInt(RD))==EIDQ)
									{
										for(i=0;i<8;i++)
										{
											RD=br1.readLine();
											System.out.println(RD);
										}
										System.out.println();
										System.out.println();
										chk1=1;
									}

								}

								catch(Exception e)
								{

								}

							}


						}
						catch(Exception f)
						{
							System.out.println("Sorry for inconvinience as File is not found:Reason may also be if there are no employees");
						}

					}
					else if((Integer.parseInt(RD1))<EIDQ)
					{

						System.out.println("Invalid Entry");
						System.out.println();
						System.out.println("Enter 1 to Re-Enter");
						System.out.println("Enter 2 to exit");

						chk2=0;
						while(chk2==0)
						{
							try
							{
								StempOpt=obj.readLine();
								tempOpt=Integer.parseInt(StempOpt);

								if(tempOpt==1)
								{
									System.out.println("Re-Enter");
									chk2=1;
									chk1=0;
								}
								else if(tempOpt==2)
								{
									chk1=3;
									chk2=2;
								}

								else
								{
									System.out.println("Re-Enter");
								}
							}
							catch(NumberFormatException x)
							{
								System.out.println("Re-enter");
							}
						}

					}
					br.close();
				//	br.close();
					br1.close();
					//fr.close();
				}
				catch(FileNotFoundException f)
				{
					System.out.println("File missing(may be there are no employees)");
					System.out.println("Sorry for Inconvenince");
					chk1=3;
				}
				catch(Exception e)
				{
					System.err.println(e);
				}
			}
			catch(NumberFormatException x)
			{
				System.out.println("Please Enter Valid Employee ID");
			}
		}
	}

    public static void main(String args[])throws IOException//main
	{

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~WELCOME TO~~~~~~~");
		System.out.println("~~~~~~~~~~SOLITAIRE~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		while(true)
		{

			while(true)
			{

				System.out.println("Welcome");

				System.out.println("Please Enter 1 for checkin");
				System.out.println("Please Enter 2 to check-out");
				System.out.println("Please Enter 3 for facilities(For a day)");
				System.out.println("Please Enter 4 to check for the available rooms");
				System.out.println("Please Enter 5 to check for the occupied rooms");
				System.out.println("Please Enter 6 for Administration Handling");
				System.out.println("Please Enter 7 for Exit");

				try
				{
					ch=Integer.parseInt(obj.readLine());
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
					break;
				}//try
				catch(Exception e)
				{
					System.out.println("Invalid entry");
				}//catch

			}//while
			switch(ch)
			{
				case 1:  System.out.println("~~~~~~~~~~~CHECKIN~~~~~~~~~");
						 myobj.Checkin();
						 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
						 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
						break;

				case 2:
						System.out.println("~~~~~~~~~CHECKOUT~~~~~~~~~~");
						myobj.Checkout();
						System.out.println("~~~~~~~~~THANK YOU~~~~~~~~~");
						System.out.println("~~~~~~~~~VISIT AGAIN~~~~~~~");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
						break;

				case 3:
						System.out.println("~~~~~~~~~FACILITIES~~~~~~~~");
						myobj.facilities();
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
						break;

				case 4:
						System.out.println("~~~~ROOM AVAILABILITY~~~~~");
					    myobj.RoomAvailability();
					    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
					    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
						break;

				case 5:
						System.out.println("~~~~~~OCCUPIED ROOMS~~~~~~");
						myobj.ShowAllOccupiedRooms();
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
						break;

				case 6:
						System.out.println("~~~~~~ADMINISTRATION~~~~~~");
						myobj.Administration();
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
						break;

				case 7:System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
						System.out.println("~~~~~~~!!THANK YOU!!~~~~~~");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
						 System.exit(0);

				default: System.out.println("Re enter your option");
			}//switch
		}//while
	}	//end of main
}//class

/* VARIABLE LIST

Integer variables

 Variables used during loops as a check to execute loop.
check, ck6,ck7,ck5, chk10, chk2, ck2, ck, chk , chk1

 Variables used during storing and calculation of dates and time.
Month, minute, year2, hour2, year, hour, day, day2, minute2, month2, noOfHours,  tempMonth

Variables used for calculation on bill and accepting users choice for facilities.
Long variables
TB, fc , fb, fq, sc, cc, ic, oc, swc, Tfb, tempBill
Days: Variables used to store number of days elapsed.
Bill: Variable to store bill.

String variables

Variables to store part of line of sentence of a file.
subString, subString2, subString3, subString4, subString5, subString6, subString7, subString8, subString9

Variable to store date and time for various things.
D, DCI, DCO, T, TCI, TCO, DJI, DOQ, CKINDATE, CKINTIME

*/