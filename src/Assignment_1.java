// --------------------------------------------------------------------
// Assignment 1
// Written by: Sarita Sharma , Student ID:2195258
// For Application Development 2 (Mobile) - Winter 2022
// --------------------------------------------------------------------
//Q.1
import java.util.Random;

public class Assignment_1 {
	//check the upper case letter if condition match return 1 else return -1
	public static int upperCase(String s) 
	{
		if (s.matches(".*[A-Z].*")) {
			return 1;
		} else {
			return -1;
		}
	}
	public static int lowerCase(String s) {
		//check the lower case letter if condition match return 1 else return -1
		if (s.matches("^.*[a-z].*")) {
			return 1;
		} else {
			return -1;
		}
	}
	public static int specialChar(String s) {
		//check the special character if condition match return 1 else return -1
		if (s.matches(".*[@$!%*#?&+_-].*")) {
			return 1;
		} else {
			return -1;
		}
	}
	public static String generatePassword(String book[][][]) 
	{
	int count=0;
	int count1=0;
	//calling the method generateWords  
	String[] words=generateWords(book);
	int size=words.length;
	int countPassword=0;
	String Password="";
	for(int i=0;i<size;i++) 
	{
	// if we have 3 words terminate the loop 
	if(countPassword==3) {break;}
	// check if the word length less than 2 or contain \n
	if((words[i].length()<2) ||(words[i].contains("\n")))
	{
	    if((words[i].contains("\n"))){count++;}
	    else {count1++;}
	  // if true select another line
		 String[] newwords=generateWords(book);
		 size=newwords.length;
	    words=newwords;
	    i=0;
	}
	// if not add to the vairable that save the password
	Password+=words[i]+" ";
	countPassword+=1;

	}
	return Password+count;

	}
	public static String[] generateWords(String[][][] a) 
	{
		Random rand= new Random();
		// for the random pagenumber
		  int pageNum=rand.nextInt(a.length);
		// for the random paragraphnumber
		  int paraNum=rand.nextInt(a[pageNum].length);
		//for the random linenumber
		  int lineNum=rand.nextInt(a[pageNum][paraNum].length);
		// get the random line from the book array   
		  String randomElement =a[pageNum][paraNum][lineNum];
		// split the every word from sentences and get words
		  String[] string=randomElement.split(" ");
		  return string;
	 }

//check the method for combined three words are same or not
		public static String matches(String a, String book[][][]) {
			int counter2 = 0;
			String[] Passwd = a.split(" ");
			String returnPasswd = "";
			int counterPasswd = 0;

			for (int i = 0; i < Passwd.length; i++) {
				String check = Passwd[i];

				for (int j = i + 1; j < Passwd.length; j++) {
					if (check.compareTo(Passwd[j]) == 0) {

						String[] newPasswd = generateWords(book);
						i = 0;
						check = newPasswd[i];
						j = i + 1;
						counter2++;
					}
				}
				returnPasswd += check;
				counterPasswd += 1;
				if (counterPasswd == 3) {
					break;
				}
			}
			return returnPasswd;
		}
	public static void main(String[] args) {
		
		System.out.println("Welcome to the password generator game !\n ***********************************************");
		//create an object for random string
		Random random = new Random();
		final String [ ][ ][ ]book = {
				{
				{"ALICE was beginning to get very tired of sitting by her sister on the\n",
				"bank, and of having nothing to do. Once or twice she had peeped into the\n",
				"book her sister was reading, but it had no pictures or conversations in\n",
				"it, \"and what is the use of a book,\" thought Alice, \"without pictures or\n",
				"conversations?\"\n"},
				{"So she was considering in her OWN mind (as well as she could, for the\n",
				"day made her feel very sleepy and stupid), whether the pleasure of\n",
				"making a daisy-chain would be worth the trouble of getting up and\n",
				"picking the daisies, when suddenly a White Rabbit with pink eyes ran\n",
				"close by her.\n"},
				{"There was nothing so very remarkable in that, nor did Alice think it so\n",
				"very much out of the way to hear the Rabbit say to itself, \"Oh dear! Oh\n",
				"dear! I shall be too late!\" But when the Rabbit actually took a watch\n",
				"out of its waistcoat-pocket and looked at it and then hurried on, Alice\n",
				"started to her feet, for it flashed across her mind that she had never\n",
				"before seen a rabbit with either a waistcoat-pocket, or a watch to take\n",
				"out of it, and, burning with curiosity, she ran across the field after\n",
				"it and was just in time to see it pop down a large rabbit-hole, under\n",
				"the hedge. In another moment, down went Alice after it!"}
				},
				{
				{"\"WHAT a curious feeling!\" said Alice. \"I must be shutting up like a\n",
				"telescope!\"\n"},
				{"And so it was indeed! She was now only ten inches high, and her face\n",
				"brightened up at the thought that she was now the right size for going\n",
				"through the little door into that lovely garden.\n"},
				{"After awhile, finding that nothing more happened, she decided on going\n",
				"into the garden at once; but, alas for poor Alice! When she got to the\n",
				"door, she found she had forgotten the little golden key, and when she\n",
				"went back to the table for it, she found she could not possibly reach\n",
				"it: she could see it quite plainly through the glass and she tried her\n",
				"best to climb up one of the legs of the table, but it was too slippery,\n",
				"and when she had tired herself out with trying, the poor little thing\n",
				"sat down and cried.\n"},
				{"\"Come, there's no use in crying like that!\" said Alice to herself rather\n",
				"sharply. \"I advise you to leave off this minute!\" She generally gave\n",
				"herself very good advice (though she very seldom followed it), and\n",
				"sometimes she scolded herself so severely as to bring tears into her\n",
				"eyes.\n"},
				{"Soon her eye fell on a little glass box that was lying under the table:\n",
				"she opened it and found in it a very small cake, on which the words \"EAT\n",
				"ME\" were beautifully marked in currants. \"Well, I'll eat it,\" said\n",
				"Alice, \"and if it makes me grow larger, I CAN reach the key; and if it\n",
				"makes me grow smaller, I can creep under the door: so either way I'll\n",
				"get into the garden, and I don't care which happens!\"\n"},
				{"She ate a little bit and said anxiously to herself, \"Which way? Which\n",
				"way?\" holding her hand on the top of her head to feel which way she was\n",
				"growing; and she was quite surprised to find that she remained the same\n",
				"size. So she set to work and very soon finished off the cake."}
				},
				{
				{"The King and Queen of Hearts were seated on their throne when they\n",
				"arrived, with a great crowd assembled about them--all sorts of little\n",
				"birds and beasts, as well as the whole pack of cards: the Knave was\n",
				"standing before them, in chains, with a soldier on each side to guard\n",
				"him; and near the King was the White Rabbit, with a trumpet in one hand\n",
				"and a scroll of parchment in the other. In the very middle of the court\n",
				"was a table, with a large DISH of tarts upon it. \"I wish they'd get the\n",
				"trial done,\" Alice thought, \"and hand 'round the refreshments!\"\n"},
				{"The judge, by the way, was the King and he wore his crown over his great\n",
				"wig. \"That's the jury-box,\" thought Alice; \"and those twelve creatures\n",
				"(some were animals and some were birds) I suppose they are the jurors.\"\n"},
				{"Just then the White Rabbit cried out \"Silence in the court!\"\n"},
				{"\"HERALD! read the accusation!\" said the King."}
				}
				};
		// initialize the variables 
		String Password = "";
		int newLine = 0, upper = 0, lower = 0, specialCharacter = 0, finalPassword = 0, length = 0, single = 0,
				equal = 0;

		do {
			// get the password
			Password = generatePassword(book);
			newLine = Integer.parseInt(Password.substring(Password.length() - 1));
			// check if the password contains same words
			Password = matches(Password, book);
			// check the length of password between 8 and 16
			boolean flag = false;
			do {
				if (Password.length() < 8 || Password.length() > 16) {

					Password = generatePassword(book);
					newLine = Integer.parseInt(Password.substring(Password.length() - 1));
					Password = matches(Password, book);
					flag = true;
				} else if (upperCase(Password) == -1) {

					upper++;
					Password = generatePassword(book);

					newLine = Integer.parseInt(Password.substring(Password.length() - 1));
					Password = matches(Password, book);
					flag = true;
				} else if (lowerCase(Password) == -1) {
					lower++;
					Password = generatePassword(book);
					newLine = Integer.parseInt(Password.substring(Password.length() - 1));
					Password = matches(Password, book);
					flag = true;
				} else if (specialChar(Password) == -1) {
					specialCharacter++;
					Password = generatePassword(book);
					newLine = Integer.parseInt(Password.substring(Password.length() - 1));
					Password = matches(Password, book);
					flag = true;
				} else {
					flag = false;
				}
			} while (flag);
			System.out.println(String.format("%-30s", "Password = " + Password)
					+ String.format("%-15s", "NewLine = " + newLine) + String.format("%-15s", "Single = " + single)
					+ String.format("%-15s", "Equal = " + equal) + String.format("%-15s", "Length = " + length)
					+ String.format("%-15s", "Upper = " + upper) + String.format("%-15s", "Lower = " + lower)
					+ String.format("%-15s", "Special = " + specialCharacter));
			finalPassword++;
			length = 0;
			lower = 0;
			specialCharacter = 0;
			upper = 0;
		} while (finalPassword < 10000 && lower == 0);

		System.out.println();
		System.out.println(String.format("%-30s", "Total Password genrated = " + finalPassword));
		System.out.println(String.format("%-30s", "Thanks for using Password generator Game "));
	}
}
