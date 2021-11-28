import java.util.*;
class Project{
		
			public static void bestDatabase(String[][] student){
			Scanner input=new  Scanner(System.in);
			clearConsole();
			System.out.print("---------------------------------------------------------------------------------");
			System.out.print("\n|\t\t\tBEST IN DATABASE MANAGEMENT SYSTEM\t\t\t|\n");
			System.out.println("---------------------------------------------------------------------------------\n");
			System.out.println();
				int c=0;
			L1:	for (int i = 0; i < student.length; i++){
				if (student[i][0].equals("0")){
					c=i;
					break L1;
				}else{
					c=-1;
				}	
			}
			if (c!=-1){
						//sorte database marks
						for (int j = 0; j < student.length; j++){
							for (int k = 0; k <student.length-1 ; k++){
									String mark4=student[k][3];
									String mark5=student[k+1][3];
									if (mark4.compareTo(mark5)<0){
									String x1=student[k][0];
									String x2=student[k+1][0];
									student[k][0]=x2;
									student[k+1][0]=x1;
														
									String y1=student[k][1];
									String y2=student[k+1][1];
									student[k][1]=y2;
									student[k+1][1]=y1;
													
									String z1=student[k][3];
									String z2=student[k+1][3];
									student[k][3]=z2;
									student[k+1][3]=z1;
													
									String u1=student[k][2];
									String u2=student[k+1][2];
									student[k][2]=u2;
									student[k+1][3]=u1;
								}
							}								
						}
					L3:	while (true){
							//print table heding
						System.out.println("+---------------+-----------------------+-----------+----------+");
						System.out.println("|ID		|Name			|DBMS Marks |PF Marks  |");
						System.out.println("+---------------+-----------------------+-----------+----------+");
							//check null values & print deatiels
				L2:	for (int m = 0; m < student.length; m++){
							if (student[m][2].equals("0") || student[m][3].equals("0")){
								continue L2;
							}else{
								System.out.println("|"+student[m][0]+"		|"+student[m][1]+"		        |"+student[m][3]+"         |"+student[m][2]+"	       |");
							}
						}
						System.out.println("+---------------+-----------------------+-----------+----------+");
						System.out.println();
						System.out.print("Do you want to go back to main menu? (Y/N)");	
						char leter=input.next().charAt(0);
						if (leter=='Y' || leter=='y'){
							homePage(student);
						}else if (leter=='N' || leter=='n'){
							clearConsole();
							System.out.print("---------------------------------------------------------------------------------");
							System.out.print("\n|\t\t\tBEST IN DATABASE MANAGEMENT SYSTEM\t\t\t|\n");
							System.out.println("---------------------------------------------------------------------------------\n");
							System.out.println();
							continue L3;
						}		
					}
			}				
	}
	
		
		
		public static void bestProgramimg(String[][] student){
			Scanner input=new  Scanner(System.in);
			clearConsole();
			System.out.print("---------------------------------------------------------------------------------");
			System.out.print("\n|\t\t\tBEST IN PROGRAMMING FUNDAMENTALS\t\t\t|\n");
			System.out.println("---------------------------------------------------------------------------------\n");
			System.out.println();
					//sorte programing marks
					int c=0;
			L1:	for (int i = 0; i < student.length; i++){
					if (student[i][0].equals("0")){
						c=i;
						break L1;
					}else{
						c=-1;
						}
				}
				
				if (c!=-1){
					for (int j = 0; j < student.length; j++){
							for (int k = 0; k <student.length-1 ; k++){
									String mark1=student[k][2];
									String mark2=student[k+1][2]; //int mark2=Integer.parseInt(student[k+1][3]);
									if (mark1.compareTo(mark2)<0){
									String x=student[k][0];
									student[k][0]=student[k+1][0];
									student[k+1][0]=x;
														
									String y=student[k][1];
									student[k][1]=student[k+1][1];
									student[k+1][1]=y;
													
									String z=student[k][2];
									student[k][2]=student[k+1][2];
									student[k+1][2]=z;
													
									String u=student[k][3];
									student[k][3]=student[k+1][3];
									student[k+1][3]=u;
								}
							}								
						}
					L3:	while (true){
									//start table  heding
						System.out.println("+---------------+-----------------------+-----------+----------+");
						System.out.println("|ID		|Name			|PF Marks   |DBMS Marks|");
						System.out.println("+---------------+-----------------------+-----------+----------+");
							//checking null values & print data
					L2:	for (int m = 0; m < student.length; m++){
							if (student[m][2].equals("0") || student[m][3].equals("0")){
								continue L2;
							}else{
								System.out.println("|"+student[m][0]+"		|"+student[m][1]+"		        |"+student[m][2]+"         |"+student[m][3]+"	       |");
							}
						}
						System.out.println("+---------------+-----------------------+-----------+----------+");
						System.out.println();
						System.out.print("Do you want to go back to main menu? (Y/N)");	
						char leter=input.next().charAt(0);
						if (leter=='Y' || leter=='y'){
							homePage(student);
						}else if (leter=='N'|| leter=='n'){
							continue L3;
							}
						}
				}		
			}
		
		public static void printStudentRAnk(String[][] student){
			Scanner input=new  Scanner(System.in);
			clearConsole();
			System.out.print("-----------------------------------------------------------------");
			System.out.print("\n|\t\t\tPRINT STUDENS' RANK\t\t\t|\n");
			System.out.println("-----------------------------------------------------------------\n");
			System.out.println();
			int c=0;
			for (int h = 0; h < student.length; h++){
				if (student[h][0].equals("0")){
					c=h;
					break;
				}else{
					c=-1;
				}
			}
			if (c!=-1){
					//find and assign avg
				for (int i = 0; i < student.length; i++){
					int  total=Integer.parseInt(student[i][4]);
					student[i][5]=((double)total/2+"");
				}
						//sorte total
				for (int j = 0; j < student.length; j++){
					for (int k = 0; k <student.length-1 ; k++){
						String total1=student[k][4];
						String total2=student[k+1][4];
						if (total1.compareTo(total2)<0){
							String x=student[k][0];
							student[k][0]=student[k+1][0];
							student[k+1][0]=x;
											
							String y=student[k][1];
							student[k][1]=student[k+1][1];
							student[k+1][1]=y;
										
							String z=student[k][4];
							student[k][4]=student[k+1][4];
							student[k+1][4]=z;
											
							String t=student[k][5];
							student[k][5]=student[k+1][5];
							student[k+1][5]=t;
						}
				}								
			}
		L3:	while (true){
				System.out.println("+-------+---------------+-----------------------+-----------+----------+");
				System.out.println("|Rank	|ID		|Name			|Total Marks|Avg. Marks|");
				System.out.println("+-------+---------------+-----------------------+-----------+----------+");
			L1:	for (int i = 0; i < student.length; i++){
					if (student[i][2].equals("0") || student[i][3].equals("0")){
						continue L1;
					}else{
						//double average=Double.valueOf(student[i][5]);
						System.out.println("|"+(i+1)+"	|"+student[i][0]+"		|"+student[i][1]+"			|"+"	 "+student[i][4]+"|"+"	   "+student[i][5]+"|");
						//System.out.printf("%1s%-5d%-6s%-15s%9s%9.2f%1s%n","|",(i+1),student[i][0],student[i][1],student[i][4],average,"|");
					}
				}
				System.out.println("+-------+---------------+-----------------------+-----------+----------+");
				System.out.println();
				System.out.print("Do you want to go back to main menu? (Y/N)");	
				char leter=input.next().charAt(0);
				if (leter=='Y'||leter=='y'){
					homePage(student);
				}else if(leter=='N'||leter=='n'){
					clearConsole();
					System.out.print("-----------------------------------------------------------------");
					System.out.print("\n|\t\t\tPRINT STUDENS' RANK\t\t\t|\n");
					System.out.println("-----------------------------------------------------------------\n");
					System.out.println();
					continue L3;
				}
			}		
		}					
	}
		
		public  static void printStudentsDeatiels(String[][] student){
			Scanner input=new Scanner(System.in);
			clearConsole();
			System.out.print("-----------------------------------------------------------------");
			System.out.print("\n|\t\t\tPRINT STUDEN DEAILS\t\t\t|\n");
			System.out.println("-----------------------------------------------------------------\n");
			System.out.println();
			
			
	
		L1:	while (true){
				//input name
				System.out.print("Enter Student Id : ");
				String number=input.next();
					//check index type correct
				if (number.indexOf("S")==0){
					int d=0;
				L2:	for (int i = 0; i < student.length; i++){
							//check index
						if (number.equals(student[i][0])){
								d=i;
								break L2;
						}else{
							d=-1;
						}
					}
					if (d!=-1){
							//check is not added mark
							if (student[d][2].equals("0") || student[d][3].equals("0")){
								System.out.println("Student Name : "+student[d][1]);
								System.out.println();
								System.out.println("Marks yet to added.");
								System.out.println();
								System.out.print("Do you want to search another student details? (Y/N) ");
								char leter=input.next().charAt(0);
								if (leter=='Y'||leter=='y'){
									clearConsole();
									System.out.print("-----------------------------------------------------------------------");
									System.out.print("\n|\t\t\tPRINT STUDEN DEAILS\t\t\t|\n");
									System.out.println("-----------------------------------------------------------------\n");
									System.out.println();
									continue L1;
								}else if(leter=='N'||leter=='n'){
									homePage(student);
								}
							}else{
									//display subject marks,total,avg,rank
								System.out.println("Student Name : "+student[d][1]);
								System.out.println("+---------------------------------------+--------------------------+");
								System.out.print("|Programing Fundamentals Marks	 	|			");
								System.out.printf("%3s%1s%n",student[d][2],"|");
								System.out.print("|Database Managment System marks        |			");
								System.out.printf("%3s%1s%n",student[d][3],"|");
								int  total=Integer.parseInt(student[d][4]);
									//fined avg
								double avg=(double)total/2;
								student[d][5]=avg+"";
								System.out.print("|Total Marks   			    	|	           	");
								System.out.printf("%3d%1s%n",total,"|");
								System.out.print("|Avg. Marks				|		     ");
								System.out.printf("%6.2f%1s%n",avg,"|");
								
									//student array sort
								for (int j = 0; j < student.length; j++){
									for (int k = 0; k <student.length-1 ; k++){
										String total1=student[k][4];
										String total2=student[k+1][4];
										if (total1.compareTo(total2)<0){
											String x=student[k][0];
											student[k][0]=student[k+1][0];
											student[k+1][0]=x;
											
											String y=student[k][1];
											student[k][1]=student[k+1][1];
											student[k+1][1]=y;
											
											String z=student[k][2];
											student[k][2]=student[k+1][2];
											student[k+1][2]=z;
											
											String v=student[k][3];
											student[k][3]=student[k+1][3];
											student[k+1][3]=v;
											
											String u=student[k][4];
											student[k][4]=student[k+1][4];
											student[k+1][4]=u;
											
											String t=student[k][5];
											student[k][5]=student[k+1][5];
											student[k+1][5]=t;
										}
									}
									
								}
									//fined rank
								for (int m = 0; m < student.length; m++){
									if (number.equals(student[m][0])){
										if ((m+1)!=student.length){
												//print rank
											switch(m+1){
												case 1 : System.out.println("|Rank					|		   "+(m+1)+"(First)|");break;
												case 2 : System.out.println("|Rank					|		  "+(m+1)+"(Second)|");break;
												case 3 : System.out.println("|Rank					|		   "+(m+1)+"(Third)|");break;
												default : System.out.println("|Rank					|		          "+(m+1)+"|");break;
													}
											}else{
												System.out.println("|Rank					|		"+(m+1)+"(Last)|");break;
											}
										System.out.println("+---------------------------------------+--------------------------+");
										break;
									}
								}

								System.out.println();
								System.out.print("Do you want to search another student deatiels? (Y/N)");
								char leter1=input.next().charAt(0);
								if (leter1=='Y'||leter1=='y'){
									clearConsole();
									System.out.print("-----------------------------------------------------------------");
									System.out.print("\n|\t\t\tPRINT STUDEN DEAILS\t\t\t|\n");
									System.out.println("-----------------------------------------------------------------\n");
									System.out.println();
									continue L1;
								}else if(leter1=='N'||leter1=='n'){
									homePage(student);
								}
							}
					}else{
							System.out.print("Invalid index  number. Do you want to scarch another student deatiels? (Y/N)");
							char leter=input.next().charAt(0);
							System.out.println();
							if (leter=='Y'||leter=='y'){
									clearConsole();
									System.out.print("-----------------------------------------------------------------");
									System.out.print("\n|\t\t\tPRINT STUDEN DEAILS\t\t\t|\n");
									System.out.println("-----------------------------------------------------------------\n");
									System.out.println();
									continue L1;
							}else if(leter=='N'||leter=='n'){
								homePage(student);
							}
					}
						
					
				}else{
					System.out.print("Invalid index  number. Do you want to scarch another student deatiels? (Y/N)");
					char leter=input.next().charAt(0);
					if (leter=='Y'||leter=='y'){
							clearConsole();
							System.out.print("-----------------------------------------------------------------");
							System.out.print("\n|\t\t\tPRINT STUDEN DEAILS\t\t\t|\n");
							System.out.println("-----------------------------------------------------------------\n");								System.out.println();
							continue L1;
					}else if(leter=='N'||leter=='n'){
						homePage(student);
					}
				}
			}
			
		}
		public static void deleteStudents(String[][] student){
			Scanner input=new Scanner(System.in);
			clearConsole();
			System.out.print("-----------------------------------------------------------------");
			System.out.print("\n|\t\t\tDELETE STUDENT\t\t\t\t|\n");
			System.out.println("-----------------------------------------------------------------\n");
			System.out.println();
		
			
		L1:	while(true){
			System.out.print("Enter Studebt ID : ");	
			String number=input.next();
			if (number.indexOf("S")==0){
			int x=0;
		L2:	for (int i = 0; i < student.length; i++){
				if (student[i][0].equals(number)){
					x=i;
					break L2;	
				}else{
					x=-1;
				}
			}
			if (x!=-1){
				for (int j = 0; j < student[0].length; j++){
						student[x][j]="0";
						System.out.println("Student has been delete Succesfully.");
						System.out.print("Do you want to delete anothe student? (Y/N)");
						char leter=input.next().charAt(0);
						System.out.println();
						if (leter=='Y'||leter=='y'){
							clearConsole();
							System.out.print("-----------------------------------------------------------------");
							System.out.print("\n|\t\t\tDELETE STUDENT\t\t\t\t|\n");
							System.out.println("-----------------------------------------------------------------\n");
							System.out.println();
							continue  L1;
						}else if(leter=='N'||leter=='n'){
							homePage(student);
						}
					}
				}else{
					System.out.print("Invalied Student Id. Do you want to search again? (Y/N)");
					char leter=input.next().charAt(0);
					System.out.println();
					if (leter=='Y'||leter=='y'){
						clearConsole();
						System.out.print("-----------------------------------------------------------------");
						System.out.print("\n|\t\t\tDELETE STUDENT\t\t\t\t|\n");
						System.out.println("-----------------------------------------------------------------\n");
						System.out.println();
						continue L1;
						}else if(leter=='N'||leter=='n'){
							homePage(student);
							}
					}
				}else{
					System.out.print("Invalied Student Id. Do you want to search again? (Y/N)");
					char letter=input.next().charAt(0);
					System.out.println();
					if (letter=='Y'||letter=='y'){
						clearConsole();
						System.out.print("-----------------------------------------------------------------");
						System.out.print("\n|\t\t\tDELETE STUDENT\t\t\t\t|\n");
						System.out.println("-----------------------------------------------------------------\n");
						System.out.println();
						continue L1;
						}else if(letter=='N'||letter=='n'){
							homePage(student);
							}
				}	
			}		
		}
		
		public  static  void updateMarks(String[][] student){
			Scanner input=new Scanner(System.in);
			char leter='N';
	L1:	while(true){
		do{
			clearConsole();
			System.out.print("-----------------------------------------------------------------");
			System.out.print("\n|\t\t\tUpdate Marks\t\t\t\t|\n");
			System.out.println("-----------------------------------------------------------------\n");
						//enter studen id
				System.out.print("Enter Student Id : ");
				String number=input.next();
					//check valied index
				if (number.indexOf("S")==0){
					int x=0;
				L2:	for (int i = 0; i < student.length; i++){
							//check index is in the array 
						if(number.equals(student[i][0])){
							x=i;
							break L2;
						}else{
							x=-1;
							}
						}
					if (x!=-1){
										 //check the marks alredy added
							if ((student[x][2].equals("0")) || (student[x][3].equals("0"))){
									System.out.println("Student Name : "+student[x][1]);
									System.out.println("This student's marks yet to be added.");
									System.out.print("Do you want to update  another student details? (Y/N)");
									leter=input.next().charAt(0);
									System.out.println();
									if (leter=='Y'||leter=='y'){
										continue L1;
									}else if(leter=='N'||leter=='n'){
										homePage(student);
										}
								}
								//enter update marks
								System.out.println("Student name 	: "+student[x][1]+"\n");
								System.out.println("Programing Fundamentals Marks    : "+student[x][2]);
								System.out.println("Database Management System Marks : "+student[x][3]+"\n");
								int mark1=0;
							M1:	while (true){
									System.out.print("Enter new Programing Fundamentals Marks    : ");
									String tempMark1=input.next();
									mark1=Integer.valueOf(tempMark1);
									if (mark1<0 || mark1>100){
										System.out.println("Invalid marks, please enter correct marks.\n");
										continue M1;
									}else{
										student[x][2]=tempMark1;
										break M1;
									}
								}
								int mark2=0;
							M2:	while (true){
								System.out.print("Enter new Database Management System Marks : ");
								String tempMark2=input.next();
								mark2=Integer.valueOf(tempMark2);
								if (mark2<0 || mark2>100){
									System.out.println("Invalid marks, please enter correct marks.\n");
									continue M2;
								}else{
									student[x][3]=tempMark2;
									break M2;
								}
							}
							student[x][4]=(mark1+mark2)+"";
								System.out.println("Marks has been update Succcsessfully.");
								System.out.print("Do you want to update  another student details? (Y/N)");
								char leter1=input.next().charAt(0);
								System.out.println();
								if (leter1=='Y'||leter1=='y'){
									continue L1;
								}else if(leter1=='N'||leter1=='n'){
									homePage(student);
									}
								
					}else{
						System.out.println("Invalid Student ID. Do you want to search again? (Y/N)");
						char letter1=input.next().charAt(0);
						if (letter1=='Y' || letter1=='y'){
							continue L1;
						}else if(letter1=='N' || letter1=='n'){
							homePage(student);
						}
					}
					
				}else{
					System.out.println("Invalid Student ID. Do you want to search again? (Y/N)");
					leter=input.next().charAt(0);
				}
			} while (leter=='Y'||leter=='y');
			if (leter=='N'||leter=='n'){
				homePage(student);
			}
			
		}
	}
		
		public static void updateDeatiels(String[][] student){
			Scanner input=new Scanner(System.in);
				char leter='N';	
	L1:	while(true){
		do{
			clearConsole();
			System.out.print("-----------------------------------------------------------------");
			System.out.print("\n|\t\t\tUpdate Student Details\t\t\t|\n");
			System.out.println("-----------------------------------------------------------------\n");
						//enter studen id
				System.out.print("Enter Student Id : ");
				String number=input.next();
					//check number is valied
				if (number.indexOf("S")==0){
					int x=0;
				L2:	for (int i = 0; i < student.length; i++){
							//check number is in the array
						if(number.equals(student[i][0])){
							x=i;
							break L2;
							}
							x=-1;
						}
					if (x==-1){
						System.out.print("Invalid Student ID. Do you want to search again? (Y/N)");
								char letter=input.next().charAt(0);
								if (letter=='Y'||letter=='y'){
									continue L1;
								}else if(letter=='N'||letter=='n'){
									homePage(student);
								}			
					}else{
						System.out.println("Student name 	: "+student[x][1]+"\n");
						System.out.print("Enter the new Student name 	: ");
						student[x][1]=input.next();
						System.out.println();
						System.out.println("Student deatils has been update successfully.");
						System.out.print("Do you want to update  another student details? (Y/N)");
						char leter1=input.next().charAt(0);
						System.out.println();
						if (leter1=='Y'||leter1=='y'){
							continue L1;
						}else if(leter1=='N'||leter1=='n'){
							homePage(student);
							}	
					}
					
					//number invalied
				}else{
					System.out.println("Invalid Student ID. Do you want to search again? (Y/N)");
					leter=input.next().charAt(0);
				}
			} while (leter=='Y'||leter=='y');
			if (leter=='N'||leter=='n'){
				homePage(student);
			}
		}	
	}
		public static void addMarks(String[][] student){
			clearConsole();
			Scanner input=new Scanner(System.in);
			System.out.print("-----------------------------------------------------------------");
			System.out.print("\n|\t\t\tADD MARKS\t\t\t\t|\n");
			System.out.print("-----------------------------------------------------------------\n");
			//Enter number and check it is valied----------------
	L1:	for (int j = 0; j < student.length; j++){
			while(true){
				//enter number
			System.out.print("Enter Student Id : ");
			String number=input.next();
				//check nummber is valied
			if (number.indexOf("S")==0){
				int x=0;
			L2:	for (int i = 0; i < student.length; i++){
						//check number is in the array
					if (number.equals(student[i][0])){ 
						x=i;
						break L2;
				//number is not array	
					}else{
						x=-1;
					}	
				}
				if (x!=-1){
					System.out.println("Student Name : "+student[x][1]+"\n");
							//number equal the 3 eliment to "0"
						if (student[x][2].equals("0")||student[x][3].equals("0")){
								//add to maraks
							int mark1=0;
						M1:	while(true){
								System.out.print("Programin Fundamenatals Marks : ");
								String mark=input.next();
								mark1=Integer.valueOf(mark);
								if (mark1<0 || mark1>100){
								System.out.println("Invalid marks, please enter correct marks.\n");
								continue M1;
							}else{
								student[x][2]=mark;
								break M1;
							}		
						}
							int mark2=0;
						M2: while (true){
								System.out.print("Database management system Marks : ");
								String mark=input.next();
								mark2=Integer.valueOf(mark);
								if (mark2<0 || mark2>100){
								System.out.println("Invalid marks, please enter correct marks.\n");
								continue M2;
							}else{
								student[x][3]=mark;
								break M2;
							}
						}
							//subject total add
						student[x][4]=(mark1+mark2)+"";
						System.out.print("Marks have been added. do you want to added marks for another student?(Y/N)");
						char leter1=input.next().charAt(0);
						if (leter1=='Y'||leter1=='y'){
								clearConsole();
								System.out.print("-----------------------------------------------------------------");
								System.out.print("\n|\t\t\tADD MARKS\t\t\t\t|\n");
								System.out.print("-----------------------------------------------------------------\n");
								System.out.println();
							continue L1;
						}else if(leter1=='N'||leter1=='n'){
							homePage(student);
						}
							//number not equal the 3 eliment to "0"
						}else{
							System.out.println("This student marks  have been alredy added.");
							System.out.println("If you want to update the marks,please use [4] Update Marks option."+"\n");
							System.out.print("Do you want to add marks another student? (Y/N)");
							char leter=input.next().charAt(0);
							System.out.println();
							if (leter=='Y'||leter=='y'){
								clearConsole();
								System.out.print("-----------------------------------------------------------------");
								System.out.print("\n|\t\t\tADD MARKS\t\t\t\t|\n");
								System.out.print("-----------------------------------------------------------------\n");
								System.out.println();
								continue  L1;
							}else if(leter=='N'||leter=='n'){
								homePage(student);
							}
							
							}
				}else{
					System.out.print("Invalid Student ID. Do you want to search again? (Y/N)");
					char leter5=input.next().charAt(0);
					if (leter5=='Y'||leter5=='y'){
						clearConsole();
						System.out.print("-----------------------------------------------------------------");
						System.out.print("\n|\t\t\tADD MARKS\t\t\t\t|\n");
						System.out.print("-----------------------------------------------------------------\n");
						System.out.println();
						continue L1;
					}else if(leter5=='N'||leter5=='n'){
						homePage(student);
					}
				}
				
				//number invalied
			}else{
				System.out.print("Invalid Student ID. Do you want to search again? (Y/N)");
				char leter3=input.next().charAt(0);
				if (leter3 =='Y'||leter3 =='y'){
					clearConsole();
					System.out.print("-----------------------------------------------------------------");
					System.out.print("\n|\t\t\tADD MARKS\t\t\t\t|\n");
					System.out.print("-----------------------------------------------------------------\n");
					System.out.println();
					continue L1;
					}else if(leter3 =='N'||leter3 =='n'){
						homePage(student);
					}
				}
			}
		}
	}
		public static void newStudentmarks(String[][] student){
			Scanner input=new Scanner(System.in);	
			clearConsole();
		
				//start hedline box create
			System.out.print("-----------------------------------------------------------------");
			System.out.print("\n|\t\t\tAdd New Student With Marks\t\t|\n");
			System.out.print("-----------------------------------------------------------------\n");
				//-----end hed line box -----
			System.out.println();
			//Array [i][0] assign to 0-------
		
		//Enter new Student--------------
		L1:	for (int j = 0; j < student.length; j++){
				char leter='Y';
				do{
					System.out.print("\nEnter Studen ID  : ");
					String number=input.next();
						//check the enter number is valied
					if (number.indexOf("S")==0){
					//check repeat index------
				L2:	for (int i = 0; i < student.length; i++){
						if (student[i][0].equals(number)){ 
							System.out.println("The Student ID already exists");
							j--;
							continue L1;
						//Asing values-------------
						}else if (student[i][0].equals("0")){
							student[i][0]=number;
							System.out.print("Enter Studen Name : ");
							student[i][1]=input.next();
										//Enter programing fundamental marks-----------
							int mark1=0;
						M1:	while (true){
								System.out.print("Programing Fundamentals Marks : ");
								String tempMark=input.next();
								mark1=Integer.parseInt(tempMark);
								if (mark1<0 || mark1>100){
									System.out.println("Invalid marks, please enter correct marks.\n");
									continue M1;
								}
								student[i][2]=tempMark;
								break M1;
							}
							//Enter database managment System marks-------------------
							int mark2=0;
						M2:	while (true){
								System.out.print("Database Management System Marks : ");
								String tempMarks=input.next();
								mark2=Integer.parseInt(tempMarks);
								if (mark2<0 || mark2>100){
									System.out.println("Invalid marks, please enter correct marks.\n");
									continue M2;
								}	
								student[i][3]=tempMarks;
								break M2;
							}
							student[i][4]=(mark1+mark2)+"";
						}else{
							continue L2;
								}

						System.out.print("Student has been added successfully. Do you want to add a new student (Y/N)");
						leter=input.next().charAt(0);
						if (leter=='N'||leter=='n'){
							homePage(student);
							
						}else if(leter=='Y'||leter=='y'){
							clearConsole();
							//start hedline box create
							System.out.print("-----------------------------------------------------------------");
							System.out.print("\n|\t\t\tAdd New Student With Marks\t\t|\n");
							System.out.print("-----------------------------------------------------------------\n");
								//-----end hed line box -----
							System.out.println();
							continue  L1;
						}
					}
				}else{
					System.out.println("Invalid Student ID. Do you want to search again? (Y/N)");
					char leter5=input.next().charAt(0);
					if (leter5=='Y'||leter5=='y'){
						clearConsole();
						System.out.print("-----------------------------------------------------------------");
						System.out.print("\n|\t\t\tADD MARKS\t\t\t\t|\n");
						System.out.print("-----------------------------------------------------------------\n");
						System.out.println();
						continue L1;
					}else if(leter5=='N'||leter5=='n'){
						homePage(student);
					}
				}
			
				}while(j==student.length);
			}
		}
		
	public static void newStudent(String[][] student){
		Scanner input=new Scanner(System.in);	
		clearConsole();
			//start hedline box create
		System.out.print("-----------------------------------------------------------------");
		System.out.print("\n|\t\t\tAdd New Student\t\t\t\t|\n");
		System.out.print("-----------------------------------------------------------------\n");
			//-----end hed line box -----
		System.out.println();
		//Array [i][0] assign to 0-------
		
		//Enter new Student--------------
	L1:	for (int j = 0; j < student.length; j++){
			char leter='Y';
			do{
				System.out.print("\nEnter Studen ID  : ");
				String number=input.next();
					if (number.indexOf("S")==0){
					//check repeat index------
			L2:	for (int i = 0; i < student.length; i++){
					if (number.equals(student[i][0])){ 
							System.out.println("The Student ID already exists");
							j--;
							continue L1;
							//Assign values-------------
					}else if (student[i][0].equals("0")){
						student[i][0]=number;
						System.out.print("Enter Student Name : ");
						student[i][1]=input.next();
						System.out.print("Student has been added successfully. Do you want to add a new student (Y/N)");
						leter=input.next().charAt(0);
						if (leter=='N'||leter=='n'){
							homePage(student);	
						}else if(leter=='Y'||leter=='y'){
							clearConsole();
							//start hedline box create
							System.out.print("-----------------------------------------------------------------");
							System.out.print("\n|\t\t\tAdd New Student\t\t\t\t|\n");
							System.out.print("-----------------------------------------------------------------\n");
							//-----end hed line box -----
							System.out.println();
							continue L1;
							}
					}else{
							continue L2;
						}				
					}
				}else{
					System.out.println("Invalid Student ID. Do you want to search again? (Y/N)");
					char leter5=input.next().charAt(0);
					if (leter5=='Y'||leter5=='y'){
						clearConsole();
						System.out.print("-----------------------------------------------------------------");
						System.out.print("\n|\t\t\tADD MARKS\t\t\t\t|\n");
						System.out.print("-----------------------------------------------------------------\n");
						System.out.println();
						continue L1;
					}else if(leter5=='N'||leter5=='n'){
						homePage(student);
					}
				}
			}while(j==student.length);
		}
	}
		
	public final static void clearConsole() {
	try {
		final String os = System.getProperty("os.name");
		if (os.contains("Windows")) {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} else {
			System.out.print("\033[H\033[2J");
			System.out.flush();
		}
		} catch (final Exception e) {
		e.printStackTrace();
		// Handle any exceptions.
		}
		}
			
	public static void homePage(String[][] student){
		clearConsole();
		Scanner input=new Scanner(System.in);
		//start hedline box create
		System.out.print("-----------------------------------------------------------------");
		System.out.print("\n|\tWELCOME TO GDSE MARKS MANAGEMENT SYSTEM\t\t\t|\n");
		System.out.print("-----------------------------------------------------------------\n");
		//-----end hed line box -----
		System.out.println("\n[1] Add New Student\t\t\t[2] Add New Student With marks");
		System.out.println("[3] Add Marks\t\t\t\t[4] Update Student Deatiels");
		System.out.println("[5] Update Marks\t\t\t[6] Delete Student");
		System.out.println("[7] Print Student Deatiels\t\t[8] Print Student Ranks");
		System.out.println("[9] Best in Programing Fundamentals\t[10] Best in Database Management System");
		System.out.print("\nEnter an option to continue >");
		int number=input.nextInt();
		switch(number){
			case 1 : newStudent(student);break;
			case 2 : newStudentmarks(student);break;
			case 3 : addMarks(student);break;
			case 4 : updateDeatiels(student);break;
			case 5 : updateMarks(student);break;
			case 6 : deleteStudents(student);break;
			case 7 : printStudentsDeatiels(student);break;
			case 8 : printStudentRAnk(student);break;
			case 9 : bestProgramimg(student);break;
			case 10: bestDatabase(student);break;
			default : System.out.println("\nInvalide input.");
			}
	}
	public static void main(String args[]){
			String[][] student=new String[100][6];
			for (int i = 0; i < student.length; i++){
				for (int j = 0; j < student[0].length; j++){
					student[i][j]="0";
				}
			}
			homePage(student);
			clearConsole();

		}
	}
