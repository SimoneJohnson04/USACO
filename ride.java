/*
ID: simonej1
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride.java {
  public static void main(String[] args) {
		Scanner sc = new Scanner(new File("ride.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		String cometName = sc.nextLine();
		String groupName = sc.nextLine();
		int name = 1;
		int group = 1;
		for(int i = 0; i< cometName.length(); i++){
			name *=cometName.charAt(i);
		}
		for(int i = 0; i< groupName.length(); i++){
			group *= groupName.charAt(i);
		}
		if(name%47 == group%47){
			out.print("GO");
		}
		else{
			out.print("STAY");
		}
		out.close();
  }
}