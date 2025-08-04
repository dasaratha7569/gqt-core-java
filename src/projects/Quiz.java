package projects;
import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ques[]= {"q1","q2","q3","q4","q5","q6","q7","q8","q9","q10"};
		String optio[]= {"A.op1 B.op2 C.op3 D.op4","A.op1 B.op2 C.op3 D.op4","A.op1 B.op2 C.op3 D.op4",
				"A.op1 B.op2 C.op3 D.op4","A.op1 B.op2 C.op3 D.op4","A.op1 B.op2 C.op3 D.op4",
				"A.op1 B.op2 C.op3 D.op4","A.op1 B.op2 C.op3 D.op4","A.op1 B.op2 C.op3 D.op4",
				"A.op1 B.op2 C.op3 D.op4"};
		String options5050[]= {"A.op1 D.op2","A.op1 B.op2","B.op1 C.op2","A.op1 B.op2",
				"B.op1 D.op2","A.op1 B.op2","A.op1 C.op2","A.op1 C.op2","B.op1 D.op2","A.op1 C.op2"};
		int n=ques.length;
		String correoptions[]= {"D","A","C","A","B","A","C","A","B","C"};
		System.out.println("Lets start the quiz...");
		boolean AP=false;
		boolean FF=false;
		int moneyown=0;
		int mu5=0;
		int mu7=0;
		for(int i=0;i<n;i++) {
			System.out.println("Question - "+(i+1));
			System.out.println(ques[i]);
			System.out.println("Select one option among 4 options...");
			System.out.println(optio[i]);
			boolean answered=false;
			while(!answered) {
				System.out.println("\nChoose an option :");
                System.out.println("1. If u know answer then answer the question");
                if (!AP || !FF) {
                	System.out.println("2.if u dont know answer you can Use a lifeline");
                }
                System.out.println("3.or else u can Quit the game");
                System.out.println("choose option: ");
                int o1=sc.nextInt();
                sc.nextLine();
                
                if(o1==1) {
                	System.out.print("Select the option A/B/C/D: ");
        			String ans=sc.next();
        			if (ans.equalsIgnoreCase(correoptions[i])) {
        			    System.out.println("\u001B[32mCorrect!\u001B[0m"); 
        			    if(i<=4) {
        			    	moneyown+=10000;
        			    	if(i==4) {
        			    		mu5=moneyown;
        			    	}
        			    } else if(i<=6){
        			    	moneyown+=10000;
        			    	if(i==6) {
        			    		mu7=moneyown;
        			    	}
        			    }else {
        			    	moneyown+=10000;
        			    }
        			    System.out.println("Your money own upto question "+(i+1)+" is "+moneyown);
        			} else {
        			    System.out.println("\u001B[31mWrong! Correct answer is: " + correoptions[i] + "\u001B[0m"); 
        			    if (i <= 4) {
                            moneyown = 0;
                        } else if (i <= 6) {
                            moneyown = mu5;
                        } else {
                            moneyown = mu7;
                        }
        			    System.out.println("Your money own upto question "+(i+1)+" is " +moneyown);
                        
        			}
        			answered=true;
                } else if(o1==2) {
                	if (AP && FF) {
                        System.out.println(" No lifelines left.");
                    } else {
                        System.out.println("\nAvailable Lifelines:");
                        if (!AP) {
                        	System.out.println("1.  Audience phone");
                        }
                        if (!FF) {
                        	System.out.println("2.  50-50");
                        }

                        System.out.print("Choose a lifeline: ");
                        int lifeline = sc.nextInt();
                        sc.nextLine();

                        if (lifeline == 1 && !AP) {
                        	System.out.println("Audience phone activated..");
                            System.out.print(" Your friend suggests: " );
                            String fso=sc.next();
                            if (fso.equalsIgnoreCase(correoptions[i])) {
                			    System.out.println("\u001B[32mCorrect!\u001B[0m"); 
                			    if(i<=4) {
                			    	moneyown+=10000;
                			    	if(i==4) {
                			    		mu5=moneyown;
                			    	}
                			    } else if(i<=6){
                			    	moneyown+=10000;
                			    	if(i==6) {
                			    		mu7=moneyown;
                			    	}
                			    }else {
                			    	moneyown+=10000;
                			    }
                			    System.out.println("Your money own upto question "+(i+1)+" is "+moneyown);
                			    
                			} else {
                			    System.out.println("\u001B[31mWrong! Correct answer is: " + correoptions[i] + "\u001B[0m"); 
                			    if (i <= 4) {
                                    moneyown = 0;
                                } else if (i <= 6) {
                                    moneyown = mu5;
                                } else {
                                    moneyown = mu7;
                                }
                			    System.out.println("Your money own upto question "+(i+1)+" is " +moneyown);
                			}
                            answered=true;
                            AP = true;
                        } else if (lifeline == 2 && !FF) {
                            System.out.println(" 50-50 activated..");
                            System.out.println("Remaining options: " + options5050[i]);
                            System.out.print("Select the option: ");
                            String ff=sc.next();
                            if (ff.equalsIgnoreCase(correoptions[i])) {
                			    System.out.println("\u001B[32mCorrect!\u001B[0m"); 
                			    if(i<=4) {
                			    	moneyown+=10000;
                			    	if(i==4) {
                			    		mu5=moneyown;
                			    	}
                			    } else if(i<=6){
                			    	moneyown+=10000;
                			    	if(i==6) {
                			    		mu7=moneyown;
                			    	}
                			    }else {
                			    	moneyown+=10000;
                			    }
                			    System.out.println("Your money own upto question "+(i+1)+" is "+moneyown);
                			    
                			} else {
                			    System.out.println("\u001B[31mWrong! Correct answer is: " + correoptions[i] + "\u001B[0m"); 
                			    if (i <= 4) {
                                    moneyown = 0;
                                } else if (i <= 6) {
                                    moneyown = mu5;
                                } else {
                                    moneyown = mu7;
                                }
                			    System.out.println("Your money own upto question "+(i+1)+" is " +moneyown);
                			}
                            answered=true;
                            FF = true;
                        } else {
                            System.out.println(" Lifeline already used...");
                        }
                    }
                }else if (o1 == 3) {
                    System.out.println("You choose to quit.");
                    System.out.println("You take home: ₹" + moneyown);
                    return;
                } else {
                    System.out.println("Invalid input. Try again.");
                }
			}

		}
		System.out.println(" Money you take home: ₹" + moneyown);
		sc.close();
	}

}
