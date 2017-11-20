#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

// http://www.chegg.com/homework-help/questions-and-answers/write-c-program-whose-input-mips-assembly-language-mal-program-whose-output-listing-mal-pr-q16753309
// https://stackoverflow.com/questions/10468128/how-do-you-make-an-array-of-structs-in-c

void flagv(FILE* input, FILE* output);
void flagf(FILE* input, FILE* output);
void flagb(FILE* input, FILE* output);

struct line
{
	char* sourceLine;
	struct line* next;
};

struct node
{
	char identifier[11];
	struct line* firstNode;
	struct line* lastNode;
};

struct node commandV[100];
struct node commandF[100];
struct node commandB[100];

int main(int argc, char* argv[])
{
	struct line* list = NULL;
	
	FILE *firstFile;
	FILE *secondFile;
	char fileName[strlen(argv[2]) + 5];
	char otherName[strlen(argv[3]) + 5];
	char* fileContent;
	char* flag;
	
	if(argc != 4)
	{
		printf("Number of arguments is not correct.\n");
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
	
	while(!feof(firstFile))
	{
		fscanf(firstFile, "%s", fileContent);
		//strcat(list->sourceLine, fileContent);
	}
	
	strcat(otherName, argv[3]);
	strcat(otherName, ".txt");
	secondFile = fopen(otherName, "w");
	
	if(strcmp(argv[1], "-v") == 0)
		flagv(firstFile, secondFile);
		
	else if(strcmp(argv[1], "-f") == 0)
		flagf(firstFile, secondFile);
		
	else if(strcmp(argv[1], "-b") == 0)
		flagb(firstFile, secondFile);
		
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

void flagv(FILE* input, FILE* output)
{
	// prints .DATA segment of mal program
	const char identifier = ':';
	char string[100];
	char word[sizeof string];
	char *ptr, *other = word;
	int contain = 0, i;
	
	//while(!feof(firstFile))
	//while(fgets(string, 100, input) != ".text")
	//while((i = gets(input)) != ".text")
	while(fgets(string, 100, input) != ".text")
	{
		for(ptr = string; *ptr != '\0'; ptr++)
		{
			if(isspace(*ptr))
			{
				*other = '\0';
				if(contain)
					fprintf(output, "Variable ID -%s-\n", word);
				
				contain = 0;
				other = word;
			}
			else
			{
				if(*ptr == identifier)
					contain = 1;
				
				*other++ = *ptr;
			}
		}
	}
	
}

void flagf(FILE* input, FILE* output)
{
	// prints .TEXT segment of mal program
}

void flagb(FILE* input, FILE* output)
{
	// prints both segments of mal program
	const char identifier = ':';
	char string[100];
	char word[sizeof string];
	char *ptr, *other = word;
	int contain = 0, i;
	
	//while(!feof(firstFile))
	//while(fgets(string, 100, input) != ".text")
	//while((i = gets(input)) != ".text")
	while(fgets(string, 100, input) != EOF)
	{
		for(ptr = string; *ptr != '\0'; ptr++)
		{
			if(isspace(*ptr))
			{
				*other = '\0';
				if(contain)
					fprintf(output, "Variable ID -%s-\n", word);
				
				contain = 0;
				other = word;
			}
			else
			{
				if(*ptr == identifier)
					contain = 1;
				
				*other++ = *ptr;
			}
		}
	}
	
}

/*
	Use fgets to read file line by line. For each line thats not
	a comment or blank, use strtok to parse line and extract the
	various fields.
	
	Writing statements that will print a word if it contains a 
	certain character
	
	strtok_r();
*/
