    AREA add1, CODE, READONLY
    ENTRY

    MOV r0, #5          ; Load 5 into register r0
    MOV r1, #6          ; Load 6 into register r1
    SUB r0, r0, #4      ; Subtract 4 from r0 (5 - 4 = 1)

    ADDEQ r2, r1, r0    ; If Zero flag (Z) is set, add r1 and r0, store result in r2
    MOV r3, #10         ; Load 10 into register r3

Back B Back              ; Infinite loop to stop the program

    END
