 area fibn, code, readonly
		mov r0,#10
		mov r1,#0
		mov r2,#1
		ldr r5,=result
		str r1,[r5],#4
		str r2,[r5],#4
loop 	add r3,r1,r2
		str r3,[r5],#4
		mov r1,r2
		mov r2,r3
		subs r0,r0,#1
		bne loop
done b done
 area data2,data,readwrite
result dcw 0x0000
end
		
		