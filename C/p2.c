#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
	FILE *firstFile;	// Input File
	FILE *secondFile;	// Output File
	char fileContent;
	int numOfLines = 0;
	
	if(argc != 3)
	{
		printf("Number of arguments is not correct.");
		exit(0);
	}
	
	// Reads characters from firstFile
	//firstFile = fopen("inputfile.txt", "r");
	firstFile = fopen(argv[1] + ".txt", "r");  // Find out how to get this line to work
	if(firstFile == NULL)
	{
		printf("File doees not exist or cannot be open. \n");
		fflush(stdout);
		exit(0);
	}
	
	// Adds words from firstFile to array (fileContent)
	fileContent = fgetc(firstFile);
	while(fileContent != EOF)
	{
		//numOfLines++;
		fputc(fileContent, secondFile);
		fileContent = fgetc(firstFile);
		
	}
	
	// Creates secondFile if it doesn't already exists and 
	// adds fileContent from firstFile
	secondFile = fopen(argv[2], "w");
	if(secondFile == NULL)
	{
		printf("Error. \n");
		fflush(stdout);
		exit(0);
	}
	
	// Closes both files
	fclose(firstFile);
	fclose(secondFile);
	
	printf("Finished. \n");
	fflush(stdout);
	
	return 0;
}
