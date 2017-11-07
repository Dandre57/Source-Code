#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct node* insert(struct node* newNode, int index, char* newText);
struct node* ina(struct node* newNode, int index, char* newText);
struct node* inb(struct node* newNode, int index, char* newText);
struct node* del(struct node* newNode, int index);
struct node* rep(struct node* newNode, int index, char* newText);
void prn(struct node* newNode);
void end();

// List that contains text alongside each index
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
	struct node* list = NULL; 
	
	while(strcmp(command, "end") != 0) 
	{
		//look up how to split string into different parts
		
		printf("Enter your command:"); fflush(stdout);
		scanf("%s", &command);
		
		
		
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

// Creates a new list starting with the given node
struct node* insert(struct node* newNode, int index, char* newText)
{
	newNode->next =  malloc(sizeof(struct node*));
		
	newNode->next->index = index;
	newNode->next->text = newText;
	//strcpy(newNode->next->text, newText);
	
	return newNode;
}

// Inserts a new node after the given index. If the list is empty
// it inserts node at the beginning
struct node* ina(struct node* newNode, int index, char* newText)
{
	if(newNode == NULL)
	{
		//strcpy(newNode->text, newText);
		//newNode->text = strdup(newText);
		insert(newNode, index, newText);
	}
	
	while(newNode != NULL)
	{
		if(newNode->index == index)
		{
			//newNode->text = newText;
			//strcpy(newNode->text, newText);
			newNode->text = strdup(newText);
			printf("Ok \n");
		}
			
		
		newNode = newNode->next;
	}
	
	return newNode;
}

// Inserts a new node before the given index. If the list is empty
// it inserts node at the beginning
struct node* inb(struct node* newNode, int index, char* newText)
{
	if(newNode == NULL)
		insert(newNode, index, newText);
	
	while(newNode != NULL)
	{
		//newNode->text = newText;
		//strcpy(newNode->text, newText);
		newNode = newNode->next;
	}
}

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

// Traverse through the list and replaces the node at the given index
struct node* rep(struct node* newNode, int index, char* newText)
{
	if(newNode != NULL)
	{
		while(newNode != NULL)
		{
			if(newNode->index == index)
			{
				//newNode->text = newText;
				//strcpy(newNode->text, newText);
				newNode->text = strdup(newText);
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

// Prints the list. Each node is printed on a different line
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

// Ends program if this command is called. Takes no parameters
void end() 
{
	printf("Ending program...\n"); fflush(stdout);
	exit(0);
}
