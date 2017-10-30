#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

void ina(int index, char newText); 
void inb(int index, char newText); 
struct node *del(int index); // done
void rep(int index, char newText); 
void prn(); // done 
void end(); // done 

struct node
{
	char text[255];
	int index;
	struct node *next;
};

struct node *head = NULL;
struct node *current = NULL;
struct node *previous = NULL;

int main(void)
{
	char command[4];
	int index;
	char str[255];
	
	while(strcmp(command, "end") != 0) 
	{
		printf("Enter your command:"); fflush(stdout);
		scanf("%s %d %s", &command, &index, &str);
		
		if(strcmp(command, "ina") == 0)
			ina(index, str);
		else if(strcmp(command, "inb") == 0)
			inb(index, str);
		else if(strcmp(command, "del") == 0)
			del(index);
		else if(strcmp(command, "rep") == 0)
			rep(index, str);
		else if(strcmp(command, "prn") == 0)
			prn();
		else if(strcmp(command, "end") == 0)
			end();
		
	}
	
	
	return 0;
}

void ina(int index, char newText)
{
	struct node *new = (struct node*) malloc(sizeof(struct node));
	
	if(previous == NULL)
		printf("Problem.");
	
	new->text = newText;
	new->next = previous->next;
	previous->next = new;
}

void inb(int index, char newText)
{
	
}

struct node *del(int index)
{
	//struct node *previous = NULL;
	
	if(head == NULL)
		return NULL; // print something ....
	
	while(current->index != index)
	{
		if(current->next == NULL)
			return NULL; // print something ....
		else
		{
			previous = current;
			current = current->next;
		}
	}
	
	if(current == head)
		head = head->next;
	else
		previous->next = current->next;
	
	return current; // print something ....
}

void rep(int index, char newText)
{
	
}

void prn()
{
	struct node *ptr = head;
	
	if(ptr == NULL)
	{
		printf("The list is empty. \n"); fflush(stdout);
	}
	else
	{
		printf("List: \n"); fflush(stdout);
		while(ptr != NULL)
		{
			printf("%d : %s \n", ptr->index, ptr->text);
			ptr = ptr->next;
		}
		printf("Done. \n"); fflush(stdout);
	}	
}

void end()
{
	printf("Ending program...\n"); fflush(stdout);
	exit(0);
}
