package com.java.lavanya.classes;


import java.util.Scanner;


public class Game {
	int score = 0;
	String gamename;
	String playername;
	int level;
	//time;


	//constructors
	public Game(int score, String gamename, String playername, int level) {
		super();
		this.score = score;
		this.gamename = gamename;
		this.playername = playername;
		this.level = level;
	}

	public Game(int score, String playername, int level) {
		super();
		this.score = score;
		this.playername = playername;
		this.level = level;
	}

	public Game(int score, int level) {
		super();
		this.score = score;
		this.level = level;
	}

	public Game(String playername) {
		super();
		// TODO Auto-generated constructor stub
		this.playername = playername;
	}

	public Game() {
		super();

	}

	//getter and setter methods
	public String getGamename() {
		return gamename;
	}
	public void setGamename(String gamename) {
		this.gamename = gamename;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	Scanner sc=new Scanner(System.in);
	public void startGame(){
		System.out.println("  <<<<<MyGame>>>>>");
		System.out.println("-----------------------");
		System.out.println("PlayerName:"+playername);
		System.out.println("  LEVEL:0    SCORE:0");
		System.out.println();
		System.out.println("*****CONTROL KEYS*****");
		System.out.println("U--->+2 D--->+1 B--->+10");
		System.out.println("    X----->EXIT");
		System.out.println("Do you want to START game");

		String startGame=sc.next();
		if(startGame.equals("YES"))
			playGame();
		else
			System.out.println("*****EXIT*****");

	}
	private void playGame(){
		score=0;
		int level=0;
		int finalScore=0;
		String input = "";
		do{
			System.out.println("Press your key");
			input=sc.next();
			switch(input){
			case "U":
				score+=2;
				break;
			case "D":
				score+=1;
				break;
			case "B":
				score+=10;
				break;
			case "X":
				finalScore+=score;	
				System.out.println("    !!GAME OVER!! ");
				System.out.println("!!!!!CONGRATULATIONS!!!!!");
				System.out.println("  LEVEL:"+level+"    "+"SCORE:"+finalScore);

				return;
			default:
				System.out.println("Invalid Entry");
				break;
			}
			if(score>=100){
				level++;
				finalScore+=score;
				System.out.println("LEVEL:"+level+"    "+"SCORE:"+finalScore);
				System.out.println("!!!!!CONGRATULATIONS!!!!!");
				System.out.println("YOU HAVE REACHED NEXT LEVEL");
				score=0;
			}
		}
		while(input!="X");

	}

}
