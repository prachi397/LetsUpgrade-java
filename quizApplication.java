package com.quizapplication;

public class Main {

	public static void main(String[] args) {
		// Quiz application--
		//questions
		//player
		//playground
		Game game = new Game();
		game.initGame();
		game.play();

	}

}
public class Game {
	
	Question[] questions = new Question[3];
	Player player = new Player();
	
	
	public void initGame() {
		//created five objects
		for(int i = 0; i<3; i++) {
			questions[i] = new Question();
			
		}
		//applying values 
		questions[0].question = "Who is the strongest Avenger?";
		questions[0].option1 = "ironman";
		questions[0].option2 = "Thor";
		questions[0].option3 = "Hulk";
		questions[0].option4 = "Scarllet Witch";
		questions[0].correctAns = 2;
		
		questions[1].question = "What is the closest planet to sun?";
		questions[1].option1 = "Earth";
		questions[1].option2 = "Venus";
		questions[1].option3 = "Mercury";
		questions[1].option4 = "Jupiter";
		questions[1].correctAns = 3;
		
		questions[2].question = "What is the capital of australia?";
		questions[2].option1 = "Sydney";
		questions[2].option2 = "Melbourne";
		questions[2].option3 = "Perth";
		questions[2].option4 = "Canberra";
		questions[2].correctAns = 4;
	}
	
	public void play() {
		
		
		
		player.getDetails();
		for(int i=0;i<3;i++) {
			 boolean status = questions[i].askQuestion();
			 if(status == true)
			 {
				 System.out.println("Your answer is correct!!");
				 player.score++;
			 }
			 else {
				 System.out.println("Your answer is wrong!!");
				 player.score=player.score-1;
			 }
		}
		System.out.println(player.name+" your score is "+player.score);
		
	}

}
public class Player {
	Scanner sc = new Scanner(System.in);
	String name;
	int score = 0;
	public void getDetails() {
		
		System.out.println("Enter player name ");
		name = sc.next();
	}

}
public class Question {
	Scanner sc = new Scanner(System.in);
	String question,option1,option2,option3,option4;
	int correctAns,userAns;
	
	public boolean askQuestion() {
		System.out.println(question);
		System.out.println("1. "+option1);
		System.out.println("2. "+option2);
		System.out.println("3. "+option3);
		System.out.println("4. "+option4);
		System.out.println("please choose an answer");
		userAns = sc.nextInt();
		if(userAns == correctAns) {
			return true; //return is always the end of the function
		}
       return false;
	}

}
