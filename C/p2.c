#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//void spaceRemover(char string[]);
void reverse(char *begin, char *end);
void reverseString(char *s);

int main(int argc, char *argv[])
{
	FILE *firstFile;	// Input File
	FILE *secondFile;	// Output File
	char fileName[strlen(argv[1]) + 5];
	char otherName[strlen(argv[1]) + 6];
	char fileContent[255], reverse[255];
	int length, i, start, end;
	int index = 0;
	
	if(argc != 3)
	{
		printf("Number of arguments is incorrect.");
		exit(0);
	}
	
	// Reads characters from firstFile
	strcat(fileName, argv[1]);
	strcat(fileName, ".txt");
	
	firstFile = fopen(fileName, "r");  // Find out how to get this line to work
	if(firstFile == NULL)
	{
		printf("File doees not exist or cannot be open. \n");
		fflush(stdout);
		exit(0);
	}
	
	// Creates secondFile if it doesn't already exists and 
	// adds fileContent from firstFile./
	strcat(otherName, argv[2]);
	strcat(otherName, ".txt");
	
	secondFile = fopen(otherName, "w");
	if(secondFile == NULL)
	{
		printf("Error. \n");
		fflush(stdout);
		exit(0);
	}
	
	// Adds words from firstFile to array (fileContent)
	fgets(fileContent, sizeof(fileContent), firstFile);
	
	length = strlen(fileContent);
	start = length - 1;
	end = length - 1;

	while(start > 0)
	{
		if(fileContent[start] == ' ')
		{
			i = start + 1;
			while(i <= end)
			{
				reverse[index] = fileContent[i];
				i++;
				index++;
			}
			
			reverse[index++] = ' ';
			end = start - 1;
		}
		
		start--;
	}
	
	for(i = 0; i <= end; i++)
	{
		reverse[index] = fileContent[i];
		index++;
	}
	
	reverse[index] = '\0';
	fprintf(secondFile, "%s", reverse);
	
	// Closes both files
	fclose(firstFile);
	fclose(secondFile);
	
	printf("Finished. \n");
	fflush(stdout);
	
	return 0;
}
/*
void spaceRemover(char string[])
{
	int i;
	
	for(i = 0; i < strlen(string[]); i++)
	{
		if(string[i] == '\t')
			putchar(' ');
	}
	
}
*/
