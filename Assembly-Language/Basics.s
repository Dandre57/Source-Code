# A basic program (ICSI 333)
        .data
avg:    .word   
il:     .word   7
i2:     .word   68
i3:     .word   21
prompt: .asciiz "Average is: "
nl:     .byte   '\n'

        .text
_start: lw      $15, i1
        lw      $16, i2
i10:    add     $15, $15, $16
        lw      $16, i3
        add     $15, $15, $16
        li      $16, 3
        div     $15, $15, $16
i20:    sw      $15, avg
        puts    prompt
        put     avg
        putc    nl
        sw      $15, avg
        puts    prompt
        put     avg
        putc    nl
        sw      $15, avg
        la      $16, i1
        sw      $15, 0($16)
        add i3, i3, 1
        done 
