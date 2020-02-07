import java.util.*;
public class BattleShip{
	
	private static int[][] player1Map = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
		
	private static int[][] player2Map = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
		
	private static int[][] player1View = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
		
	private static int[][] player2View = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
		
	private static String[] y_cords = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
	
	private static String y_cord_string = "    A  B  C  D  E  F  G  H  I  J";
	
	private static int[] shipValues = {4, 5, 3, 3, 2, 3, 3};
	
	public static void main(String a[]) throws Exception{
		/**
		 * 1 = Battleship(B) 4
		 * 2 = Carrier(C) 5
		 * 3 = Cruser(R) 3
		 * 8 = Cruser(r) 3
		 * 4 = Sub(S) 2
		 * 5 = Destroyer(D) 3
		 * 9 = Destroyer(d) 3
		 * 6 = Empty Slot(View)
		 * 7 = Ship Hit(view)
		 */
		String temp = "";
		
		System.out.println("Player 1 Map\n\n\n\n");
		System.out.println("    A  B  C  D  E  F  G  H  I  J");
		for (int row = 0; row < 10; row++) {
			System.out.print((row + 1) + " ");
			if(row != 9){
					System.out.print(" ");
				}
			for (int column = 0; column < 10; column++) {
				if(player1Map[row][column] == 0)
					temp = " * ";
				else if(player1Map[row][column] == 1)
					temp = " B ";
				else if(player1Map[row][column] == 2)
					temp = " C ";
				else if(player1Map[row][column] == 3)
					temp = " R ";
				else if(player1Map[row][column] == 4)
					temp = " S ";
				else if(player1Map[row][column] == 5)
					temp = " D ";
				else if(player1Map[row][column] == 8)
					temp = " r ";
				else if(player1Map[row][column] == 9)
					temp = " d ";
				else
					temp = "ERROR";
				System.out.print(temp);
            }
            System.out.println();
        }
		
		String temp2 = "";
		
		System.out.println("\n\nPlayer 2 Map\n\n\n\n");
		System.out.println("    A  B  C  D  E  F  G  H  I  J");
		for (int row = 0; row < 10; row++) {
			System.out.print((row + 1) + " ");
			if(row != 9){
					System.out.print(" ");
				}
			for (int column = 0; column < 10; column++) {
				if(player2Map[row][column] == 0)
					temp2 = " * ";
				else if(player2Map[row][column] == 1)
					temp2 = " B ";
				else if(player2Map[row][column] == 2)
					temp2 = " C ";
				else if(player2Map[row][column] == 3)
					temp2 = " R ";
				else if(player2Map[row][column] == 4)
					temp2 = " S ";
				else if(player2Map[row][column] == 5)
					temp2 = " D ";
				else if(player2Map[row][column] == 8)
					temp = " r ";
				else if(player2Map[row][column] == 9)
					temp = " d ";
				else
					temp2 = "ERROR";
				System.out.print(temp2);
            }
            System.out.println();
        }
		
		//printViews();
		Scanner sc = new Scanner(System.in);
      int count = 0; 
      while (count < 7)
      {
         System.out.println("Player 1, where do you want to put your ship of " + shipValues[count] + " spaces?");
         String xx = sc.next();
         int xxx;
         int yy = sc.nextInt();//check
         
         for(int x = 0; x < y_cords.length; x++){
   		   if(y_cords[x].equalsIgnoreCase(xx.toUpperCase())){
   				xxx = x;
       
         System.out.println("Ship oriented down or right?");
         String down = sc.next();
         boolean d;
         if (down.equalsIgnoreCase("down"))
            d = true;
         else
            d = false;
         
        if (d)
          checkDown1(xxx, yy, shipValues[count]);//battlship
         
        else
            checkRight1(xxx, yy, shipValues[count]);
           
    count++;  
   }








		

		boolean gameOn = true;
		int x_index_1 = 0;
		int y_index_1 = 0;
		int x_index_2 = 0;
		int y_index_2 = 0;
		
		while(gameOn){
			try{
				if ((checkGame1() == true) || (checkGame2() == true))
				{
					gameOn = false;
					sc.close();
					break;
				}
				//Player 1
				System.out.println("Player 1: \n\n");
				System.out.print("Enter the X-coordinate: ");
				String y_cord_1 = sc.next();
				
				if(y_cord_string.contains(y_cord_1.toUpperCase())){
					System.out.print("Enter the Y-Coordinate: ");
					int x_cord_1 = sc.nextInt();
					x_index_1 = (x_cord_1 - 1);
					for(int y = 0; y < y_cords.length; y++){
						if(y_cords[y].equalsIgnoreCase(y_cord_1.toUpperCase())){
							y_index_1 = y;
						}
					}
				}
				else{
					System.out.println("Wrong cord, Player 1.");
				}
				
				
				//Player 2
				System.out.println("Player 2: \n\n");
				System.out.print("Enter the X-coordinate: ");
				String y_cord_2 = sc.next();
				
				if(y_cord_string.contains(y_cord_2.toUpperCase())){
					System.out.print("Enter the Y-Coordinate: ");
					int x_cord_2 = sc.nextInt();
					x_index_2 = (x_cord_2 - 1);
					for(int y = 0; y < y_cords.length; y++){
						if(y_cords[y].equalsIgnoreCase(y_cord_2.toUpperCase())){
							y_index_2 = y;
						}
					}
				}
				else{
					System.out.println("Wrong cord, Player 1.");
				}
				
				
				//Checks for Hit or Miss, Player 1.
				if(player2Map[x_index_1][y_index_1] != 0){
					System.out.println("Ship Hit! \n\n\tAt Cords: (" + y_cords[y_index_1] + ", " + (x_index_1 + 1) + ")");
					int s = player2Map[x_index_1][y_index_1];
					player1View[x_index_1][y_index_1] = 7;
					player2Map[x_index_1][y_index_1] = 7;
					if ((checkSunk(s, player2Map)) != -1)
						System.out.println("Ship Sunk!!");
						System.out.println();
					
					
				}
				else if(player2Map[x_index_1][y_index_1] == 0){
					System.out.println("Miss. \n\n\tAt Cords: (" + y_cords[y_index_1] + ", " + (x_index_1 + 1) + ")");
					player1View[x_index_1][y_index_1] = 6;
					
				}
				else{
					System.out.println("Check Skipped!");
				}
				
				
				//Checks for Hit or Miss, Player 2.
				if(player1Map[x_index_2][y_index_2] != 0){
					System.out.println("Ship Hit! \n\n\tAt Cords: (" + y_cords[y_index_2] + ", " + (x_index_2 + 1) + ")");
					int s = player1Map[x_index_1][y_index_1];
					player2View[x_index_2][y_index_2] = 7;
					player1Map[x_index_2][y_index_2] = 7;
					if ((checkSunk(s, player1Map)) != -1)
						System.out.println("Ship Sunk!!");
						System.out.println();
					
				}
				else if(player1Map[x_index_2][y_index_2] == 0){
					System.out.println("Miss. \n\n\tAt Cords: (" + y_cords[y_index_2] + ", " + (x_index_2 + 1) + ")");
					player2View[x_index_2][y_index_2] = 6;
					
				}
				else{
					System.out.println("Check Skipped!");
				}
				
				System.out.println("\n\n\n\n");
				printViews();
				System.out.println("\n\n\n");
			} catch(Exception e){
				System.out.println("An Error has occured.\n\n\n" + e);
			}
		}
		
		
	}
	
	
	public static void printViews(){
		String temp3 = "";
		System.out.println("\n\nPlayer 1 View\n\n\n\n");
		System.out.println(y_cord_string);
		for (int row = 0; row < 10; row++) {
			System.out.print((row + 1) + " ");
			if(row != 9){
					System.out.print(" "); 
				}
			for (int column = 0; column < 10; column++) {
				if(player1View[row][column] == 0)
					temp3 = " * ";
				else if(player1View[row][column] == 1)
					temp3 = " B ";
				else if(player1View[row][column] == 2)
					temp3 = " C ";
				else if(player1View[row][column] == 3)
					temp3 = " R ";
				else if(player1View[row][column] == 4)
					temp3 = " S ";
				else if(player1View[row][column] == 5)
					temp3 = " D ";
				else if(player1View[row][column] == 6)
					temp3 = " O ";
				else if(player1View[row][column] == 7)
					temp3 = " X ";
				else
					temp3 = "ERROR";
				System.out.print(temp3);
		
			}
            System.out.println();
			
        }
		
		
		String temp4 = "";
		
		System.out.println("\n\nPlayer 2 View\n\n\n\n");
		System.out.println("    A  B  C  D  E  F  G  H  I  J");
		for (int row = 0; row < 10; row++) {
			System.out.print((row + 1) + " ");
			if(row != 9){
					System.out.print(" ");
				}
			for (int column = 0; column < 10; column++) {
				if(player2View[row][column] == 0)
					temp4 = " * ";
				else if(player2View[row][column] == 1)
					temp4 = " B ";
				else if(player2View[row][column] == 2)
					temp4 = " C ";
				else if(player2View[row][column] == 3)
					temp4 = " R ";
				else if(player2View[row][column] == 4)
					temp4 = " S ";
				else if(player2View[row][column] == 5)
					temp4 = " D ";
				else if(player2View[row][column] == 6)
					temp4 = " O ";
				else if(player2View[row][column] == 7)
					temp4 = " X ";
				else
					temp4 = "ERROR";
				System.out.print(temp4);
            }
            System.out.println();
		//	checkSunk(row, column);
        }
	}
	
	public static int checkSunk(int s, int[][]a)
	{
		System.out.println(s);
		for (int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				if (a[i][j] == s)
				{
					return -1;
				}
			}
		}
		return s;
		
	}
	public static boolean checkGame1()
	{
		for (int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				if ((player1Map[i][j] != 0)||(player1Map[i][j] != 7))
				{
					return false;
				}
			}
		}
		System.out.println();
		System.out.println("Player 2 wins");
		return true;
		
	}
	public static boolean checkGame2()
	{
		for (int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				if ((player2Map[i][j] != 0)||(player2Map[i][j] != 7))
				{
					return false;
				}
			}
		}
		System.out.println();
		System.out.println("Player 1 wins");
		return true;
		
	}
	
	public static boolean checkDown1(int x, int y, int space)
   {
     if (x >= 0 && x <= 9 && y >= 0 && y <= (10 - space))
      {
           for (int i = yy; i < y - space; i--)
           {
               if (player1Map[xxx][i] != 0)
               {
                   return false;
               }
           }
           return true; 
      }           
      else
      {
         return false;
      }            
   }
   
   public static boolean checkDown2(int x, int y, int space)
   {
     if (x >= 0 && x <= 9 && y >= 0 && y <= (10 - space))
      {
           for (int i = yy; i < y - space; i--)
           {
               if (player2Map[xxx][i] != 0)
               {
                   return false;
               }
           }
           return true; 
      }           
      else
      {
         return false;
      }            
   }
   
   
   
   
   
   
}
