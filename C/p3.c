#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct node* ina(struct node* newNode, int index, char* newText);
//struct node* inb(struct node* newNode, int index, char* newText);
struct node* del(struct node* newNode, int index);
struct node* rep(struct node* newNode, int index, char* newText);
void prn(struct node* newNode);
void end();

struct node
{
	char text;
	int index;
	struct node *next;
};

int main(void)
{
	char command[4];
	int index;
	char text[255];
	
	while(strcmp(command, "end") != 0) 
	{
		struct node* list = NULL; 
		
		printf("Enter your command:"); fflush(stdout);
		scanf("%s %d %s", &command, &index, &text);
		
		if(strcmp(command, "ina") == 0)
			ina(list, index, text);
		else if(strcmp(command, "inb") == 0)
			inb(list, index, text);
		else if(strcmp(command, "del") == 0)
			del(list, index);
		else if(strcmp(command, "rep") == 0)
			rep(list, index, text);
		else if(strcmp(command, "prn") == 0)
			prn(list);
		else if(strcmp(command, "end") == 0)
			end();
		
	}
	
	return 0;
}

struct node* ina(struct node* newNode, int index, char* newText)
{
	//struct node* otherNode = (struct node*) malloc(sizeof(struct node));
	
	if(newNode == NULL)
		printf("List is empty \n");
	
	while(newNode != NULL)
	{
		if(newNode->index == index)
			newNode->text = newText;
		
		newNode = newNode->next;
	}
	
	return newNode;
}
/*
struct node* inb(struct node* newNode, int index, char* newText)
{
	if(newNode == NULL)
		printf("List is empty \n");
	
	
}
*/
struct node* del(struct node* newNode, int index)
{
	struct node* temp = newNode, *prev;
	
	if(temp != NULL && temp->index == index)
		newNode = temp->next;

	
	while(temp != NULL && temp->index != index)
	{
		prev = temp;
		temp = temp->next;
	}
	
	if(temp = NULL)
		printf("Index does not exist \n");
	
	prev->next = temp->next;
	printf("Deleted \n");
	
	return temp;
}

struct node* rep(struct node* newNode, int index, char* newText)
{
	if(newNode != NULL)
	{
		while(newNode != NULL)
		{
			if(newNode->index == index)
			{
				newNode->text = newText;
				printf("Replaced \n");
			}
			else if(newNode->index != index)
				printf("No such index \n");
			
			newNode = newNode->next;
		}
		
		return newNode;
	}
	else
		return NULL;
}

void prn(struct node* newNode)
{
	if(newNode == NULL)
	{
		printf("The list is empty. \n"); fflush(stdout);
	}
	else
	{
		printf("List: \n"); fflush(stdout);
		while(newNode != NULL)
		{
			printf("%d : %s \n", newNode->index, newNode->text); fflush(stdout);
			newNode = newNode->next;
		}
	}	
}

void end() 
{
	printf("Ending program...\n"); fflush(stdout);
	exit(0);
}
