import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class pokemonBattle
	{
		public static void main(String[] args)
		{
			ArrayList<Pokemon> team = new ArrayList<Pokemon>();
				team.add(new Pokemon("Turtwig", "Grass", "Overgrow", 22.5));
				team.add(new Pokemon("Squirtle", "Water", "Torrent", 19.8));
				team.add(new Pokemon("Pikachu", "Electric", "Static", 13.2));
				team.add(new Pokemon("Piplup", "Water", "Torrent", 11.5));
				team.add(new Pokemon("Charizard", "Fire", "Blaze", 199.5));
				
				ArrayList <String> moves = new ArrayList <String>( );
				moves.add("1) Leaf Storm (Grass)");
				moves.add("2) Hydro Pump (Water)");
				moves.add("3) Flamethrower (Fire)");
				moves.add("4) Thunderbolt (Electric)");
				
				Collections.shuffle(team);
				team.get(0);
				System.out.println("Uh oh! A wild " + team.get(0).getName() + " appeared!");
				System.out.println("Go " +team.get(1).getName() + "!");
				System.out.println("Your pokemon is a " + team.get(1).getType() + " type and the wild pokemon is a " + team.get(0).getType() + " type.");
				if(team.get(1).getType() == "Water" && team.get(0).getType() == "Grass")
					{
						System.out.println("The wild pokemon has the type advantage!");
						System.out.println("Select the number of the move you wish to use.");
						for (String m: moves)
							{
								System.out.println(m);
							}
						Scanner userInput = new Scanner(System.in);
						int choice = userInput.nextInt();
						if(choice == 2 || choice == 4)
							{
								System.out.println("It's super effective! The wild " + team.get(0).getName() + " fainted! You win!");
							}
						else if(choice == 1 || choice == 3)
							{
								System.out.println("It's not very effective. The wild pokemon attacked!");
								System.out.println(team.get(1).getName() + " fainted! You lost!");
							}
					}
				else if(team.get(1).getType() == "Water" && team.get(0).getType() == "Fire")
					{
						System.out.println("You have the type advantage!");
						System.out.println("Select the number of the move you wish to use.");
						for (String m: moves)
							{
								System.out.println(m);
							}
						Scanner userInput = new Scanner(System.in);
						int choice = userInput.nextInt();
						if(choice == 2 || choice == 4)
							{
								System.out.println("It's super effective! The wild " + team.get(0).getName() + " fainted! You win!");
							}
						else if(choice == 1 || choice == 3)
							{
								System.out.println("It's not very effective. The wild pokemon attacked!");
								System.out.println(team.get(1).getName() + " fainted! You lost!");
							}
					}
					else if(team.get(1).getType() == "Electric" && team.get(0).getType() == "Fire")
					{
						Scanner userInput = new Scanner(System.in);
						System.out.println("The wild pokemon has the type advantage.");
						System.out.println("Select the number of the move you wish to use.");
						for (String m: moves)
							{
								System.out.println(m);
							}
					}
					else if(team.get(1).getType() == "Electric" && team.get(0).getType() == "Water")
					{
						Scanner userInput = new Scanner(System.in);
						System.out.println("You have the type advantage.");
						System.out.println("Select the number of the move you wish to use.");
						for (String m: moves)
							{
								System.out.println(m);
							}
					}
					else if(team.get(1).getType() == "Fire" && team.get(0).getType() == "Water")
						{
							System.out.println("Nobody has the type advantage.");
							System.out.println("Select the number of the move you wish to use.");
							for (String m: moves)
								{
									System.out.println(m);
								}
							Scanner userInput = new Scanner(System.in);
							int choice = userInput.nextInt();
							if(choice == 1 || choice == 4)
								{
									System.out.println("It's super effective! The wild " + team.get(0).getName() + " fainted! You win!");
								}
							else if(choice == 2 || choice == 3)
								{
									System.out.println("It's not very effective. The wild pokemon attacked!");
									System.out.println(team.get(1).getName() + " fainted! You lost!");
								}
						}
					else if(team.get(1).getType() == "Water" && team.get(0).getType() == "Water")
						{
							System.out.println("Nobody has the type advantage.");
							System.out.println("Select the number of the move you wish to use.");
							for (String m: moves)
								{
									System.out.println(m);
								}
							Scanner userInput = new Scanner(System.in);
							int choice = userInput.nextInt();
							if(choice == 1 || choice == 4)
								{
									System.out.println("It's super effective! The wild " + team.get(0).getName() + " fainted! You win!");
								}
							else if(choice == 2 || choice == 3)
								{
									System.out.println("It's not very effective. The wild pokemon attacked!");
									System.out.println(team.get(1).getName() + " fainted! You lost!");
								}
						}
					
				
				
		}
		
	}
// \n