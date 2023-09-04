package DemoProject;

import java.util.Scanner;

class Plane
{
	Scanner sc=new Scanner(System.in);

	public void Pl() 
	{
		System.out.println();
		System.out.println("1. Public Planes");
		System.out.println("2. Private Jet");
		System.out.println("3. Fighter Jet");
	
		int n=sc.nextInt();
		switch (n) 
		{
		case 1: 
			System.out.println("Public Plane");
			PP p=new PP();
			p.PP1();
			break;
			
		case 2:
			System.out.println("Private Jet");
			PJet pj=new PJet();
			pj.PJet1();
			break;
			
		case 3:
			System.out.println("Fighter Jet");
			FJet fj=new FJet();
			fj.FJ();
		break;
		default:
			Pl();
			break;
		}
		
	}
}
//2 level
class PP extends Plane
{
	public void PP1()
	{
		// TODO Auto-generated constructor stub
	System.out.println("public transport");
	System.out.println();
		System.out.println("1. FOR AIRBUS");
		System.out.println("2. FOR BOING");
		int n=sc.nextInt();
		switch(n) 
		{
		case 1:
			System.out.println("                                            Welcome to AirBus ");
			System.out.println();
			System.out.println("Airbus is a global pioneer in the aerospace industry, operating in the commercial aircraft, helicopters, defence and space sectors.");
			System.out.println("Airbus is a leader in designing, manufacturing and delivering aerospace products, services and solutions to customers on a worldwide scale.");
			System.out.println();
			System.out.println("Headquarters: Blagnac, France");
			AirBus ab=new AirBus();
			ab.ab();
			break;
		case 2:
			System.out.println("                                            Welcomew BoIng ");
			System.out.println();
			System.out.println("The Boeing Company is an American multinational corporation that designs, manufactures, ");
			System.out.println("and sells airplanes, rotorcraft, rockets, satellites, telecommunications equipment, and missiles worldwide. The company also provides leasing and product support services.");
			System.out.println();
			System.out.println("Headquarters: Arlington, Virginia, United States");
			BoIng bi=new BoIng();
			bi.BI();
			break;
		
			default:
				Pl();
		}
	}
}
class PJet extends Plane
{
	public void PJet1()
	{
	
	System.out.println("It is user for Private Jet");
		System.out.println("1. Embarder");
		System.out.println("2. Bombarder");
		int n=sc.nextInt();
		switch(n) 
		{
		case 1:
			System.out.println(" Embarder");
			
			Emb em=new Emb();
			em.Em();
			break;
		case 2:
			System.out.println("Bombarder");
			BomBer bo=new BomBer();
			bo.BomB();
			break;
		
			default:
				Pl();
		}
	}
}
class FJet extends Plane
{
	public  void FJ()
	{
	
	System.out.println("It is user for Private Jet");
		System.out.println("1. Dassault");
		System.out.println("2. Lockhead Martin");
		System.out.println("3. HAL");
		System.out.println("wrong choice press anr no.");
		int n=sc.nextInt();
		switch(n) 
		{
		case 1:
			System.out.println(" Dassault");
			Dass da=new Dass();
			da.Da();
			break;
		case 2:
			System.out.println("Lockhead Martin");
			LockM Lo=new LockM();
			Lo.LM();
			break;
		case 3:
			System.out.println("HAL");
			HAL ha=new HAL();
			ha.ha();
			break;
			default:
				Pl();
		}
	}
}
// 3 level
class AirBus extends PP
{
	public void ab()
	{
		System.out.println("AIRBUS IS FRANCE BASED COMP.");
		System.out.println();
		System.out.print("1.for Cargo     ");
		System.out.println("2.for Public transport");
		System.out.println("Press any no. for Back");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println();
			 CargoAir ca=new CargoAir();
			ca.CA();
			break;
		case 2:
			System.out.println("Welcome to Public transport od AirBus");
			PassAir pa=new PassAir();
			pa.PasAir();
			break;
			default:
				PP1();
		}
		System.out.println("1 for continue");
		System.out.println("Press any no. for exit");
		n=sc.nextInt();
		if(n==1)
		{
			ab();
		}
		else
		{
			System.out.println("thank you");
			System.exit(0);
		}
	}
}
class BoIng extends PP
{
	public void BI()
	{
		System.out.println("BOING IS AMERICAN COMP.");
		System.out.print("1.for Cargo     ");
		System.out.println("2.for Public transport");
		System.out.println("Press any no. for Back");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("CARGO");
			CarBo cb=new CarBo();
			cb.CB();
			break;
		case 2:
			System.out.println("Public transport");
			PassBo pb= new PassBo();
			pb.PB();
			
			break;
			default:
				PP1();
		}
		System.out.println("1 for continue");
		System.out.println("Press any no. for exit");
		n=sc.nextInt();
		if(n==1)
		{
			BI();
		}
		else
		{
			System.out.println("thank you");
			System.exit(0);
		}
	}
}
class Emb extends PJet
{

	public void Em() {
		System.out.println("Embraer S.A. is a Brazilian multinational aerospace corporation. It designs, manufactures, and sells commercial, military, executive, and agricultural aircraft, and also provides aeronautical services");
		System.out.println();
		System.out.println("1.Ember Phenom 300 ");
		System.out.println("2.Legay450");
		System.out.println("2.Legay600");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("                                     INFO OF EMBER PHENOM300");
			System.out.println("The Embraer EMB-505 Phenom 300 is a light business jet designed and produced by the Brazilian aerospace manufacturer Embraer.");
			System.out.println();
			System.out.println("       Length: 15.64 m (51 ft 4 in)");
			System.out.println("       Maximum speed: 822 km/h (534 mph, 444 kn");
			System.out.println("       Engine type: Whitney Canada PW535E turbofan ");
			System.out.println("       Takeoff distance: 2,354 ft (718 m)");
			break;
		case 2:
			System.out.println("                                      INFO OF LEGACY 450");
			System.out.println();
			System.out.println("The Embraer Legacy 450/500 and Praetor 500/600 are a family of mid-size and super mid-size business jets built by Brazilian aircraft manufacturer Embraer.");
			System.out.println();
			System.out.println("       Range: 5,790 km");
			System.out.println("       Unit cost: 18,400,000–18,400,000 USD");
			System.out.println(" 	   Engine type: Turbofan");
			System.out.println("       Cruise speed: 863 km/h");
			System.out.println("       Wingspan: 20 m");
			System.out.println("       Length: 21 m");
			System.out.println("       Top speed: 1,004 km/h");
			
			
		
			break;
		case 3:
			System.out.println("									 INFO OF LEGACY 600");
			System.out.println();
			System.out.println("The Embraer Legacy 600 is a business jet derivative of the Embraer ERJ 145 family of commercial jet aircraft.");
			System.out.println();
			System.out.println("       Range: 6,600 km");
			System.out.println("       Unit cost: 28,400,000–18,400,000 USD");
			System.out.println(" 	   Engine type: Turbofan");
			System.out.println("       Cruise speed: 863 km/h");
			System.out.println("       Wingspan: 21 m");
			System.out.println("       Length: 26 m");
			System.out.println("       Top speed: 1,004 km/h");
			break;
			default:
				PJet1();
		}
		System.out.println("1 for continue");
		System.out.println("Press any no.for exit");
		n=sc.nextInt();
		if(n==1)
		{
			PJet1();
		}
		else
		{
			System.out.println("thank you");
			System.exit(0);
		}
	
	}
	
}
class BomBer extends PJet
{

	public void BomB()
	{
		
		System.out.println("Bomb");
		System.out.println("BOMBER IS AMERICAN COMP.");
		System.out.println("1.Challenger 350 ");
		System.out.println("2.Learjet");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("                                     INFO OF Challenger 350 ");
			System.out.println();
			System.out.println("The  Challenger 350 is a business jet derivative of the  Challenger family of commercial jet aircraft.");
			System.out.println();
			System.out.println("       Range: 6,600 km");
			System.out.println("       Unit cost: 22,400,000–18,350,000 USD");
			System.out.println(" 	   Engine type: Turbofan");
			System.out.println("       Cruise speed: 923 km/h");
			System.out.println("       Wingspan: 25 m");
			System.out.println("       Length: 30 m");
			System.out.println("       Top speed: 1,004 km/h");
			break;
		case 2:
			System.out.println("                                        INFO OF Learjet");
			System.out.println();
			System.out.println("The  Learjet is a business jet derivative of the  Challenger family of commercial jet aircraft.");
			System.out.println();
			System.out.println("       Range: 6,323 km");
			System.out.println("       Unit cost: 19,780,000–18,350,000 USD");
			System.out.println(" 	   Engine type: Turbofan");
			System.out.println("       Cruise speed: 871 km/h");
			System.out.println("       Wingspan: 22 m");
			System.out.println("       Length: 36 m");
			System.out.println("       Top speed: 963 km/h");
			break;
			default:
				PJet1();
		}
		System.out.println("1 for continue");
		System.out.println("press any no. for exit");
		n=sc.nextInt();
		if(n==1)
		{
			PJet1();
		}
		else
		{
			System.out.println("thank you");
			System.exit(0);
		}
	}
}
class Dass extends FJet
{

	public void Da() {
		System.out.println("                                            welcome to Dassault");
		System.out.println();
		System.out.println("Dassault Aviation SA is a French manufacturer of military aircraft and business jets. It was founded in 1929 by Marcel Bloch as Société des Avions Marcel Bloch or ");
		System.out.println();
		System.out.println("          Headquarters: Paris, France");
		System.out.println("1. Rafel");
		System.out.println("2.Miraj2000");
		int n;
		n=sc.nextInt();
		switch (n) {
		case 1: 
				System.out.println("Rafel Info");
				System.out.println();
				System.out.println("The Dassault Rafale is a French twin-engine, canard delta wing, multirole fighter aircraft designed and built by Dassault Aviation.");
				System.out.println();
				System.out.println("       Engines:two Snecma M88 engines");
				System.out.println("       Length: 15.27 m (50 ft 1 in)");
				System.out.println("       Wingspan: 10.90 m (35 ft 9 in)");
				System.out.println("       Height: 5.34 m (17 ft 6 in)");
				System.out.println("	   Wing area: 45.7 m2 (492 sq ft)");
				System.out.println("       Maximum speed: 1,912 km/h (1,188 mph, 1,032 kn) ");
				System.out.println("       Combat range: 1,850 km");
				System.out.println("       Missiles:MBDA Meteor Magic II");
		break;
		case 2:
			System.out.println("Miraj Info");
			System.out.println();
			System.out.println("The Dassault Miraj is a French single-engine, canard delta wing, multirole fighter aircraft designed and built by Dassault Aviation.");
			System.out.println();
			System.out.println("The Dassault Rafale is a French twin-engine, canard delta wing, multirole fighter aircraft designed and built by Dassault Aviation.");
			System.out.println();
			System.out.println("       Engines:single Snecma M88 engines");
			System.out.println("       Length: 19.27 m (54 ft 1 in)");
			System.out.println("       Wingspan: 12.90 m (37 ft 9 in)");
			System.out.println("       Height: 6.34 m (18 ft 6 in)");
			System.out.println("	   Wing area: 45.7 m2 (492 sq ft)");
			System.out.println("       Maximum speed: 1,412 km/h (1,188 mph, 1,032 kn) ");
			System.out.println("       Combat range: 1,450 km");
			System.out.println("       Missiles:MBDA Meteor Magic II");
			
			break;
		default:	
		}
		System.out.println("1 for continue");
		System.out.println("press any no. for exit");
		n=sc.nextInt();
		if(n==1)
		{
			FJ();
		}
		else
		{
			System.out.println("thank you");
			System.exit(0);
		}
	}
}
class LockM extends FJet
{

	public void LM() {
		
		System.out.println("                                    welcome to Lockhead Martin");
		System.out.println();
		System.out.println("The Lockheed Martin Corporation is an American aerospace, arms, defense, information security, and technology corporation with worldwide interests. ");
		System.out.println();
		System.out.println("Headquarters: Bethesda, Maryland, United States");
		System.out.println("1. F16");
		System.out.println("2. F22");
	
		int n;
		n=sc.nextInt();
		switch (n) {
		case 1: 
				System.out.println("                                 F16 Info");
				System.out.println();
				System.out.println("The General Dynamics F-16 Fighting Falcon is an American single-engine supersonic multirole fighter aircraft originally developed by General Dynamics for the United States Air Force.");
				System.out.println();
				System.out.println("       Unit cost: 14,600,000–18,800,000 USD (1998)");
				System.out.println(" 	   Engine types: Turbofan, General Electric F110");
				System.out.println("       Wingspan: 9.96 m");
				System.out.println("       Range: 4,220 km");
				System.out.println("       Height: 6.14 m (18 ft 6 in)");
				System.out.println("	   Wing area: 45.7 m2 (492 sq ft)");
				System.out.println("       Maximum speed: 1,215 km/h (1,188 mph, 1,032 kn) ");
				System.out.println("       Combat range: 1,874 km");
				System.out.println("       Missiles:6 × AIM-9 Sidewinder 6 × AIM-120 AMRAAM");
				
				
				
				break;
		case 2:
			System.out.println("                                F22 Info");
			System.out.println();
			System.out.println("The General Dynamics F-16 Fighting Falcon is an American single-engine supersonic multirole fighter aircraft originally developed by General Dynamics for the United States Air Force.");
			System.out.println();
			System.out.println("       Unit cost: 22,600,000–18,1,510,000 USD (1998)");
			System.out.println(" 	   Engine types: Turbofan, Pratt & Whitney F119");
			System.out.println("       Wingspan: 8.96 m");
			System.out.println("       Range: 4,220 km");
			System.out.println("       Height: 6.14 m (18 ft 6 in)");
			System.out.println("	   Wing area: 45.7 m2 (492 sq ft)");
			System.out.println("       Maximum speed: 2414 km/h (3,456 mph, 1,032 kn) ");
			System.out.println("       Combat range: 2,501 km");
			System.out.println("       Missiles:6 × AIM-9 Sidewinder 6 × AIM-120 AMRAAM");
			
			break;
		default:	
		}
		System.out.println("1 for continue");
		System.out.println("press any no. for exit");
		n=sc.nextInt();
		if(n==1)
		{
			FJ();
		}
		else
		{
			System.out.println("thank you");
			System.exit(0);
		}
		
		
	}
}
class HAL extends FJet
{

	public void ha() {
		
		System.out.println("                                   welcome to HAL");
		System.out.println();
		System.out.println("Hindustan Aeronautics Ltd (HAL) is an aerospace and defense company, owned by the government of India.");
		System.out.println("The company develops, designs, manufactures, and supplies aircraft, helicopters, avionics, and communications equipment for military and civil markets.");
		System.out.println();
		System.out.println("                                   Tejas Info");
		System.out.println();
		System.out.println("he HAL Tejas is an Indian single engine, delta wing, light multirole fighter designed by the Aeronautical Development Agency in collaboration with Aircraft Research and Design Centre of Hindustan Aeronautics Limited for the Indian Air Force and Indian");
		System.out.println();
		System.out.println("       Engine types: Turbofan, General Electric F404\r\n"
				+ "       Unit cost: 31,000,000–31,090,000 USD (2009)\r\n"
				+ "       Top speed: 2,205 km/h\r\n"
				+ "       Manufacturer: Hindustan Aeronautics Limited\r\n"
				+ "       First flight: 4 January 2001\r\n"
				+ "       Weight: 6,500 kg\r\n"
				+ "       Introduced: 2010");
		System.out.println();
		System.out.println();
		
		System.out.println("1 for continue");
		System.out.println("press any no. for exit");
		int n;
		n=sc.nextInt();
		if(n==1)
		{
			FJ();
		}
		else
		{
			System.out.println("thank you");
			System.exit(0);
		}
		
		
	}
}
// 4 level with normal 


class CargoAir extends AirBus 
{

	public void CA() {
		System.out.println("Welcome to AirBus Cargo ");
		System.out.println("WE HAVE 2 AIRCRAFTS IN CARGO SECTION");
		System.out.println();
		System.out.println("                         1.Baluga:  ");
		System.out.println();
		System.out.println("  The Airbus A300-600ST, or Beluga, is a specialised wide-body airliner used to transport aircraft parts and outsize cargoes.");
		System.out.println("  It received the official name of Super Transporter early on; however, the name Beluga, for a whale it resembles, ");		 
		System.out.println("  gained popularity and has since been officially adopted.");
		System.out.println();
		System.out.println("       Engine type: Turbofan");
		System.out.println("       Length: 560 m");
		System.out.println("       Introduced: October 1995");
		System.out.println("       Unit cost: 284,000,000–284,000,000 $ (2013)");
		System.out.println("       First flight: 13 September 1994");
		System.out.println("       Top speed: 864 km/h");
		System.out.println("       Max payload: 150 t (245,000 lb)");
		System.out.println("       Weight: 86,500 kg");


		System.out.println();
		
		System.out.println("===============================================================================================================");
		System.out.println();
		System.out.println("                          2.AirBus a350");
		System.out.println();
		System.out.println("Airbus introduces the A350F - A  large widebody freighter to shape the future of ");
		System.out.println("AIRFREIGHT WITH THE CAPABILITY TO TRANSPORT A CARGO OF SOME 111 TONNES, AROUND 64 VEHICLES.");
		 
		System.out.println("       Engine type: Rolls-Royce Trent XWB	");
		System.out.println("       Length: 480 m");
		System.out.println("       Introduced: 15 January 2015");
		System.out.println("       Unit cost: 184,000,000–240,000,000 $ (2013)");
		System.out.println("       First flight: 13 September 2016");
		System.out.println("       Top speed: 864 km/h");
		System.out.println("       Max payload: 110 t (205,000 lb)");
		System.out.println("       Weight: 86,500 kg");
		System.out.println();
		System.out.println("===============================================================================================================");
	}
}
class PassAir extends AirBus
{

	public void PasAir() {
		System.out.println("Welcome to AirBus Passenger");
		System.out.println();
		System.out.println("                         AirBus a380 Info");
		System.out.println();
		System.out.println("The Airbus A380 is a large wide-body airliner that was developed and produced by Airbus. ");
		System.out.println("It is the world's largest passenger airliner and only full-length double-deck jet airliner.");
		System.out.println();
		System.out.println("       Wingspan: 80 m");
		System.out.println("       Engine types: Rolls-Royce Trent 900, Engine Alliance GP7000");
		System.out.println("       Length: 73 m");
		System.out.println("       Range: 15,200 km");
		System.out.println("       First flight: 27 April 2005");
		System.out.println("       Top speed: 1,185 km/h");
		System.out.println("       Top speed: 1,185 km/h");
		System.out.println("       Cruise speed: 903 km/h");
		
		
		
		System.out.println("===============================================================================================================");
		
		System.out.println("                         Airbus a310 Info");
		System.out.println();
		System.out.println("The Airbus A310 is a wide-body aircraft, designed and manufactured by Airbus Industrie, then a consortium of European aerospace manufacturers.");
		System.out.println("Airbus had identified a demand for an aircraft smaller than the A300, the first twin-jet wide-body.");
		System.out.println();
		System.out.println("       Range: 8,050 km");
		System.out.println("       Engine types: General Electric CF6, Pratt & Whitney PW4000, Pratt & Whitney JT9D");
		System.out.println("       Length: 47 m");
		System.out.println("       Wingspan: 44 m");
		System.out.println("       Introduced: April 1983");
		System.out.println("       First flight: 3 April 1982");
		System.out.println("       Top speed: 901 km/h");
		
		
		
		System.out.println("===============================================================================================================");
	}
} 
class CarBo extends BoIng
{

	public void CB() {
		System.out.println("Welcome to BoIng Cargo");
		System.out.println();
		System.out.println("                             Boeing Dreamlifter");
		System.out.println();
		
		System.out.println("The Boeing 747-400 Large Cargo Freighter is a wide-body cargo aircraft modified extensively ");
		System.out.println("from the Boeing 747-400 airliner.");
		System.out.println();
		System.out.println("       Range: 7,800 km");
		System.out.println("       Length: 72 m");
		System.out.println("       Wingspan: 64 m");
		System.out.println("       Engine type: Pratt & Whitney PW4000");
		System.out.println("       Cruise speed: 878 km/h");
		System.out.println("       Number of seats: 2");
	    System.out.println("       Weight: 180,500 kg");
		
		
	}
}
class PassBo extends BoIng
{

	public void PB() {
		System.out.println("									BoIng 747-8 Info");
		System.out.println();
		System.out.println("The Boeing 747-8 is a wide-body airliner formerly developed by Boeing Commercial Airplanes, and the largest variant of the 747. After introducing the 747-400, Boeing considered larger 747 versions as alternatives to the proposed double-deck Airbus A3XX, later developed as the A380.");
		System.out.println("       Engine type: General Electric GEnx\r\n"
				+ "       Range: 15,000 km\r\n"
				+ "       Wingspan: 68 m\r\n"
				+ "       Length: 76 m\r\n"
				+ "       Number of seats: 410\r\n"
				+ "       Cruise speed: 914 km/h\r\n"
				+ "       First flight: 8 February 2010");
		
		
		System.out.println("===============================================================================================================");
		System.out.println();
		System.out.println("								   BoIng 777 Info");
		System.out.println();
		System.out.println("The Boeing 777, commonly referred to as the Triple Seven, is an American long-range wide-body airliner developed and manufactured by Boeing Commercial Airplanes. It is the world's largest twinjet.");
		System.out.println();
		System.out.println("       First flight: June 12, 1994\r\n"
				+ "       Introduction: June 7, 1995 with United Airlines\r\n"
				+ "		  Manufacturer: Boeing Commercial Airplanes\r\n"
				+ "		  Number built: 1,710 as of June 2023 based on deliveries\r\n"
				+ "		  Primary users: Emirates; United Airlines; Qatar Airways; Air France\r\n"
				+ "		  Produced: 1993–present\r\n"
				+ "		  Variants: Boeing 777X");
		
	}
}
// 4 level with private jet 
class EmbP extends Emb
{
}
class EmbLag extends Emb
{
}
class chall extends BomBer
{
}
class LJet extends BomBer
{
}
class Crj extends BomBer
{
}
// 4 level with fighter jet
class Raf extends Dass
{
}
class Mir extends Dass
{
}
class F16 extends LockM
{
}
class F22 extends LockM
{
}
class Tej extends HAL
{
}
class Hawk extends HAL
{
}


// main

public class Air {
	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println();
		System.out.println("									WELCOME TO AIRSHOW");
		System.out.println();
		System.out.println("                                          ================================================================================");
		System.out.println("                                                               Please Enter Login id and Password");
		login1 ref1 = new Login2();
		ref1.login();
		Plane p=new Plane();
		p.Pl();
	}
}


//CUSTOM EXCEPTION 
class Invalid_Option_Exception extends RuntimeException {
}

class Incorrect_login extends RuntimeException {
}


//ABSTRACTION AND INTERFACE(login eg)

interface login1 {
	void login();
}

class Login2 extends Plane implements login1 {
	public void login() {
		
		System.out.print("Enter Login ID: ");
		int b = sc.nextInt();
	
		System.out.print("Enter Password: ");
		int c = sc.nextInt();
		if (b == 1012 && c == 9503) {
		System.out.println();
			System.out.println("                                                                            welcome");
		} else {
			throw new Incorrect_login();
		}
		

	}
}
