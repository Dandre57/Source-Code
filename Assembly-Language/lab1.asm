addi $v0, $zero, 5
syscall
add $t0, $zero, $v0

addi $v0, $zero, 5
syscall
add $t1, $zero, $v0

ble $t0, $t1, cond1
addi $v0, $zero, 1
add $a0, $t0, $zero
syscall
cond1:

ble $t1, $t0, cond2
addi $v0, $zero, 1
add $a0, $t1, $zero
syscall
cond2:
