#Name:				D'Andre Campbell
#Unix Login ID:  	dc959761@itsunix.albany.edu
#Lab Instructor: 	Chunpai Wang
#Lab: 				Monday 10:25 - 11:20


			.data		
string:		.space		80		
prompt:		.asciiz		"Enter Numbers: "
ammount:	.asciiz		"No. of integers: "
maxInt:		.asciiz		"Max Integer: "
binRep:		.asciiz		"Max Number of 1's in the binary rep: "
maxOnes:	.asciiz		"Ints of max number of 1's in binary rep: "
newline:	.asciiz		"\n"
white:		.byte		' '


			.text				
main:	#start
#print out the prompt
		la	$a0, prompt		
		li	$v0, 4
		syscall
		
#read the input str with 80 space
		la 	a0,str   		 
		li 	$a1,80
		li 	$v0,8
		syscall
		
#move str to reg $t0
		lb 		$t2,whit	
		move 	$s1,$0
		la 		$a0,str
		move 	$t0,$a0  	
		
#load first char of str into t1 reg to be analyzed
loop:	addi $t0,$t0,1
		lb $t1,0($t0)     	
    
		beqz $t1,exit
		beq $t1,$t2,count      #if ' '  branch
		beq $t1,10,count       #if '\n'  branch
		beq $t1,11,count       #if '\t'  branch
		j loop

count:	addi $s1,$s1,1
		j loop
		
		
		
#Exits program
exit:
    move $a0,$s1
    li $v0,1
    syscall

    li $v0,10    #exit
    syscall
