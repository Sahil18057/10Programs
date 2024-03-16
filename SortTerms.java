import java.util.*;
import java.io.*;

public class SortTerms
{
    public static void main(String[] args) throws IOException
    {
        String[] term; 
        int i, numTerms; 
        String fileName; 
        Scanner scanner, inFile;
        PrintWriter outFile;

        inFile = new Scanner(new File("terms.txt"));

        outFile = new PrintWriter(new FileWriter("sortedTerms.txt"));
        
        numTerms = inFile.nextInt(); 
        term = new String[numTerms];

        for(i=0; i<numTerms; i++)
            term[i] = inFile.next();

        Arrays.sort (term);

        for(i=0; i<numTerms; i++)
        {
            outFile.println(term[i]);
        }
        inFile.close();
        outFile.close();
    }
    
}

/*

D:\mahesh\home-120324\continue>javac SortTerms.java

D:\mahesh\home-120324\continue>java SortTerms

// Before in terms.txt

6
M
A
H
E
S
H

// After in sortedTerms.txt

A
E
H
H
M
S


*/
