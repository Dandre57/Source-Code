/**
 D'Andre Campbell
 Assignment 4
 Wed. 4:15 - 5:10
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void refTable(FILE in, FILE out);
void sourceProgram(FILE in, FILE out);
void both(FILE in, FILE out);

int main(void)
{
    char flag;
    FILE *inputFile;
    FILE *outputFile;
    
    printf("Input the flag:");
    scanf("%s", &flag);
    
    printf("\nInput the name of the input file: ");
    scanf("%s", &inputFile);
    
    printf("\nInput the name of the output file: ");
    scanf("%s", &outputFile);

    if(strcmp(flag, "-l") != 0)
        sourceProgram(*inputFile, outputFile);

    else if(strcmp(flag, "-c") != 0)
        refTable(*inputFile, outputFile);

    else if(strcmp(flag, "-b") != 0)
        both(*inputFile, outputFile);

    else
    {
        printf("Not a valid entry.");
        exit(0);
    }

   return 0;
}

// for argument -c (cross reference table)
void refTable(FILE in, FILE out)
{
    char words;
    int numOfLines = 0;
    FILE *f1, *f2;

    f1 = fopen(*in, "r");
    if (f1 == NULL)
    {
        printf("Cannot open file.\n");
        exit(0);
    }
    
    f2 = fopen(*out, "w");
    if(f2 == NULL)
    {
        printf("Cannot open file.\n");
        exit(0);
    }

    while(words != EOF)
    {
        numOfLines++;
        words = fgetc(f1);
        if(strstr(words, "") != NULL)
        {
         
        }
        fwrite("%d %s", numOfLines, words, f2);
    }

    fclose(f1);
    fclose(f2);
  
}

// for argument -l (MAL source program)
void sourceProgram(FILE in, FILE out)
{
    char words;
    char look = "done";
    int numOfLines = 0;
    FILE *f1, *f2;

    f1 = fopen(*out, "r");
    if(f1 == NULL)
    {
        printf("Cannot open file\n");
        exit(0);
    }
 
    f2 = fopen(*out, "w");
    if(f2 == NULL)
    {
        printf("Cannot open file\n");
        exit(0);
    }

    while(words != EOF)
    {
       numOfLines++;
       words = fgetc(f1);
       if(strstr(words, "done") != NULL)
       {
        exit(0);
       }
       fwrite("%d %s", numOfLines, words, f2);         
    }

    fclose(f1);
    fclose(f2);
}

// for argument -b ()
void both(FILE in, FILE out)
{
    char words;
    int numOfLines = 0;
    FILE *f1, *f2;

    f1 = fopen(*in, "r");
    if (f1 == NULL)
    {
        printf("Cannot open file.\n");
        exit(0);
    }
    
    f2 = fopen(*out, "w");
    if(f2 == NULL)
    {
        printf("Cannot open file\n");
        exit(0);
    }

    while(words != EOF)
    {
        numOfLines++;
        words = fgetc(f1);
        fwrite("%d %s", numOfLines, words, f2);
    }

    fclose(f1);
    fclose(f2);
}
