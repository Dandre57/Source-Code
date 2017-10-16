#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	FILE *firstFile;	// Input File
	FILE *secondFile;	// Output File
	char fileContent;
	int numOfLines = 0;
	
	// Reads characters from firstFile
	firstFile = fopen("inputfile.txt", "r");
	if(firstFile == NULL)
	{
		printf("File doees not exist or cannot be open. \n");
		fflush(stdout);
		exit(0);
	}
	
	// Adds words from firstFile to array (fileContent)
	while(fileContent != EOF)
	{
		numOfLines++;
		fileContent = fgetc(firstFile);
		
	}
	
	// Creates secondFile if it doesn't already exists and 
	// adds fileContent from firstFile
	secondFile = fopen(*secondFile , "w");
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
