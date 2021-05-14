/*Implemet a menu driven program to register the visitor details for a museum.
 * Visitor class should have a ID, Name, Age, Gneder
 * 1) Register the visitor details ans display all athe vistor details present in the system
 * 2) search visitor details for a given range of age and sort visitor details by name and display 
 * for ex: if input provided is 20 and 30 retieve the visitor details whose age is >=20 and <=30 
 * 3) update age for a given visitir ID and diplsy the visitor details
 * 4)exit
 */
package museum;

import java.util.Scanner;

public class VisitorApp {
	static Scanner sc = new Scanner(System.in);
	static int count = 0;
	
	public static void main(String[] args) {
		int noOfVisitors = 0;
		System.out.println("Enter the no of Visitors");
		noOfVisitors = sc.nextInt();
		Visitor[] visObj = new Visitor[noOfVisitors];
		boolean flag = true;
		int choice = 0;
		do {
			displayMainMenu();
			System.out.println("enter the choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				registerVisitorDetails(visObj, count);
				displayRegisterDetails(visObj);
				break;
			case 2:
				System.out.println("Enter the low age");
				short lowAge = sc.nextShort();
				System.out.println("Enter the high age");
				short highAge = sc.nextShort();
				if ( lowAge <= highAge) {
					Visitor[] resultOfSecondCase = searchByAgeSortByName(visObj,lowAge, highAge);
					
				}
				
								
			}
		}while(choice!=5);
	}
	
	//ask the user for enter the visitor details
	private static Visitor[] registerVisitorDetails(Visitor[] visObj, int visitorDetailCount) {
		for (int i =0 ; i<visObj.length; i++) {
			System.out.println("Enter the Visitor ID");
			int id = sc.nextInt();
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the age");			
			short age = sc.nextShort();
			String gender;
			do {
				System.out.println("Enter the gender");
				gender = sc.nextLine();
			}while(!gender.equals("Male") && !gender.equals("Female") && !gender.equals("Other"));
			
			visObj[visitorDetailCount] = new Visitor(id, name, age, gender);
			visitorDetailCount++;
		}
		return visObj;		
	}
	
	private static void displayRegisterDetails(Visitor[] visObj) {
		for ( int i=0 ; i<visObj.length; i++) {
			System.out.println("Visitors details are"+visObj[i].getId()+" "+visObj[i].getName()+" "+visObj[i].getAge()+" "+visObj[i].getGender());
		}
	}
	
	private static Visitor[] searchByAgeSortByName(Visitor[] visObj, short lowAge, short highAge) {
		int count = getCountOfAge(visObj, lowAge, highAge);	
		//after getting the count of the age, give that to the size of the array
		Visitor[] resultOfAge = new Visitor[count];
		int tempIndex = 0;
		for ( int i=0 ; i<visObj.length; i++) {		
			if ( visObj[i].getAge() >= lowAge && visObj[i].getAge() <= highAge) {
				resultOfAge[tempIndex] = visObj[i];
				tempIndex++;
			}
		}
		Visitor[] resultSortedArrayByName = resultSortByName(resultOfAge);
		return resultSortedArrayByName;
		
	}
	
	private static Visitor[] resultSortByName(Visitor[] resultOfAge) {
		Visitor temp = new Visitor();
		for (int i=0 ; i<resultOfAge.length-1; i++) {
			for ( int j=1; j<resultOfAge.length-i-1; j++) {
				if ( resultOfAge[j].getName().compareTo(resultOfAge[j+1].getName())>0) {
					temp = resultOfAge[j];
					resultOfAge[j] = resultOfAge[j+1];
					resultOfAge[j+1] = temp;
				}
			}
		}
		return resultOfAge;
	}
	
	//Visitor age whose age is matching basically w.r.t given condition
	private static int getCountOfAge(Visitor[] visObj,short lowAge,short highAge) {
		int index = 0;
		for ( int i=0; i<visObj.length; i++) {
			if ( visObj[i].getAge() >= lowAge && visObj[i].getAge() <= highAge) {
				index++;
			}
		}
		return index;
	}
	
	
	private static void displayMainMenu() {
		System.out.println("...........Main Menu......");	
		System.out.println("1.Register the vistor details and display all the visitor details");
		System.out.println("2.search visitors for a givrn range of age and sort vistor details");
		System.out.println("3.Update age for given visitor ID");
		System.out.println("4.Exit");
	}
}
