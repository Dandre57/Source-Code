#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// http://www.chegg.com/homework-help/questions-and-answers/write-c-program-whose-input-mips-assembly-language-mal-program-whose-output-listing-mal-pr-q16753309
// https://stackoverflow.com/questions/10468128/how-do-you-make-an-array-of-structs-in-c

void flagv(char argv[]);
void flagf(char argv[]);
void flagb(char argv[]);

struct node
{
	char identifier[11];
	struct node* next;
};

struct node listV[100];
struct node listF[100];
struct node listB[100];

int main(int argc, char* argv[])
{
	FILE *firstFile;
	FILE *secondFile;
	char fileName[strlen(argv[2]) + 5];
	char otherName[strlen(argv[3]) + 5];
	char fileContent;
	char flag;
	
	if(argc != 4)
	{
		printf("Number of arguments is not correct");
		exit(0);
	}
	
	strcat(fileName, argv[2]);
	strcat(fileName, ".mal");
	
	firstFile = fopen(fileName, "r");
	if(firstFile == NULL)
	{
		printf("File does not exist or cannot be open.\n"); fflush(stdout);
		exit(0);
	}
	
	strcat(otherName, argv[3]);
	strcat(otherName, ".txt");
	
	secondFile = fopen(otherName, "w");

	
	if(strcmp(argv[1], "-v") == 0)
		flagv(argv[2]);
		
	else if(strcmp(argv[1], "-f") == 0)
		flagf(argv[2]);
		
	else if(strcmp(argv[1], "-b") == 0)
		flagb(argv[2]);
		
	else
	{
		printf("Not a valid entry.\n");
		exit(0);
	}
	
	
	fclose(firstFile);
	fclose(secondFile);
	
	printf("Finished. \n"); fflush(stdout);
	
	return 0;
}

void flagv(char argv[])
{
	// prints .DATA segment of mal program
	const char identifier = ':';
	char* string;
	
	//string = strchr( , identifier); ?
}

void flagf(char argv[])
{
	// prints .TEXT segment of mal program
}

void flagb(char argv[])
{
	// prints both segments of mal program
}

/*
	Use fgets to read file line by line. For each line thats not
	a comment or blank, use strtok to parse line and extract the
	various fields.
	
	Writing statements that will print a word if it contains a 
	certain character
	
	strtok_r();
*/
