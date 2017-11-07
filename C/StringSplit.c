#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void)
{
	char string[255];
	char* command;
	char* conversion;
	char* text;
	const char s[2] = " ";

	//look up how to split string into different parts
	
	printf("Enter your command:"); fflush(stdout);
	scanf("%s", &string);

	command = strtok(string, " ");
	
	/*
	conversion = strtok(NULL, " ");
	text = strtok(NULL, " ");
	printf("%s %s %s", command, conversion, text);
	*/
	
	while(command != NULL)
	{
		printf("%s \n", command);
		command = strtok(NULL, " ");
	}
	
	return 0;
}
