/**
 D'Andre Campbell
 Assignment 4
 Wed. 4:15 - 5:10
 */

#include <stdio.h>
#include <stdlib.h>

void refTable(FILE in, FILE out);
void sourceProgram(FILE in, FILE out);
void both(FILE in, FILE out);

int main(void)
{
    char flag[2];
    char inputFile;
    char outputFile;
    
    printf("Input the flag:");
    scanf("%s", &flag);
    
    printf("\nInput the name of the input file: ");
    scanf("%s", &inputFile);
    
    
    printf("\nInput the name of the output file: ");
    scanf("%s", &outputFile);
    
    switch(flag)
    {
        case "-l":
            sourceProgram(inputFile, outputFile);
            break;
            
        case "-c":
            refTable(inputFile, outputFile);
            break;
            
        case "-b":
            both(inputFile, outputFile);
            break;
      
      default:
            printf("Not a valid entry.");
            exit(0);
    }
    
   return 0;
}

// for argument -c (cross reference table)
void refTable(FILE in, FILE out)
{
 	 char words;
    
  	f1 = fopen(in, "r");
 	 if (f1 == NULL)
 	 {
    	printf("Cannot open file.\n");
   	 exit(0);
     }
    
    f2 = fopen(out, "w");
    if(f2 == NULL)
    {
        printf("Cannot open file\n");
        exit(0);
    }

    while(words != EOF)
    {
        words = fgetc(f1);
        fputs(f2);
    }

    fcloseall();
  
}

// for argument -l (MAL source program)
void sourceProgram(FILE in, FILE out)
{
        char words;
    
    f1 = fopen(in, "r");
     if (f1 == NULL)
     {
         printf("Cannot open file.\n");
         exit(0);
     }
    
    f2 = fopen(out, "w");
    if(f2 == NULL)
    {
        printf("Cannot open file\n");
        exit(0);
    }

    while(words != EOF)
    {
     
    }

    fcloseall();
}

// for argument -b ()
void both(FILE in, FILE out)
{
     char words;
    
    f1 = fopen(in, "r");
     if (f1 == NULL)
     {
         printf("Cannot open file.\n");
         exit(0);
     }
    
    f2 = fopen(out, "w");
    if(f2 == NULL)
    {
        printf("Cannot open file\n");
        exit(0);
    }

    while(words != EOF)
    {
        words = fgetc(f1);
        fputs(f2);
    }

    fcloseall();
}
