/*Input: IF YOU    SO, SO SO YOU REAP
		4 SO
OUTPUT:IF YOU SO, SO YOU REAP*/
import java.io.*;
class StringWordDeletion
{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[])throws Exception
	{
		System.out.println("Enter a value");
		String sentence=br.readLine();
		String formattedSentence="";
		sentence=sentence.trim();
		while(true)//loop for word extracction
		{
			sentence=sentence.trim();
			//breaking the initial input and removal of extra spaces
			if(sentence.indexOf(' ')==-1)
			{
				formattedSentence=formattedSentence+sentence.substring(0);
				break;	
			}
			else
			{
				formattedSentence=formattedSentence+sentence.substring(0,sentence.indexOf(' '));
				formattedSentence=formattedSentence.trim();
				formattedSentence=formattedSentence+" ";
				sentence=sentence.substring(sentence.indexOf(' '));
			}
		}
		String ar[]=formattedSentence.split(" ");
		System.out.println(formattedSentence);
		System.out.println("Enter the position then the word for deletion");
		int position=Integer.parseInt(br.readLine());
		String word=br.readLine();
		for(int i=0;i<ar.length;i++)
			if(i==(position-1)) continue;
		else
			System.out.print(ar[i]+" ");
	}
}